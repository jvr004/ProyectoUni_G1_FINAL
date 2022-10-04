
package Uni.g1.Controladora;

import Uni.g1.Modelo.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class CursadaData {
    private Connection con;
    
    public CursadaData() {
        this.con=Conexion.getConexion();
    }
    
    public void guardarCursada(Cursada cursada){
        //INSERT INTO `cursada` (`idAlumno`, `idMateria`, `nota`) VALUES ('14', '1', '8');
        String sql="INSERT INTO `cursada` (`idAlumno`, `idMateria`, `nota`) VALUES ( ?, ?, ?)";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            
            ps.setInt(1,cursada.getAlumno().getIdAlumno());
            ps.setInt(2,cursada.getMateria().getIdMateria());
            ps.setDouble(3,cursada.getNota());
            
            ps.executeUpdate();            
            
            JOptionPane.showMessageDialog(null, "Alta exitosa.");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "CursadaData Error al insertar"); 
        }
        
        
    }
    
    public void actualizarNota(int idAlumno, int idMateria, double nota){
        //UPDATE `cursada` SET `nota`= 10 WHERE `idAlumno`=14 AND`idMateria`=6;
        
        String sql="UPDATE `cursada` SET `nota`= ? WHERE `idAlumno`=? AND`idMateria`=?;";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            
            ps.setDouble(1,nota);
            ps.setInt(2,idAlumno);
            ps.setInt(3,idMateria);
            
            
            int filas = ps.executeUpdate();
            
            if(filas>0){
            JOptionPane.showMessageDialog(null, "Actualizacion exitosa.");
            } else{
                JOptionPane.showMessageDialog(null, "No se pudo actualizar.");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al Modificar la nota."); 
        }
        
        
    }
    public void borrarCursada(int idAlumno, int idMateria){
        //DELETE FROM `cursada` WHERE idAlumno = 14 AND idMateria = 6
        
        String sql="DELETE FROM `cursada` WHERE idAlumno = ? AND idMateria = ?";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            
            ps.setInt(1,idAlumno);
            ps.setInt(2,idMateria);
            
            ps.executeUpdate();            
            
            JOptionPane.showMessageDialog(null, "Eliminación exitosa.");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar cursada."); 
        }
        
        
    }
    
    public List<Materia> materiasInscripto(int idAlumno){
        
        ArrayList<Materia> materias=new ArrayList<>();
        
        String sql = "SELECT m.idMateria, nombreMateria, año, m.estado FROM materia m, alumnos a, cursada c WHERE m.idMateria = c.idMateria AND a.idAlumno = c.idAlumno AND c.idAlumno = ?";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            
            ps.setInt(1,idAlumno);
            
            ResultSet rs = ps.executeQuery();
            
            Materia m;
            while (rs.next()) {
            m = new Materia();
            
            m.setIdMateria(rs.getInt("idMateria"));
            m.setNombre(rs.getString("nombreMateria"));
            m.setAño(rs.getInt("año"));
            m.setEstado(rs.getBoolean("estado"));
            
            materias.add(m);
            
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la busqueda."); 
        }
        
        return materias;
        
    }
    
    public List<Materia> materiasNoInscriptas(int idAlumno) {
        ArrayList<Materia> mat = new ArrayList<>();
        
        String sql= "SELECT * FROM materia WHERE idMateria NOT IN (SELECT idMateria FROM cursada WHERE  idAlumno = ?)";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs= ps.executeQuery();
            Materia m;
            while (rs.next()) {
                m = new Materia();
                m.setIdMateria(rs.getInt("idMateria"));
                m.setNombre(rs.getString("nombreMateria"));
                m.setAño(rs.getInt("año"));
                m.setEstado(rs.getBoolean("estado"));
                mat.add(m);
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error");
        }
        return mat;
    }
    
    public List<Alumno> alumnosInscriptos(int idMateria) {
        ArrayList<Alumno> alu=new ArrayList<>();
        
        String sql="SELECT a.idAlumno, a.dni, a.apellido, a.nombre, a.fechaNacimiento, a.estado FROM alumnos a, cursada c, materia m WHERE a.idAlumno = c.idAlumno and m.idMateria = c.idMateria AND c.idMateria = ?";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            ResultSet rs=ps.executeQuery();
            Alumno a;
            while(rs.next()){
                a=new Alumno();
                a.setIdAlumno(rs.getInt("idAlumno"));
                a.setDni(rs.getInt("dni"));
                a.setApellido(rs.getString("apellido"));
                a.setNombre(rs.getString("nombre"));
                a.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                a.setEstado(rs.getBoolean("estado"));
                alu.add(a);
        
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No hay alumnos Inscriptos");
        }
        
       return alu; 
    }
    
    public Cursada obtenerCursada(int idAlumno, int idMateria){
         String sql="SELECT a.idAlumno, a.apellido, a.nombre, a.dni, m.idMateria, m.nombreMateria, m.año, c.nota FROM alumnos a, cursada c, materia m WHERE a.idAlumno = c.idAlumno and m.idMateria = c.idMateria AND c.idMateria = ? AND c.idAlumno = ?;";
         
        Cursada cd= new Cursada();
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            
            ResultSet rs=ps.executeQuery();
            
            Alumno a=new Alumno();
            Materia m=new Materia();
            
            
            if(rs.next()){
                                
                a.setIdAlumno(rs.getInt("idAlumno"));
                a.setApellido(rs.getString("apellido"));
                a.setNombre(rs.getString("nombre"));
                a.setDni(rs.getInt("dni"));
                
                m.setIdMateria(rs.getInt("idMateria"));
                m.setNombre(rs.getString("nombreMateria"));
                m.setAño(rs.getInt("año"));
                
                
                cd.setAlumno(a);
                cd.setMateria(m);
                cd.setNota(rs.getInt("nota"));
                
                
            }
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al Obtener la cursda de Alumno y Materia."); 
        }
        return cd;
        
    }
        
    }
    
    //obtenerCursada-devulve todas
    //obtenerCursada devuelve por id
            
