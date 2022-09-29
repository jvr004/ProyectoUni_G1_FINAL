
package Uni.g1.Modelo;

import java.time.LocalDate;
import java.time.Month;
import javax.swing.JOptionPane;
import java.sql.Connection;
import Uni.g1.Controladora.AlumnoData;
import Uni.g1.Controladora.MateriaData;
import java.util.ArrayList;



public class TestProyect {

    public static void main(String[] args) {
        
        
        AlumnoData ad =new AlumnoData();
        MateriaData md=new MateriaData();
        
        Materia mat = new Materia(5,"rrrrr 1",2,true);
        
//       ArrayList<Materia> lista=new ArrayList();
//       
//       lista=md.obtenerMaterias();
//       
//       for(Materia m:lista){
//        JOptionPane.showMessageDialog(null, m);
//       } 
       
       
////       ArrayList<Alumno> list=new ArrayList();
////       
////       list=ad.obtenerAlumnos();
////       
////       for(Alumno alu:list){
////        JOptionPane.showMessageDialog(null, alu);
////       }

        
        
        //md.guardarMateria(mat);
        
        //md.actualizaMateria(mat);
        //md.borrarMateria(5);
        
              
        
        
//        md.obtenerMaterias().forEach(materia->{
//        JOptionPane.showMessageDialog(null, materia);
//           
//        });
        
        
            
//
//        Alumno alu = new Alumno(3323,"Perez","Hector",LocalDate.of(1987, 04, 12),true);
//        
//        //ad.guardarAlumno(alu);         
//        ad.obtenerAlumnos().forEach(alumno->{
//        JOptionPane.showMessageDialog(null, alumno);
//           //System.out.println(alumno);
//        });
//          
//      JOptionPane.showMessageDialog(null, "Alumno encontrado: " +ad.obtenerAlumnoPorId(2) );
//       ad.borrarAlumno(1);
//        
//       
//       
//        
////        Materia mat = new Materia("Lab 1",1,true);
////        
////        Cursada cursa = new Cursada(alu,mat,7);
////        
////        cursa.setNota(9);
////       
////        JOptionPane.showMessageDialog(null, cursa);
               
    }
    
}