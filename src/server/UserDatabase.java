/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class UserDatabase {
    private Connection conn;
    public final String DATABASE_NAME = "chat_db";
    public final String USERNAME = "root";
    public final String PASSWORD = "123456";
    public final String URL_MYSQL = "jdbc:mysql://localhost:3306/"+DATABASE_NAME;

    public final String USER_TABLE = "user_tb";

    private PreparedStatement pst;
    private ResultSet rs;
    private Statement st;


    public Connection connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");     //Loading class `com.mysql.jdbc.Driver'. This is deprecated. The new driver class is `com.mysql.cj.jdbc.Driver'. The driver is automatically registered via the SPI and manual loading of the driver class is generally unnecessary.
            conn = DriverManager.getConnection(URL_MYSQL, USERNAME, PASSWORD);
            System.out.println("Connect successfull");
        } catch (SQLException ex) {
            Logger.getLogger(UserDatabase.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error connection! Lỗi kết nối nhé!");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }



    public ResultSet getData() {
        try {
            st = conn.createStatement(); //tạo đối tượng Statement để tương tác với CSDL
            rs = st.executeQuery("SELECT * FROM "+USER_TABLE);
        } catch (SQLException ex) {
            Logger.getLogger(UserDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }

        return rs;
    }

    private void showData() {
        rs = getData();
        try {
            while(rs.next()) {
                System.out.printf("%-15s %-4s", rs.getString(1), rs.getString(2));
                System.out.println("");
            }

        } catch (SQLException ex) {
            Logger.getLogger(UserDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int insertUser(User u) {
        System.out.println("Before: name = "+u.name+" - pass = "+u.pass);
        try {
            pst = conn.prepareCall("INSERT INTO "+USER_TABLE+" VALUES ('"+u.name+"', '"+u.pass+"')");
            int kq = pst.executeUpdate();
            if(kq > 0) System.out.println("Insert successful!");
            System.out.println("After: name = "+u.name+" - pass = "+u.pass);
            return kq;
//            System.out.println("[LỖI!] primary key '"+u.name+"' đã tồn tại, ko thểm thêm bản ghi này!");
        } catch (SQLException ex) {
            Logger.getLogger(UserDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }



    public int checkUser(String name, String pass) {    //return 1 = account is correct
        try {
            pst = conn.prepareStatement("SELECT * FROM "+USER_TABLE+" WHERE name = '" + name + "' AND pass = '" + pass +"'");
            rs = pst.executeQuery();

            if(rs.first()) {
                //user and pass is correct:
                return 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDatabase.class.getName()).log(Level.SEVERE, null, ex);

        }
        return 0;
    }



}
