/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p23;

/**
 *
 * @author 18PROGB0163
 */
public class FrmInicio extends javax.swing.JFrame {

    /**
     * Creates new form FrmInicio
     */
    public FrmInicio() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblCuadro = new javax.swing.JLabel();
        lblCirculo = new javax.swing.JLabel();
        lblTriangulo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCu = new javax.swing.JTextPane();
        lblCu = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtTrAL = new javax.swing.JTextPane();
        lblATr = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtTrBase = new javax.swing.JTextPane();
        jLabel7 = new javax.swing.JLabel();
        lblRa = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtCi = new javax.swing.JTextPane();
        lblACi = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txDi1r = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtDi2r = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblARo = new javax.swing.JLabel();
        btnCi = new javax.swing.JButton();
        btnRo = new javax.swing.JButton();
        btnCu = new javax.swing.JButton();
        btnTr = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitulo.setText("Área de figuras geometricas.");

        lblCuadro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCuadro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cuadro.jpg"))); // NOI18N

        lblCirculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/circulo.png"))); // NOI18N

        lblTriangulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTriangulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/triangulo.jpg"))); // NOI18N

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/circulo.jpg"))); // NOI18N

        jScrollPane1.setViewportView(txtCu);

        lblCu.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lblCu.setText("ÁREA");

        jScrollPane2.setViewportView(txtTrAL);

        lblATr.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lblATr.setText("ÁREA");

        jLabel4.setText("Lado");

        jLabel5.setText("Altura");

        jScrollPane3.setViewportView(txtTrBase);

        jLabel7.setText("Base");

        lblRa.setText("Radio");

        jScrollPane4.setViewportView(txtCi);

        lblACi.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lblACi.setText("ÁREA");

        jScrollPane5.setViewportView(txDi1r);

        jScrollPane6.setViewportView(txtDi2r);

        jLabel1.setText("Diagonal 1");

        jLabel3.setText("Diagonal 2");

        lblARo.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lblARo.setText("ÁREA");

        btnCi.setText("Calcular");
        btnCi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCiActionPerformed(evt);
            }
        });

        btnRo.setText("Calcular");
        btnRo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRoActionPerformed(evt);
            }
        });

        btnCu.setText("Calcular");
        btnCu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuActionPerformed(evt);
            }
        });

        btnTr.setText("Calcular");
        btnTr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCuadro, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(lblCu))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel7)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnTr)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCu)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCirculo)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(lblATr)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lblRa))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblACi)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                                .addComponent(jScrollPane6))
                            .addComponent(lblARo)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCi))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRo)))
                .addGap(108, 108, 108))
            .addGroup(layout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(lblTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblTitulo)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(btnCu)
                        .addGap(18, 18, 18)
                        .addComponent(lblCu)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblCuadro, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCirculo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(lblRa)
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCi)
                        .addGap(20, 20, 20)
                        .addComponent(lblACi)))
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRo))
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblARo)
                        .addGap(14, 14, 14))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(15, 15, 15)
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(13, 13, 13)
                            .addComponent(btnTr)
                            .addGap(18, 18, 18)
                            .addComponent(lblATr))
                        .addComponent(lblTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuActionPerformed
       try {
           double lado = Double.parseDouble(txtCu.getText());
           lblCu.setText(String.valueOf(Math.pow( lado, 2)));
           txtCu.setText("");
       } catch (NumberFormatException ex) {
           JOptionPane.showMessageDialog(null, "Error, debes ingresar un valor");
           System.out.println(ex.toString());
           
       }
    }//GEN-LAST:event_btnCuActionPerformed

    private void btnTrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrActionPerformed
       try {
          double base = Double.parseDouble(txtTrBase.getText());
          double altura = Double.parseDouble(txtTrAL.getText());
        lblATr.setText(String.valueOf(base*altura /2));
        txtTrBase.setText("");
        txtTrAL.setText("");
        
       } catch (NumberFormatException ex) {
           JOptionPane.showMessageDialog(null, "Error, debes ingresar un valor");
           System.out.println(ex.toString());
           
       }
    }//GEN-LAST:event_btnTrActionPerformed

    private void btnCiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCiActionPerformed
     try {
         double radio = Double.parseDouble(txtCi.getText()); 
         lblACi.setText(String.valueOf(3.1416*(radio*radio)));
         txtCi.setText("");
           
     } catch (NumberFormatException ex) {
           JOptionPane.showMessageDialog(null, "Error, debes ingresar un valor");
           System.out.println(ex.toString());
       }
    }//GEN-LAST:event_btnCiActionPerformed

    private void btnRoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRoActionPerformed
       try {
           double d1 = Double.parseDouble(txDi1r.getText());
           double d2 = Double.parseDouble(txtDi2r.getText());
           lblARo.setText(String.valueOf((d1*d2)/2));
           txDi1r.setText("");
           txtDi2r.setText("");
       }catch (NumberFormatException ex) {
           JOptionPane.showMessageDialog(null, "Error, debes ingresar un valor");
           System.out.println(ex.toString());
    }//GEN-LAST:event_btnRoActionPerformed
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCi;
    private javax.swing.JButton btnCu;
    private javax.swing.JButton btnRo;
    private javax.swing.JButton btnTr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel lblACi;
    private javax.swing.JLabel lblARo;
    private javax.swing.JLabel lblATr;
    private javax.swing.JLabel lblCirculo;
    private javax.swing.JLabel lblCu;
    private javax.swing.JLabel lblCuadro;
    private javax.swing.JLabel lblRa;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTriangulo;
    private javax.swing.JTextPane txDi1r;
    private javax.swing.JTextPane txtCi;
    private javax.swing.JTextPane txtCu;
    private javax.swing.JTextPane txtDi2r;
    private javax.swing.JTextPane txtTrAL;
    private javax.swing.JTextPane txtTrBase;
    // End of variables declaration//GEN-END:variables
}
