/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.*;


public class RoomPanel extends javax.swing.JPanel {

    /**
     * Creates new form RoomPanel
     */
    public RoomPanel() {
        initComponents();
    }

    public JLabel getLbRoom1() {
        return lbRoom1;
    }

    public JLabel getLbRoom2() {
        return lbRoom2;
    }

    public JLabel getLbRoom3() {
        return lbRoom3;
    }

    public JLabel getLbRoom4() {
        return lbRoom4;
    }

    public JLabel getLbRoom5() {
        return lbRoom5;
    }

    public JLabel getLbRoom6() {
        return lbRoom6;
    }

    public JLabel getLbRoom7() {
        return lbRoom7;
    }

    public JLabel getLbRoom8() {
        return lbRoom8;
    }
    
    public JList<String> getOnlineList_rp() {
        return onlineList_rp;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbRoom1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbRoom3 = new javax.swing.JLabel();
        lbRoom2 = new javax.swing.JLabel();
        lbRoom4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        onlineList_rp = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        lbRoom5 = new javax.swing.JLabel();
        lbRoom6 = new javax.swing.JLabel();
        lbRoom7 = new javax.swing.JLabel();
        lbRoom8 = new javax.swing.JLabel();

        lbRoom1.setBackground(new java.awt.Color(51, 255, 0));
        lbRoom1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lbRoom1.setForeground(new java.awt.Color(0, 102, 255));
        lbRoom1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbRoom1.setText("Room 1");
        lbRoom1.setOpaque(true);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 219, 0));
        jLabel2.setText("Choose room");

        lbRoom3.setBackground(new java.awt.Color(0, 255, 0));
        lbRoom3.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lbRoom3.setForeground(new java.awt.Color(0, 102, 255));
        lbRoom3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbRoom3.setText("Room 3");
        lbRoom3.setOpaque(true);

        lbRoom2.setBackground(new java.awt.Color(0, 255, 0));
        lbRoom2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lbRoom2.setForeground(new java.awt.Color(0, 102, 255));
        lbRoom2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbRoom2.setText("Room 2");
        lbRoom2.setOpaque(true);

        lbRoom4.setBackground(new java.awt.Color(51, 255, 0));
        lbRoom4.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lbRoom4.setForeground(new java.awt.Color(0, 102, 255));
        lbRoom4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbRoom4.setText("Room 4");
        lbRoom4.setOpaque(true);

        onlineList_rp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        onlineList_rp.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        onlineList_rp.setToolTipText("double-click to send a message");
        jScrollPane1.setViewportView(onlineList_rp);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Online");
        jLabel1.setToolTipText("");

        lbRoom5.setBackground(new java.awt.Color(51, 255, 0));
        lbRoom5.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lbRoom5.setForeground(new java.awt.Color(0, 102, 255));
        lbRoom5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbRoom5.setText("Room 5");
        lbRoom5.setOpaque(true);

        lbRoom6.setBackground(new java.awt.Color(51, 255, 0));
        lbRoom6.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lbRoom6.setForeground(new java.awt.Color(0, 102, 255));
        lbRoom6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbRoom6.setText("Room 6");
        lbRoom6.setOpaque(true);

        lbRoom7.setBackground(new java.awt.Color(51, 255, 0));
        lbRoom7.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lbRoom7.setForeground(new java.awt.Color(0, 102, 255));
        lbRoom7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbRoom7.setText("Room 7");
        lbRoom7.setOpaque(true);

        lbRoom8.setBackground(new java.awt.Color(51, 255, 0));
        lbRoom8.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lbRoom8.setForeground(new java.awt.Color(0, 102, 255));
        lbRoom8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbRoom8.setText("Room 8");
        lbRoom8.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbRoom7, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbRoom3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbRoom1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbRoom5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbRoom4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbRoom2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbRoom6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbRoom8, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(105, 105, 105)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel2)
                .addGap(164, 164, 164)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbRoom1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbRoom2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbRoom3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbRoom4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbRoom6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbRoom5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbRoom8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbRoom7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addContainerGap(43, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    //onlineList_rp = onlineList ở RoomPanel, để phân biệt với onlineList ở ClientPanel
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbRoom1;
    private javax.swing.JLabel lbRoom2;
    private javax.swing.JLabel lbRoom3;
    private javax.swing.JLabel lbRoom4;
    private javax.swing.JLabel lbRoom5;
    private javax.swing.JLabel lbRoom6;
    private javax.swing.JLabel lbRoom7;
    private javax.swing.JLabel lbRoom8;
    private javax.swing.JList<String> onlineList_rp;
    // End of variables declaration//GEN-END:variables
}
