/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uni.g1.Vistas;

import Uni.g1.Controladora.AlumnoData;
import Uni.g1.Controladora.CursadaData;
import Uni.g1.Controladora.MateriaData;
import Uni.g1.Modelo.Alumno;
import Uni.g1.Modelo.Cursada;
import Uni.g1.Modelo.Materia;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author yamic
 */
public class Inscripciones extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo;
    private ArrayList<Cursada> listaCursada;
    private ArrayList<Materia> listaMateria;
    private ArrayList<Alumno> listaAlumno;
    private AlumnoData alumD;
    private CursadaData curD;
    private MateriaData matD;
    
    
    
    public Inscripciones() {
        initComponents();  
        modelo = new DefaultTableModel();
        curD = new CursadaData();
        alumD = new AlumnoData();
        matD = new MateriaData();
        listaCursada= curD.obtenerCursadas();
        listaAlumno = alumD.obtenerAlumnos();
        cargaAlumnos();//carga de alumnos en el combo box .
        armarCabecera();
    }
    
    public void armarCabecera(){
        ArrayList<Object> columnas = new ArrayList<>();
        columnas.add("ID");
        columnas.add("Nombre");
        columnas.add("Año");
        
        for(Object it:columnas){
            modelo.addColumn(it);
        }
        tMateria.setModel(modelo);
    }
    
    public void cargaAlumnos(){
        for (Alumno a: listaAlumno)
            jcbAlumnos.addItem(a);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Grupo = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcbAlumnos = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jrbInscripto = new javax.swing.JRadioButton();
        jrbNoInscripto = new javax.swing.JRadioButton();
        jbInscripcion = new javax.swing.JButton();
        jbAInscripcion = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tMateria = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Felix Titling", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 102));
        jLabel1.setText("Inscripcion");

        jLabel2.setText("ALUMNO");

        jLabel3.setText("LISTADO DE MATERIAS");

        Grupo.add(jrbInscripto);
        jrbInscripto.setText("Inscriptos");
        jrbInscripto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbInscriptoActionPerformed(evt);
            }
        });

        Grupo.add(jrbNoInscripto);
        jrbNoInscripto.setText("No Inscriptos");
        jrbNoInscripto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbNoInscriptoActionPerformed(evt);
            }
        });

        jbInscripcion.setText("INSCRIBIR");
        jbInscripcion.setEnabled(false);
        jbInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInscripcionActionPerformed(evt);
            }
        });

        jbAInscripcion.setText("ANULAR INSCRIPCION");
        jbAInscripcion.setEnabled(false);
        jbAInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAInscripcionActionPerformed(evt);
            }
        });

        jbSalir.setText("SALIR");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        tMateria.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tMateria);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addComponent(jLabel2)
                                .addGap(41, 41, 41)
                                .addComponent(jcbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jbInscripcion)
                                .addGap(27, 27, 27)
                                .addComponent(jbAInscripcion)
                                .addGap(18, 18, 18)
                                .addComponent(jbSalir))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(jrbInscripto)
                                .addGap(90, 90, 90)
                                .addComponent(jrbNoInscripto)))
                        .addGap(0, 55, Short.MAX_VALUE)))
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbInscripto)
                    .addComponent(jrbNoInscripto))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAInscripcion)
                    .addComponent(jbInscripcion)
                    .addComponent(jbSalir))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrbInscriptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbInscriptoActionPerformed
        borraFilasTabla();
        Alumno alumBox = (Alumno)jcbAlumnos.getSelectedItem();
        listaMateria= (ArrayList)curD.materiasInscripto(alumBox.getIdAlumno());
        for (Materia mat: listaMateria) //recorremos lista de materias Inscripto y lo cargamos en la tabla 
           modelo.addRow(new Object[]{mat.getIdMateria(),mat.getNombre(),mat.getAño()});
        jbInscripcion.setEnabled(false);
        jbAInscripcion.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbInscriptoActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jrbNoInscriptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbNoInscriptoActionPerformed
        // TODO add your handling code here:
         borraFilasTabla();
        Alumno alumBox = (Alumno)jcbAlumnos.getSelectedItem();
        listaMateria= (ArrayList)curD.materiasNoInscriptas(alumBox.getIdAlumno());
        for (Materia mat: listaMateria) //recorremos lista de materias Inscripto y lo cargamos en la tabla 
           modelo.addRow(new Object[]{mat.getIdMateria(),mat.getNombre(),mat.getAño()});
        jbInscripcion.setEnabled(true);
        jbAInscripcion.setEnabled(false);
    }//GEN-LAST:event_jrbNoInscriptoActionPerformed

    private void jbInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInscripcionActionPerformed
        // TODO add your handling code here:
        
         int idMateria=0,año=0;
         String nombre="";
         
         
        Alumno alumBox = (Alumno)jcbAlumnos.getSelectedItem();
        int fila = tMateria.getSelectedRow();
        System.out.println(fila);
        if (fila>=0){
            idMateria=(Integer)modelo.getValueAt(fila, 0);
            nombre=(String)modelo.getValueAt(fila, 1);
            año=(Integer)modelo.getValueAt(fila, 2);
          Materia mat = new Materia(idMateria,nombre,año,true);
          Cursada cur = new Cursada(alumBox,mat,0);
          curD.guardarCursada(cur);
        } else {
            JOptionPane.showMessageDialog(this,"Seleccione una materia");
        }
       
    }//GEN-LAST:event_jbInscripcionActionPerformed

    private void jbAInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAInscripcionActionPerformed
        // TODO add your handling code here:
        int idMateria=0;
        Alumno alumBox = (Alumno)jcbAlumnos.getSelectedItem();
        int fila = tMateria.getSelectedRow();
        System.out.println(fila);
        if (fila>=0){
        idMateria=(Integer)modelo.getValueAt(fila, 0);
        curD.borrarCursada(alumBox.getIdAlumno(), idMateria);
        }

    }//GEN-LAST:event_jbAInscripcionActionPerformed

    public void borraFilasTabla(){

       int a =modelo.getRowCount()-1;

       for(int i=a;i>=0;i--){
   
       modelo.removeRow(i );
       }
    }  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Grupo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jbAInscripcion;
    private javax.swing.JButton jbInscripcion;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Alumno> jcbAlumnos;
    private javax.swing.JRadioButton jrbInscripto;
    private javax.swing.JRadioButton jrbNoInscripto;
    private javax.swing.JTable tMateria;
    // End of variables declaration//GEN-END:variables
}
