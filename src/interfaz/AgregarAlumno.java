/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Alumno;
import clases.Helper;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author LUCYLEONOR
 */
public class AgregarAlumno extends javax.swing.JDialog {

    /**
     * Creates new form Agregar
     */
    String ruta;
    ObjectOutputStream salida;
    ArrayList<Alumno> alumno;

    public AgregarAlumno(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        ruta = "src/datos/alumnos.txt";
        alumno = Helper.traerDatos(ruta);
        try {
            salida = new ObjectOutputStream(new FileOutputStream(ruta));
            Helper.volcado(salida, alumno);
            Helper.limpiarTabla(tblTabla);
            Helper.llenadoTabla(tblTabla, ruta);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

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
        jLabel1 = new javax.swing.JLabel();
        txtIdentificacion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPrimer_Apellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSegundo_Apellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtClase = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        cmdAgregar = new javax.swing.JButton();
        cmdEliminar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        cmdLimpiar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabla = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar Alumno");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Alumno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 0, 12))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel1.setText("Identificacion");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, -1));

        txtIdentificacion.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtIdentificacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdentificacionKeyTyped(evt);
            }
        });
        jPanel2.add(txtIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 70, -1));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel2.setText("Nombre");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        txtNombre.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 70, -1));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel3.setText("Primer Apellido");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        txtPrimer_Apellido.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtPrimer_Apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrimer_ApellidoKeyTyped(evt);
            }
        });
        jPanel2.add(txtPrimer_Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 70, -1));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel4.setText("Segundo Apellido");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        txtSegundo_Apellido.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtSegundo_Apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSegundo_ApellidoKeyTyped(evt);
            }
        });
        jPanel2.add(txtSegundo_Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 70, -1));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel5.setText("Edad");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, -1, -1));

        txtEdad.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdadKeyTyped(evt);
            }
        });
        jPanel2.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 70, -1));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel6.setText("Clase");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, -1, -1));

        txtClase.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtClase.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtClaseKeyTyped(evt);
            }
        });
        jPanel2.add(txtClase, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 70, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 380, 190));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, -1, 160));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 0, 12))); // NOI18N
        jPanel4.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdAgregar.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        cmdAgregar.setText("Agregar");
        cmdAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAgregarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 90, -1));

        cmdEliminar.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        cmdEliminar.setText("Eliminar");
        cmdEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEliminarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 90, -1));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 90, -1));

        cmdLimpiar.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 150, 90, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, 110, 200));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informacion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 0, 12))); // NOI18N
        jPanel5.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblTabla.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        tblTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Identificacion", "Nombre", "Primer Apellido", "Segundo Apellido", "Edad", "Clase"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTabla.setToolTipText("");
        tblTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTabla);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 700, 200));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 720, 230));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Grupo Folclorico.jpeg"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, -40, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 848, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAgregarActionPerformed

        String identificacion = null, nombre = null, primer_apellido = null, segundo_apellido = null, edad = null, clase = null;

        try {
            identificacion = txtIdentificacion.getText();
            nombre = txtNombre.getText();
            primer_apellido = txtPrimer_Apellido.getText();
            segundo_apellido = txtSegundo_Apellido.getText();
            edad = txtEdad.getText();
            clase = txtClase.getText();
        } catch (Exception e) {
            Helper.mensaje(this, "Por favor digite datos correctos", "Error", 2);
        }

        if (txtIdentificacion.getText().isEmpty() || txtClase.getText().isEmpty() || txtEdad.getText().isEmpty() || txtNombre.getText().isEmpty() || txtPrimer_Apellido.getText().isEmpty() || txtSegundo_Apellido.getText().isEmpty()) {
            Helper.mensaje(this, "No puede dejar campos vacios", "Error", 2);
        } else {

            Alumno a = new Alumno(identificacion, nombre, primer_apellido, segundo_apellido, edad, clase);

            try {
                a.guardar(salida);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
            Helper.llenadoTabla(tblTabla, ruta);
            txtIdentificacion.setText("");
            txtClase.setText("");
            txtEdad.setText("");
            txtNombre.setText("");
            txtPrimer_Apellido.setText("");
            txtSegundo_Apellido.setText("");
            txtNombre.requestFocusInWindow();
        }
    }//GEN-LAST:event_cmdAgregarActionPerformed

    private void cmdEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEliminarActionPerformed
        // TODO add your handling code here:
        int i, op;

        op = JOptionPane.showConfirmDialog(this, "¿Seguro que desea eliminar?", "Eliminar", JOptionPane.YES_NO_OPTION);

        if (op == JOptionPane.YES_OPTION) {

            try {
                i = tblTabla.getSelectedRow();
                alumno.remove(i);
                salida = new ObjectOutputStream(new FileOutputStream(ruta));
                Helper.volcado(salida, alumno);
                Helper.llenadoTabla(tblTabla, ruta);
                txtClase.setText("");
                txtEdad.setText("");
                txtIdentificacion.setText("");
                txtNombre.setText("");
                txtPrimer_Apellido.setText("");
                txtSegundo_Apellido.setText("");
                txtIdentificacion.requestFocusInWindow();
            } catch (FileNotFoundException ex) {
                System.out.println(ex.getMessage());
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_cmdEliminarActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if (!Character.isAlphabetic(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtPrimer_ApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrimer_ApellidoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if (!Character.isAlphabetic(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtPrimer_ApellidoKeyTyped

    private void txtSegundo_ApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSegundo_ApellidoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if (!Character.isAlphabetic(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtSegundo_ApellidoKeyTyped

    private void txtClaseKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClaseKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if (!Character.isAlphabetic(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtClaseKeyTyped

    private void txtIdentificacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdentificacionKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtIdentificacionKeyTyped

    private void txtEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtEdadKeyTyped

    private void tblTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTablaMouseClicked
        // TODO add your handling code here:
        Alumno p;
        int i;
        alumno = Helper.traerDatos(ruta);
        i = tblTabla.getSelectedRow();
        p = alumno.get(i);

        txtClase.setText(p.getClase());
        txtNombre.setText(p.getNombre());
        txtIdentificacion.setText(p.getIdentificacion());
        txtEdad.setText(p.getEdad());
        txtPrimer_Apellido.setText(p.getPrimer_apellido());
        txtSegundo_Apellido.setText(p.getSegundo_apellido());
    }//GEN-LAST:event_tblTablaMouseClicked

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
        txtClase.setText("");
        txtNombre.setText("");
        txtIdentificacion.setText("");
        txtEdad.setText("");
        txtPrimer_Apellido.setText("");
        txtSegundo_Apellido.setText("");
        txtNombre.requestFocusInWindow();

    }//GEN-LAST:event_cmdLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AgregarAlumno dialog = new AgregarAlumno(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdAgregar;
    private javax.swing.JButton cmdEliminar;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblTabla;
    private javax.swing.JTextField txtClase;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrimer_Apellido;
    private javax.swing.JTextField txtSegundo_Apellido;
    // End of variables declaration//GEN-END:variables
}
