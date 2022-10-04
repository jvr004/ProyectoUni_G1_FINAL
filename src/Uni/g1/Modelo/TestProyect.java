
package Uni.g1.Modelo;

import java.time.LocalDate;
import java.time.Month;
import javax.swing.JOptionPane;
import java.sql.Connection;
import Uni.g1.Controladora.AlumnoData;
import Uni.g1.Controladora.CursadaData;
import Uni.g1.Controladora.MateriaData;
import java.util.ArrayList;
import java.util.List;



public class TestProyect {

    public static void main(String[] args) {
        
        
        AlumnoData ad =new AlumnoData();
        Alumno alu=new Alumno(14,123,"Tor","Tor",LocalDate.of(1987, 04, 12),true);
        MateriaData md=new MateriaData();
        
        Materia mat = new Materia(1,"frances",1,true);
        
        CursadaData cd=new CursadaData();
        
        Cursada cursada=new Cursada(alu,mat,0);
        
        Cursada cur= cd.obtenerCursada(1, 2);
        
        JOptionPane.showMessageDialog(null,cur);        
                
        //cd.guardarCursada(cursada);
        
        cd.actualizarNota(33,cur.getMateria().getIdMateria(), 10);
        
        //cd.borrarCursada(14, 1);
        
        
//        List<Materia> lista=new ArrayList();
//        
//       lista=cd.materiasInscripto(3);
//       
//       for(Materia m:lista){
//        JOptionPane.showMessageDialog(null, m);
//       } 
//        
//       
//       List<Materia> noInscriptas=new ArrayList<>();
//       
//       noInscriptas=cd.materiasNoInscriptas(3);
//       
//       for (Materia m:noInscriptas){
//           JOptionPane.showMessageDialog(null, m);
//       }
//       
//               
//       List<Alumno> Inscriptos=new ArrayList<>();
//       
//       Inscriptos=cd.alumnosInscriptos(2);
//       
//       for (Alumno a:Inscriptos){
//           JOptionPane.showMessageDialog(null, a);
//       }
//        
//        
//        
        
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