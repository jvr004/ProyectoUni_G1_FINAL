package TestMain;


import java.time.LocalDate;
import java.time.Month;
import javax.swing.JOptionPane;
import java.sql.Connection;
import ClasesControladoras.*;
import ClasesModelo.*;
import java.util.ArrayList;
import java.util.List;



public class TestProyect {

    public static void main(String[] args) {
                                
        
        
/////////---Test Alumno Data---/////////

 /* CrearAlumno/GuardarAlumno - BorrarAluno - ActualizarAlumnos - ObtenerAlumnos - ObtenerAlumnosPorId */
        
     AlumnoData ad =new AlumnoData();
    
//     Alumno alu = new Alumno(15,3323, "Perez","Hector",LocalDate.of(1987,04,12),true);
//        
//     ad.guardarAlumno(alu);
        
//     Alumno alumna = new Alumno(1,39105927, "Di Gangi","Yamila Belen",LocalDate.of(1996,01,06),true);
//     ad.actualizaAlumno(alumna); 
       
    
//     ad.obtenerAlumnos().forEach(alumno->{
//     JOptionPane.showMessageDialog(null, alumno);
//     });
//       ArrayList<Alumno> list=new ArrayList();
//       
//       list=ad.obtenerAlumnos();
//       
//      for(Alumno alu:list){
//      JOptionPane.showMessageDialog(null, alu);
//      }
//
//JOptionPane.showMessageDialog(null, "Alumno encontrado: " +ad.obtenerAlumnoPorId(1));      
//      
//       ad.borrarAlumno(14);
//      
//               
               
    /////////---Test Materia Data---/////////

 /* CrearMateria/GuardarMateria - BorrarMateria - ActualizarMateria - ObtenerMaterias - ObtenerMateriasPorId */
 
        MateriaData md=new MateriaData();
        Materia mat = new Materia(1,"frances",1,true);

        CursadaData cdata=new CursadaData();
//        
//        List<Materia> lista=new ArrayList();
//        
//       lista=cdata.materiasInscripto(3);
//       
//       for(Materia m:lista){
//        JOptionPane.showMessageDialog(null, m);
//       } 
//        
//       
//       List<Materia> noInscriptas=new ArrayList<>();
//       
//       noInscriptas=cdata.materiasNoInscriptas(3);
//       
//       for (Materia m:noInscriptas){
//           JOptionPane.showMessageDialog(null, m);
//       }
//       
//               
//       List<Alumno> Inscriptos=new ArrayList<>();
//       
//       Inscriptos=cdata.alumnosInscriptos(2);
//       
//       for (Alumno a:Inscriptos){
//           JOptionPane.showMessageDialog(null, a);
//       }
        

//       ArrayList<Materia> lista=new ArrayList();
//       
//       lista=md.obtenerMaterias();
//       
//       for(Materia m:lista){
//        JOptionPane.showMessageDialog(null, m);
//       } 
               
//        md.obtenerMaterias().forEach(materia->{
//        JOptionPane.showMessageDialog(null, materia);
//           
//        });
//        

//        Materia mat = new Materia("Lab 1",1,true);
//        
//        Cursada cursa = new Cursada(alu,mat,7);
//        
//        cursa.setNota(9);
//       
//        JOptionPane.showMessageDialog(null, cursa);
//
//        md.guardarMateria(mat);
//
//        md.actualizaMateria(mat);
//
//        md.borrarMateria(5);
//        

    /////////---Test Cursada Data---/////////

 /* CrearCursada/GuardarCursada - BorrarCursada - ActualizarCursada - ObtenerCursadas - ObtenerMateriasPorId */


       CursadaData cd=new CursadaData();
//
//         
//       Cursada cursada=new Cursada(ad.obtenerAlumnoPorId(15),mat,8.5);
//
//       cd.guardarCursada(cursada);
//
//       Cursada cur= cd.obtenerCursadaPorId(1, 2);
//       
//        JOptionPane.showMessageDialog(null,cur);        
                
        
        
//        cd.actualizarNota(15,cur.getMateria().getIdMateria(), 10);
        
//       cd.obtenerCursadas();
//        JOptionPane.showMessageDialog(null, cd.obtenerCursadas()); 
//        
//        
//        cd.borrarCursada(14, 1);
        
        

               
    }
    
}