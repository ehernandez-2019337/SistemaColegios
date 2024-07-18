/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package org.emersonhernandez.vista;
import org.emersonhernandez.controlador.ControlDeCursos;
import org.emersonhernandez.modelo.Cursos;
/**
 *
 * @author emerh
 */
public class VistaAgregarCursos extends javax.swing.JInternalFrame {
public static ControlDeCursos controlCursos = ControlDeCursos.getInstancia();
    /**
     * Creates new form VistaAgregarCursos
     */
    public VistaAgregarCursos() {
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
        lblIdAgregarCurso = new javax.swing.JLabel();
        txtIdAgregarCurso = new javax.swing.JTextField();
        lblNombreAgregarCurso = new javax.swing.JLabel();
        txtNombreAgregarCurso = new javax.swing.JTextField();
        lblProfesorAgregarCurso = new javax.swing.JLabel();
        txtProfesorAgregarCurso = new javax.swing.JTextField();
        lblCarreraAgregarCUrso = new javax.swing.JLabel();
        txtCarreraAgregarCUrso = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        botonCancelarAgregarCUrso = new javax.swing.JButton();
        botonAceptarAgregarAlumno = new javax.swing.JButton();

        lblIdAgregarCurso.setText("Id Curso");

        lblNombreAgregarCurso.setText("Nombre Curso");

        lblProfesorAgregarCurso.setText("Profesor Curso");

        lblCarreraAgregarCUrso.setText("Carrera Curso");

        botonCancelarAgregarCUrso.setText("Cancelar");
        botonCancelarAgregarCUrso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarAgregarCUrsoActionPerformed(evt);
            }
        });

        botonAceptarAgregarAlumno.setText("Aceptar");
        botonAceptarAgregarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarAgregarAlumnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIdAgregarCurso)
                            .addComponent(lblNombreAgregarCurso)
                            .addComponent(lblProfesorAgregarCurso)
                            .addComponent(lblCarreraAgregarCUrso))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombreAgregarCurso)
                            .addComponent(txtIdAgregarCurso)
                            .addComponent(txtProfesorAgregarCurso)
                            .addComponent(txtCarreraAgregarCUrso, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))))
                .addGap(67, 67, 67))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(botonAceptarAgregarAlumno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addComponent(botonCancelarAgregarCUrso)
                .addGap(38, 38, 38))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lblIdAgregarCurso)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombreAgregarCurso)
                            .addComponent(txtNombreAgregarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtIdAgregarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProfesorAgregarCurso)
                    .addComponent(txtProfesorAgregarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCarreraAgregarCUrso, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCarreraAgregarCUrso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCancelarAgregarCUrso)
                    .addComponent(botonAceptarAgregarAlumno))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCancelarAgregarCUrsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarAgregarCUrsoActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_botonCancelarAgregarCUrsoActionPerformed

    private void botonAceptarAgregarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarAgregarAlumnoActionPerformed
        // TODO add your handling code here:
        Cursos micurso= new Cursos();      
        micurso.setId(Integer.parseInt(txtIdAgregarCurso.getText()));
        micurso.setNombre(txtNombreAgregarCurso.getText());
        micurso.setProfesor(txtProfesorAgregarCurso.getText()); 
        micurso.setCarrera(txtCarreraAgregarCUrso.getText()); 

        controlCursos.agregarCurso(micurso); 

        this.setVisible(false);
        txtIdAgregarCurso.setText("");
        txtNombreAgregarCurso.setText("");
        txtProfesorAgregarCurso.setText("");
        txtCarreraAgregarCUrso.setText("");
    }//GEN-LAST:event_botonAceptarAgregarAlumnoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptarAgregarAlumno;
    private javax.swing.JButton botonCancelarAgregarCUrso;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCarreraAgregarCUrso;
    private javax.swing.JLabel lblIdAgregarCurso;
    private javax.swing.JLabel lblNombreAgregarCurso;
    private javax.swing.JLabel lblProfesorAgregarCurso;
    private javax.swing.JTextField txtCarreraAgregarCUrso;
    private javax.swing.JTextField txtIdAgregarCurso;
    private javax.swing.JTextField txtNombreAgregarCurso;
    private javax.swing.JTextField txtProfesorAgregarCurso;
    // End of variables declaration//GEN-END:variables
}
