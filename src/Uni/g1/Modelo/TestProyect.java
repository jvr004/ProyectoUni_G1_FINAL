
package Uni.g1.Modelo;

import java.time.LocalDate;
import java.time.Month;
import javax.swing.JOptionPane;
import java.sql.Connection;
import Uni.g1.Controladora.AlumnoData;



public class TestProyect {

    public static void main(String[] args) {
        
        
        AlumnoData ad =new AlumnoData();
            

        Alumno alu = new Alumno(3323,"Perez","Hector",LocalDate.of(1987, 04, 12),true);
        
        //ad.guardarAlumno(alu);         
        ad.obtenerAlumnos().forEach(alumno->{
        JOptionPane.showMessageDialog(null, alumno);
           //System.out.println(alumno);
        });
          
      JOptionPane.showMessageDialog(null, "Alumno encontrado: " +ad.obtenerAlumnoPorId(2) );
       ad.borrarAlumno(1);
        
       
       
        
//        Materia mat = new Materia("Lab 1",1,true);
//        
//        Cursada cursa = new Cursada(alu,mat,7);
//        
//        cursa.setNota(9);
//       
//        JOptionPane.showMessageDialog(null, cursa);
               
    }
    
}