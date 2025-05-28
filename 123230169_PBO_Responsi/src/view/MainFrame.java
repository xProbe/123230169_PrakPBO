
package view;

import controller.PenginapanController;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;

public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        initComponents();
        dc = new PenginapanController(this);
        dc.isitabel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton3Bulan = new javax.swing.JRadioButton();
        jRadioButton6Bulan = new javax.swing.JRadioButton();
        jRadioButton12Bulan = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTabel = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldNama = new javax.swing.JTextField();
        jRadioButtonTV = new javax.swing.JRadioButton();
        jRadioButtonKulkas = new javax.swing.JRadioButton();
        jRadioButtonMesinCuci = new javax.swing.JRadioButton();
        jButtonSimpan = new javax.swing.JButton();
        jButtonEdit = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nama Customer");

        jLabel2.setText("Toko Elektronik");

        jRadioButton3Bulan.setText("3 bulan");
        jRadioButton3Bulan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3BulanActionPerformed(evt);
            }
        });

        jRadioButton6Bulan.setText("6 bulan");

        jRadioButton12Bulan.setText("12 bulan");

        jTableTabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableTabel);

        jLabel3.setText("Cicilan");

        jLabel4.setText("Barang");

        jTextFieldNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNamaActionPerformed(evt);
            }
        });

        jRadioButtonTV.setText("Television");
        jRadioButtonTV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonTVActionPerformed(evt);
            }
        });

        jRadioButtonKulkas.setText("Kulkas");
        jRadioButtonKulkas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonKulkasActionPerformed(evt);
            }
        });

        jRadioButtonMesinCuci.setText("Mesin Cuci");

        jButtonSimpan.setText("Create");
        jButtonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSimpanActionPerformed(evt);
            }
        });

        jButtonEdit.setText("Edit");
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });

        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jButtonSimpan)))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonEdit)
                                .addGap(28, 28, 28)
                                .addComponent(jButtonDelete))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton12Bulan)
                                    .addComponent(jRadioButton3Bulan)
                                    .addComponent(jRadioButton6Bulan)
                                    .addComponent(jRadioButtonTV))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButtonKulkas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButtonMesinCuci))
                            .addComponent(jTextFieldNama))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel2)
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jRadioButtonTV)
                            .addComponent(jRadioButtonKulkas)
                            .addComponent(jRadioButtonMesinCuci))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jRadioButton12Bulan))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton3Bulan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton6Bulan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSimpan)
                            .addComponent(jButtonEdit)
                            .addComponent(jButtonDelete))))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton3BulanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3BulanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3BulanActionPerformed

    private void jTextFieldNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNamaActionPerformed

    private void jRadioButtonTVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonTVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonTVActionPerformed

    private void jRadioButtonKulkasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonKulkasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonKulkasActionPerformed

    private void jButtonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSimpanActionPerformed
        dc.insert();
        dc.isitabel();
    }//GEN-LAST:event_jButtonSimpanActionPerformed

    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
        dc.update();
        dc.isitabel();
    }//GEN-LAST:event_jButtonEditActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        dc.delete();
        dc.isitabel();
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonSimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jRadioButton12Bulan;
    private javax.swing.JRadioButton jRadioButton3Bulan;
    private javax.swing.JRadioButton jRadioButton6Bulan;
    private javax.swing.JRadioButton jRadioButtonKulkas;
    private javax.swing.JRadioButton jRadioButtonMesinCuci;
    private javax.swing.JRadioButton jRadioButtonTV;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTabel;
    private javax.swing.JTextField jTextFieldNama;
    // End of variables declaration//GEN-END:variables

    public JRadioButton getjRadioButton12Bulan() {
        return jRadioButton12Bulan;
    }

    public void setjRadioButton12Bulan(JRadioButton jRadioButton12Bulan) {
        this.jRadioButton12Bulan = jRadioButton12Bulan;
    }

    public JRadioButton getjRadioButton3Bulan() {
        return jRadioButton3Bulan;
    }

    public void setjRadioButton3Bulan(JRadioButton jRadioButton3Bulan) {
        this.jRadioButton3Bulan = jRadioButton3Bulan;
    }

    public JRadioButton getjRadioButton6Bulan() {
        return jRadioButton6Bulan;
    }

    public void setjRadioButton6Bulan(JRadioButton jRadioButton6Bulan) {
        this.jRadioButton6Bulan = jRadioButton6Bulan;
    }

    public JRadioButton getjRadioButtonKulkas() {
        return jRadioButtonKulkas;
    }

    public void setjRadioButtonKulkas(JRadioButton jRadioButtonKulkas) {
        this.jRadioButtonKulkas = jRadioButtonKulkas;
    }

    public JRadioButton getjRadioButtonMesinCuci() {
        return jRadioButtonMesinCuci;
    }

    public void setjRadioButtonMesinCuci(JRadioButton jRadioButtonMesinCuci) {
        this.jRadioButtonMesinCuci = jRadioButtonMesinCuci;
    }

    public JRadioButton getjRadioButtonTV() {
        return jRadioButtonTV;
    }

    public void setjRadioButtonTV(JRadioButton jRadioButtonTV) {
        this.jRadioButtonTV = jRadioButtonTV;
    }

    public JTable getjTableTabel() {
        return jTableTabel;
    }

    public void setjTableTabel(JTable jTableTabel) {
        this.jTableTabel = jTableTabel;
    }

    public JTextField getjTextFieldNama() {
        return jTextFieldNama;
    }

    public void setjTextFieldNama(JTextField jTextFieldNama) {
        this.jTextFieldNama = jTextFieldNama;
    }
    
    

}
