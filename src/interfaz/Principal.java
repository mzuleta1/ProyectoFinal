/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import javax.swing.UIManager;

/**
 *
 * @author LUCYLEONOR
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MnReporte = new javax.swing.JMenu();
        MnAlumno = new javax.swing.JMenuItem();
        MnInstrumento = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        MnAgregar = new javax.swing.JMenu();
        MnAgregarAlumno = new javax.swing.JMenuItem();
        MnAgregarInstrumento = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        MnSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Caribbean To World");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(604, 436, -1, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 614, -1));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Instrumentos.jpeg"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 370));

        jMenu1.setText("Archivo");

        MnReporte.setText("Reporte");

        MnAlumno.setText("Alumno");
        MnReporte.add(MnAlumno);

        MnInstrumento.setText("Instrumento");
        MnReporte.add(MnInstrumento);

        jMenu1.add(MnReporte);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Opciones");

        MnAgregar.setText("Agregar");

        MnAgregarAlumno.setText("Alumno");
        MnAgregarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnAgregarAlumnoActionPerformed(evt);
            }
        });
        MnAgregar.add(MnAgregarAlumno);

        MnAgregarInstrumento.setText("Instrumento");
        MnAgregarInstrumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnAgregarInstrumentoActionPerformed(evt);
            }
        });
        MnAgregar.add(MnAgregarInstrumento);

        jMenu2.add(MnAgregar);
        jMenu2.add(jSeparator1);

        MnSalir.setText("Salir");
        MnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnSalirActionPerformed(evt);
            }
        });
        jMenu2.add(MnSalir);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(615, 428));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MnAgregarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnAgregarAlumnoActionPerformed

       AgregarAlumno a = new AgregarAlumno(this, true);
       a.setVisible(true);
       
    }//GEN-LAST:event_MnAgregarAlumnoActionPerformed

    private void MnAgregarInstrumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnAgregarInstrumentoActionPerformed

        AgregarInstrumento i = new AgregarInstrumento(this, true);
        i.setVisible(true);
    }//GEN-LAST:event_MnAgregarInstrumentoActionPerformed

    private void MnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_MnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MnAgregar;
    private javax.swing.JMenuItem MnAgregarAlumno;
    private javax.swing.JMenuItem MnAgregarInstrumento;
    private javax.swing.JMenuItem MnAlumno;
    private javax.swing.JMenuItem MnInstrumento;
    private javax.swing.JMenu MnReporte;
    private javax.swing.JMenuItem MnSalir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
