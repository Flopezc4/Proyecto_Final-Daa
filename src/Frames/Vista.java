package Frames;

import javax.swing.ImageIcon;


public class Vista extends javax.swing.JFrame {

    public Vista() {
        this.setIconImage(new ImageIcon(getClass().getResource("/XIconos/BestBuysoloicono.jpg")).getImage());
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JtextCodigoProducto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnAgregarProducto = new javax.swing.JButton();
        btn_todo = new javax.swing.JButton();
        JtextDescripcionProducto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnEliminarProducto = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablacompras = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JtextCodigoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtextCodigoProductoActionPerformed(evt);
            }
        });
        getContentPane().add(JtextCodigoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 22, 140, -1));

        jLabel1.setText("Producto");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 25, 63, -1));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/XIconos/buscar.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 11, 78, -1));

        btnAgregarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/XIconos/agregar.png"))); // NOI18N
        btnAgregarProducto.setEnabled(false);
        getContentPane().add(btnAgregarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 11, 78, -1));

        btn_todo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/XIconos/optimizar.png"))); // NOI18N
        getContentPane().add(btn_todo, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 552, 74, -1));

        JtextDescripcionProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtextDescripcionProductoActionPerformed(evt);
            }
        });
        getContentPane().add(JtextDescripcionProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 48, 270, -1));

        jLabel2.setText("Descripcion");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 51, 70, -1));

        btnEliminarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/XIconos/borrar.png"))); // NOI18N
        btnEliminarProducto.setEnabled(false);
        getContentPane().add(btnEliminarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(598, 11, 85, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/XIconos/prov1.png"))); // NOI18N
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 123, 86, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/XIconos/prov2.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 214, 86, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/XIconos/prov3.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 305, 86, -1));

        btn_modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/XIconos/prov4.png"))); // NOI18N
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 396, 86, -1));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/XIconos/monto.png"))); // NOI18N
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(598, 552, 74, -1));

        tablacompras.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablacompras);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 102, 560, 482));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JtextCodigoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtextCodigoProductoActionPerformed

    }//GEN-LAST:event_JtextCodigoProductoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void JtextDescripcionProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtextDescripcionProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtextDescripcionProductoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
       
    }//GEN-LAST:event_btn_modificarActionPerformed


/*    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

   
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }
*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField JtextCodigoProducto;
    public javax.swing.JTextField JtextDescripcionProducto;
    public javax.swing.JButton btnAgregarProducto;
    public javax.swing.JButton btnBuscar;
    public javax.swing.JButton btnEliminarProducto;
    public javax.swing.JButton btn_modificar;
    public javax.swing.JButton btn_todo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tablacompras;
    // End of variables declaration//GEN-END:variables
}
