/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.emersonhernandez.vista;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JInternalFrame;


/**
 *
 * @author Emerson
 */
public class VistaCole extends javax.swing.JFrame {
    Dimension tamanioPantalla = new Dimension();
    private static VistaAgregarAlumno instanciaAgregarAlumno = null;
    private static VistaVerAlumno instanciaVerAlumno = null;
    private static BorrarAlumno instanciaBorrarAlumno = null;
    private static ActulizarAlumnos instanciaActualizarAlumnos = null;
    private static VistaAgregarProfesor instanciaAgregarProfesor = null;
    private static VerProfesor instanciaVerProfesor = null;
    private static VistaEliminarProfesor instanciaEliminarProfesor = null;
    private static VistaActualizarProfesor instanciaActualizarProfesor = null;
    private static VistaAgregarCursos instanciaAgregarCursos = null;
    private static VistaVerCursos instanciaVerCursos= null;
    private static VistaEliminarCurso instanciaEliminarCurso = null;
    private static VistaActualizarCurso instanciaActualizarCurso = null;
    private static VistaAgregarCarrera instanciaAgregarCarrera = null;
    private static VistaVerCarrera instanciaVerCarrera = null;
    private static VistaEliminarCarrera instanciaEliminarCarrera = null;
    private static VistaActualizarCarrera instanciaActualizarCarrera = null;
    
    /**
     * Creates new form VistaCole
     */
    public VistaCole() {
        //lookAndFeel();
        tamanioPantalla = Toolkit.getDefaultToolkit().getScreenSize();
        initComponents();
        this.setSize(tamanioPantalla);
        
    }
    
    private synchronized JInternalFrame getInstanciaAgregarAlumno(){
        if(instanciaAgregarAlumno == null ){
            instanciaAgregarAlumno = new VistaAgregarAlumno();
            panelDeEscritorio.add(instanciaAgregarAlumno);
        }
        else if(instanciaAgregarAlumno.isVisible()==false)
            instanciaAgregarAlumno.setVisible(true);
           
         instanciaAgregarAlumno.show();
         return instanciaAgregarAlumno;
    }    
    
    private synchronized JInternalFrame getInstanciaVerAlumno(){
        if(instanciaVerAlumno == null ){
            instanciaVerAlumno = new VistaVerAlumno();
            panelDeEscritorio.add(instanciaVerAlumno);
        }
        else if(instanciaVerAlumno.isVisible()==false)
            instanciaVerAlumno.setVisible(true);
            
        
         instanciaVerAlumno.show();
         return instanciaVerAlumno;
    }    
private synchronized JInternalFrame getInstanciaBorrar(){
        if(instanciaBorrarAlumno == null ){
            instanciaBorrarAlumno = new BorrarAlumno();
            panelDeEscritorio.add(instanciaBorrarAlumno);
        }
        else if(instanciaBorrarAlumno.isVisible()==false)
            instanciaBorrarAlumno.setVisible(true);
            
        
         instanciaBorrarAlumno.show();
         return instanciaBorrarAlumno;
    }
private synchronized JInternalFrame getInstanciaActualizarAlumnos(){
        if(instanciaActualizarAlumnos == null ){
            instanciaActualizarAlumnos = new ActulizarAlumnos();
            panelDeEscritorio.add(instanciaActualizarAlumnos);
        }
        else if(instanciaActualizarAlumnos.isVisible()==false)
            instanciaActualizarAlumnos.setVisible(true);
            
        
         instanciaActualizarAlumnos.show();
         return instanciaActualizarAlumnos;
    }
    
      private synchronized JInternalFrame getInstanciaAgregarProfesor(){
        if(instanciaAgregarProfesor == null ){
            instanciaAgregarProfesor = new VistaAgregarProfesor();
            panelDeEscritorio.add(instanciaAgregarProfesor);
        }
        else if(instanciaAgregarProfesor.isVisible()==false)
            instanciaAgregarProfesor.setVisible(true);
           
         instanciaAgregarProfesor.show();
         return instanciaAgregarProfesor;
    } 
      private synchronized JInternalFrame getInstanciaVerProfesor(){
        if(instanciaVerProfesor== null ){
            instanciaVerProfesor = new VerProfesor();
            panelDeEscritorio.add(instanciaVerProfesor);
        }
        else if(instanciaVerProfesor.isVisible()==false)
            instanciaVerProfesor.setVisible(true);
           
         instanciaVerProfesor.show();
         return instanciaVerProfesor;
    }    
      private synchronized JInternalFrame getInstanciaEliminarProfesor(){
        if(instanciaEliminarProfesor == null ){
            instanciaEliminarProfesor = new VistaEliminarProfesor();
            panelDeEscritorio.add(instanciaEliminarProfesor);
        }
        else if(instanciaEliminarProfesor.isVisible()==false)
            instanciaEliminarProfesor.setVisible(true);
            
        
         instanciaEliminarProfesor.show();
         return instanciaEliminarProfesor;
    }
      
     private synchronized JInternalFrame getInstanciaActualizarProfesor(){
        if(instanciaActualizarProfesor == null ){
            instanciaActualizarProfesor = new VistaActualizarProfesor();
            panelDeEscritorio.add(instanciaActualizarProfesor);
        }
        else if(instanciaActualizarProfesor.isVisible()==false)
            instanciaActualizarProfesor.setVisible(true);
            
        
         instanciaActualizarProfesor.show();
         return instanciaActualizarProfesor;
    }  
    
      private synchronized JInternalFrame getInstanciaAgregarCursos(){
        if(instanciaAgregarCursos == null ){
            instanciaAgregarCursos = new VistaAgregarCursos();
            panelDeEscritorio.add(instanciaAgregarCursos);
        }
        else if(instanciaAgregarCursos.isVisible()==false)
            instanciaAgregarCursos.setVisible(true);
           
         instanciaAgregarCursos.show();
         return instanciaAgregarCursos;
    }
      
      private synchronized JInternalFrame getInstanciaAgregarCusos(){
        if(instanciaVerCursos == null ){
            instanciaVerCursos = new VistaVerCursos();
            panelDeEscritorio.add(instanciaVerCursos);
        }
        else if(instanciaVerCursos.isVisible()==false)
            instanciaVerCursos.setVisible(true);
           
         instanciaVerCursos.show();
         return instanciaVerCursos;
    }
      
      private synchronized JInternalFrame getInstanciaEliminarCurso(){
        if(instanciaEliminarCurso == null ){
            instanciaEliminarCurso = new VistaEliminarCurso();
            panelDeEscritorio.add(instanciaEliminarCurso);
        }
        else if(instanciaEliminarCurso.isVisible()==false)
            instanciaEliminarCurso.setVisible(true);
           
         instanciaEliminarCurso.show();
         return instanciaEliminarCurso;
    }
      
     private synchronized JInternalFrame getInstanciaActualizarCurso(){
        if(instanciaActualizarCurso == null ){
            instanciaActualizarCurso = new VistaActualizarCurso();
            panelDeEscritorio.add(instanciaActualizarCurso);
        }
        else if(instanciaActualizarCurso.isVisible()==false)
            instanciaActualizarCurso.setVisible(true);
           
         instanciaActualizarCurso.show();
         return instanciaActualizarCurso;
    }
     private synchronized JInternalFrame getInstanciaAgregarCarrera(){
        if(instanciaAgregarCarrera == null ){
            instanciaAgregarCarrera = new VistaAgregarCarrera();
            panelDeEscritorio.add(instanciaAgregarCarrera);
        }
        else if(instanciaAgregarCarrera.isVisible()==false)
            instanciaAgregarCarrera.setVisible(true);
           
         instanciaAgregarCarrera.show();
         return instanciaAgregarCarrera;
    }
     
      private synchronized JInternalFrame getInstanciaVerCarrera(){
        if(instanciaVerCarrera == null ){
            instanciaVerCarrera = new VistaVerCarrera();
            panelDeEscritorio.add(instanciaVerCarrera);
        }
        else if(instanciaVerCarrera.isVisible()==false)
            instanciaVerCarrera.setVisible(true);
           
         instanciaVerCarrera.show();
         return instanciaVerCarrera;
    }
      private synchronized JInternalFrame getInstanciaEliminarCarrera(){
        if(instanciaEliminarCarrera == null ){
            instanciaEliminarCarrera = new VistaEliminarCarrera();
            panelDeEscritorio.add(instanciaEliminarCarrera);
        }
        else if(instanciaEliminarCarrera.isVisible()==false)
            instanciaEliminarCarrera.setVisible(true);
           
         instanciaEliminarCarrera.show();
         return instanciaEliminarCarrera;
    }
        private synchronized JInternalFrame getInstanciaActualizarCarrera(){
        if(instanciaActualizarCarrera == null ){
            instanciaActualizarCarrera = new VistaActualizarCarrera();
            panelDeEscritorio.add(instanciaActualizarCarrera);
        }
        else if(instanciaActualizarCarrera.isVisible()==false)
            instanciaActualizarCarrera.setVisible(true);
           
         instanciaActualizarCarrera.show();
         return instanciaActualizarCarrera;
    }
    
   

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem4 = new javax.swing.JMenuItem();
        panelDeEscritorio = new javax.swing.JDesktopPane();
        barraDeMenu = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuAlumno = new javax.swing.JMenu();
        menuAgregarAlumno = new javax.swing.JMenuItem();
        menuVerAlumno = new javax.swing.JMenuItem();
        menuActualizarAlumno = new javax.swing.JMenuItem();
        menuEliminarAlumno = new javax.swing.JMenuItem();
        menuProfesor = new javax.swing.JMenu();
        menuAgregarProfesor = new javax.swing.JMenuItem();
        menuVerProfesor = new javax.swing.JMenuItem();
        menuEliminarProfesor = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuCarrera = new javax.swing.JMenu();
        menuAgregarCarrera = new javax.swing.JMenuItem();
        menuVerCarrera = new javax.swing.JMenuItem();
        menuEliminarCarrera = new javax.swing.JMenuItem();
        menuActualizarCarrera = new javax.swing.JMenuItem();
        menuCursos = new javax.swing.JMenu();
        menuAgregarCurso = new javax.swing.JMenuItem();
        menuVerCursos = new javax.swing.JMenuItem();
        menuEliminarCursos = new javax.swing.JMenuItem();
        menuActualizarCurso = new javax.swing.JMenuItem();

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);

        panelDeEscritorio.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelDeEscritorioLayout = new javax.swing.GroupLayout(panelDeEscritorio);
        panelDeEscritorio.setLayout(panelDeEscritorioLayout);
        panelDeEscritorioLayout.setHorizontalGroup(
            panelDeEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 468, Short.MAX_VALUE)
        );
        panelDeEscritorioLayout.setVerticalGroup(
            panelDeEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jMenu1.setText("Colegio");

        menuAlumno.setText("Alumnos");

        menuAgregarAlumno.setText("Agregar");
        menuAgregarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAgregarAlumnoActionPerformed(evt);
            }
        });
        menuAlumno.add(menuAgregarAlumno);

        menuVerAlumno.setText("Ver");
        menuVerAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVerAlumnoActionPerformed(evt);
            }
        });
        menuAlumno.add(menuVerAlumno);

        menuActualizarAlumno.setText("Actualizar");
        menuActualizarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActualizarAlumnoActionPerformed(evt);
            }
        });
        menuAlumno.add(menuActualizarAlumno);

        menuEliminarAlumno.setText("Eliminar");
        menuEliminarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEliminarAlumnoActionPerformed(evt);
            }
        });
        menuAlumno.add(menuEliminarAlumno);

        jMenu1.add(menuAlumno);

        menuProfesor.setText("Profesores");

        menuAgregarProfesor.setText("Agregar");
        menuAgregarProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAgregarProfesorActionPerformed(evt);
            }
        });
        menuProfesor.add(menuAgregarProfesor);

        menuVerProfesor.setText("Ver");
        menuVerProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVerProfesorActionPerformed(evt);
            }
        });
        menuProfesor.add(menuVerProfesor);

        menuEliminarProfesor.setText("Eliminar");
        menuEliminarProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEliminarProfesorActionPerformed(evt);
            }
        });
        menuProfesor.add(menuEliminarProfesor);

        jMenuItem1.setText("Actualizar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuProfesor.add(jMenuItem1);

        jMenu1.add(menuProfesor);

        menuCarrera.setText("Carrera");

        menuAgregarCarrera.setText("Agregar");
        menuAgregarCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAgregarCarreraActionPerformed(evt);
            }
        });
        menuCarrera.add(menuAgregarCarrera);

        menuVerCarrera.setText("Ver");
        menuVerCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVerCarreraActionPerformed(evt);
            }
        });
        menuCarrera.add(menuVerCarrera);

        menuEliminarCarrera.setText("Eliminar");
        menuEliminarCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEliminarCarreraActionPerformed(evt);
            }
        });
        menuCarrera.add(menuEliminarCarrera);

        menuActualizarCarrera.setText("Actualizar");
        menuActualizarCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActualizarCarreraActionPerformed(evt);
            }
        });
        menuCarrera.add(menuActualizarCarrera);

        jMenu1.add(menuCarrera);

        menuCursos.setText("Curso");

        menuAgregarCurso.setText("Agregar");
        menuAgregarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAgregarCursoActionPerformed(evt);
            }
        });
        menuCursos.add(menuAgregarCurso);

        menuVerCursos.setText("Ver");
        menuVerCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVerCursosActionPerformed(evt);
            }
        });
        menuCursos.add(menuVerCursos);

        menuEliminarCursos.setText("Eliminar");
        menuEliminarCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEliminarCursosActionPerformed(evt);
            }
        });
        menuCursos.add(menuEliminarCursos);

        menuActualizarCurso.setText("Actualizar");
        menuActualizarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActualizarCursoActionPerformed(evt);
            }
        });
        menuCursos.add(menuActualizarCurso);

        jMenu1.add(menuCursos);

        barraDeMenu.add(jMenu1);

        setJMenuBar(barraDeMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDeEscritorio)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDeEscritorio)
                .addGap(326, 326, 326))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuAgregarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAgregarAlumnoActionPerformed
        // TODO add your handling code here:
        getInstanciaAgregarAlumno();
    }//GEN-LAST:event_menuAgregarAlumnoActionPerformed

    private void menuVerAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVerAlumnoActionPerformed
        // TODO add your handling code here:
        getInstanciaVerAlumno();
        instanciaVerAlumno.verDatos();
    }//GEN-LAST:event_menuVerAlumnoActionPerformed

    private void menuEliminarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEliminarAlumnoActionPerformed
      getInstanciaBorrar();  // TODO add your handling code here:
    }//GEN-LAST:event_menuEliminarAlumnoActionPerformed

    private void menuActualizarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActualizarAlumnoActionPerformed
      getInstanciaActualizarAlumnos(); // TODO add your handling code here:
    }//GEN-LAST:event_menuActualizarAlumnoActionPerformed

    private void menuAgregarProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAgregarProfesorActionPerformed
        // TODO add your handling code here:
        
        getInstanciaAgregarProfesor();
    }//GEN-LAST:event_menuAgregarProfesorActionPerformed

    private void menuVerProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVerProfesorActionPerformed
        // TODO add your handling code here:
        getInstanciaVerProfesor();
        instanciaVerProfesor.mostrarDatos();
    }//GEN-LAST:event_menuVerProfesorActionPerformed

    private void menuEliminarProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEliminarProfesorActionPerformed
        // TODO add your handling code here:
        getInstanciaEliminarProfesor();
    }//GEN-LAST:event_menuEliminarProfesorActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        getInstanciaActualizarProfesor();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void menuAgregarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAgregarCursoActionPerformed
        // TODO add your handling code here:
        getInstanciaAgregarCursos();
    }//GEN-LAST:event_menuAgregarCursoActionPerformed

    private void menuVerCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVerCursosActionPerformed
        // TODO add your handling code here:
        getInstanciaAgregarCusos();
        instanciaVerCursos.verCursos();
    }//GEN-LAST:event_menuVerCursosActionPerformed

    private void menuEliminarCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEliminarCursosActionPerformed
        // TODO add your handling code here:
        getInstanciaEliminarCurso();
    }//GEN-LAST:event_menuEliminarCursosActionPerformed

    private void menuActualizarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActualizarCursoActionPerformed
        // TODO add your handling code here:
        getInstanciaActualizarCurso();
    }//GEN-LAST:event_menuActualizarCursoActionPerformed

    private void menuAgregarCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAgregarCarreraActionPerformed
        // TODO add your handling code here:
        getInstanciaAgregarCarrera();
    }//GEN-LAST:event_menuAgregarCarreraActionPerformed

    private void menuVerCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVerCarreraActionPerformed
        // TODO add your handling code here:
        getInstanciaVerCarrera();
        instanciaVerCarrera.verCarreras();
    }//GEN-LAST:event_menuVerCarreraActionPerformed

    private void menuEliminarCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEliminarCarreraActionPerformed
        // TODO add your handling code here:
        getInstanciaEliminarCarrera();
    }//GEN-LAST:event_menuEliminarCarreraActionPerformed

    private void menuActualizarCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActualizarCarreraActionPerformed
        // TODO add your handling code here:.
        getInstanciaActualizarCarrera();
    }//GEN-LAST:event_menuActualizarCarreraActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraDeMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem menuActualizarAlumno;
    private javax.swing.JMenuItem menuActualizarCarrera;
    private javax.swing.JMenuItem menuActualizarCurso;
    private javax.swing.JMenuItem menuAgregarAlumno;
    private javax.swing.JMenuItem menuAgregarCarrera;
    private javax.swing.JMenuItem menuAgregarCurso;
    private javax.swing.JMenuItem menuAgregarProfesor;
    private javax.swing.JMenu menuAlumno;
    private javax.swing.JMenu menuCarrera;
    private javax.swing.JMenu menuCursos;
    private javax.swing.JMenuItem menuEliminarAlumno;
    private javax.swing.JMenuItem menuEliminarCarrera;
    private javax.swing.JMenuItem menuEliminarCursos;
    private javax.swing.JMenuItem menuEliminarProfesor;
    private javax.swing.JMenu menuProfesor;
    private javax.swing.JMenuItem menuVerAlumno;
    private javax.swing.JMenuItem menuVerCarrera;
    private javax.swing.JMenuItem menuVerCursos;
    private javax.swing.JMenuItem menuVerProfesor;
    private javax.swing.JDesktopPane panelDeEscritorio;
    // End of variables declaration//GEN-END:variables

    


}
