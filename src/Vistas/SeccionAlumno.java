/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

/**
 *
 * @author yamic
 */
public class SeccionAlumno extends javax.swing.JFrame {

    /**
     * Creates new form SeccionAlumno
     */
    public SeccionAlumno() {
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

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmArchivo = new javax.swing.JMenu();
        jmiSalir = new javax.swing.JMenuItem();
        jmMaterias = new javax.swing.JMenu();
        jmiFormMaterias = new javax.swing.JMenuItem();
        jmAlumnos = new javax.swing.JMenu();
        jmiFormAlumnos = new javax.swing.JMenuItem();
        jmInscripciones = new javax.swing.JMenu();
        jmiManInscripciones = new javax.swing.JMenuItem();
        jmNotas = new javax.swing.JMenu();
        jmiManNotas = new javax.swing.JMenuItem();
        jmConsultas = new javax.swing.JMenu();
        jmiListadoAxM = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escritorio.setBackground(new java.awt.Color(0, 153, 102));
        escritorio.setForeground(new java.awt.Color(51, 255, 204));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        jmArchivo.setForeground(new java.awt.Color(0, 153, 102));
        jmArchivo.setText("Archivo");
        jmArchivo.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N

        jmiSalir.setFont(new java.awt.Font("Calisto MT", 1, 12)); // NOI18N
        jmiSalir.setForeground(new java.awt.Color(0, 153, 153));
        jmiSalir.setText("Salir");
        jmiSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSalirActionPerformed(evt);
            }
        });
        jmArchivo.add(jmiSalir);

        jMenuBar1.add(jmArchivo);

        jmMaterias.setForeground(new java.awt.Color(0, 153, 102));
        jmMaterias.setText("Materias");
        jmMaterias.setFocusable(false);
        jmMaterias.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N

        jmiFormMaterias.setFont(new java.awt.Font("Calisto MT", 1, 12)); // NOI18N
        jmiFormMaterias.setForeground(new java.awt.Color(0, 153, 153));
        jmiFormMaterias.setText("Formulario de Materias");
        jmiFormMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFormMateriasActionPerformed(evt);
            }
        });
        jmMaterias.add(jmiFormMaterias);

        jMenuBar1.add(jmMaterias);

        jmAlumnos.setForeground(new java.awt.Color(0, 153, 102));
        jmAlumnos.setText("Alumnos");
        jmAlumnos.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jmAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAlumnosActionPerformed(evt);
            }
        });

        jmiFormAlumnos.setFont(new java.awt.Font("Calisto MT", 1, 12)); // NOI18N
        jmiFormAlumnos.setForeground(new java.awt.Color(0, 153, 153));
        jmiFormAlumnos.setText("Formulario de Alumnos");
        jmiFormAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFormAlumnosActionPerformed(evt);
            }
        });
        jmAlumnos.add(jmiFormAlumnos);

        jMenuBar1.add(jmAlumnos);

        jmInscripciones.setForeground(new java.awt.Color(0, 153, 102));
        jmInscripciones.setText("Inscripciones");
        jmInscripciones.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N

        jmiManInscripciones.setFont(new java.awt.Font("Calisto MT", 1, 12)); // NOI18N
        jmiManInscripciones.setForeground(new java.awt.Color(0, 153, 153));
        jmiManInscripciones.setText("Manejo de Inscripciones");
        jmiManInscripciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiManInscripcionesActionPerformed(evt);
            }
        });
        jmInscripciones.add(jmiManInscripciones);

        jMenuBar1.add(jmInscripciones);

        jmNotas.setForeground(new java.awt.Color(0, 153, 102));
        jmNotas.setText("Carga de Notas");
        jmNotas.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N

        jmiManNotas.setFont(new java.awt.Font("Calisto MT", 1, 12)); // NOI18N
        jmiManNotas.setForeground(new java.awt.Color(0, 153, 153));
        jmiManNotas.setText("Manipulacion de Notas");
        jmiManNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiManNotasActionPerformed(evt);
            }
        });
        jmNotas.add(jmiManNotas);

        jMenuBar1.add(jmNotas);

        jmConsultas.setForeground(new java.awt.Color(0, 153, 102));
        jmConsultas.setText("Consultas");
        jmConsultas.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N

        jmiListadoAxM.setFont(new java.awt.Font("Calisto MT", 1, 12)); // NOI18N
        jmiListadoAxM.setForeground(new java.awt.Color(0, 153, 153));
        jmiListadoAxM.setText("Listado de Alumnos por Materias");
        jmiListadoAxM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiListadoAxMActionPerformed(evt);
            }
        });
        jmConsultas.add(jmiListadoAxM);

        jMenuBar1.add(jmConsultas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAlumnosActionPerformed
    // TODO add your handling code here:
    }//GEN-LAST:event_jmAlumnosActionPerformed

    private void jmiSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSalirActionPerformed
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_jmiSalirActionPerformed

    private void jmiFormAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFormAlumnosActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        Alumnos a = new Alumnos();
        a.setVisible(true);
        escritorio.add(a);
    }//GEN-LAST:event_jmiFormAlumnosActionPerformed

    private void jmiManInscripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiManInscripcionesActionPerformed
       escritorio.removeAll();
        escritorio.repaint();
        Inscripciones i = new Inscripciones();
        i.setVisible(true);
        escritorio.add(i);
        // TODO add your handling code here:
    }//GEN-LAST:event_jmiManInscripcionesActionPerformed
                                        
    private void jmiFormMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFormMateriasActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        Materias mat = new Materias();
        mat.setVisible(true);
        escritorio.add(mat);      
    }//GEN-LAST:event_jmiFormMateriasActionPerformed

    private void jmiManNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiManNotasActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        CargaNotas n = new CargaNotas();
        n.setVisible(true);
        escritorio.add(n);
    }//GEN-LAST:event_jmiManNotasActionPerformed

    private void jmiListadoAxMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiListadoAxMActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        AlumnosMaterias alumXMat = new AlumnosMaterias();
        alumXMat.setVisible(true);
        escritorio.add(alumXMat);
    }//GEN-LAST:event_jmiListadoAxMActionPerformed

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
            java.util.logging.Logger.getLogger(SeccionAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeccionAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeccionAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeccionAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeccionAlumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jmAlumnos;
    private javax.swing.JMenu jmArchivo;
    private javax.swing.JMenu jmConsultas;
    private javax.swing.JMenu jmInscripciones;
    private javax.swing.JMenu jmMaterias;
    private javax.swing.JMenu jmNotas;
    private javax.swing.JMenuItem jmiFormAlumnos;
    private javax.swing.JMenuItem jmiFormMaterias;
    private javax.swing.JMenuItem jmiListadoAxM;
    private javax.swing.JMenuItem jmiManInscripciones;
    private javax.swing.JMenuItem jmiManNotas;
    private javax.swing.JMenuItem jmiSalir;
    // End of variables declaration//GEN-END:variables
}
