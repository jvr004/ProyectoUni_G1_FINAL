package Uni.g1.Controladora;

import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;
import Uni.g1.Modelo.Conexion;
import Uni.g1.Modelo.Materia;


public class MateriaData {
    private Connection con;

    public MateriaData() {
        this.con=Conexion.getConexion();
    }
    
    public void guardarMateria(Materia materia){
        
        String sql="INSERT INTO materia (nombreMateria, año, estado) VALUES (?, ?, ?)";
        try {
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAño());
            ps.setBoolean(3, materia.isEstado());
            
            ps.executeUpdate();//insert, update, delete
            
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
            
                materia.setIdMateria(rs.getInt(1));
                
                JOptionPane.showMessageDialog(null, "Materia agregada exitosamente");           
            }          
            ps.close();           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "MateriaData Sentencia SQL erronea-AgregarMateria");
        }
    }
    
    public ArrayList<Materia> obtenerMaterias(){
        
        ArrayList<Materia> listaTemp=new ArrayList();
        
        String sql="SELECT * FROM materia WHERE estado = 1";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            
            ResultSet rs=ps.executeQuery();//select
            
            while(rs.next()){
            
                Materia m=new Materia();
                
                m.setIdMateria(rs.getInt("idMateria"));
                m.setNombre(rs.getString("nombreMateria"));
                m.setAño(rs.getInt("año"));
                m.setEstado(rs.getBoolean("estado"));
                
                listaTemp.add(m);
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "MateriaData Sentencia SQL erronea-ObtenerMateria");
        }
    return listaTemp;
    }
    
    
    public Materia obtenerMateriaPorId(int id) {
        String sql= "SELECT * FROM materia WHERE idMateria = ?";
        Materia mat = new Materia();
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            
            if(rs.next()){              
                mat.setIdMateria(id);
                mat.setNombre(rs.getString("nombre"));
                mat.setAño(rs.getInt("año"));
                mat.setEstado(rs.getBoolean("estado"));
                
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "MateriaData Sentencia SQL erronea-obtenerMateriaPorId");
        }
        return mat;
         
    }
    
    
    public void borrarMateria (int id){
        String sql="UPDATE materia SET estado=0 WHERE idMateria=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();//
            
            JOptionPane.showMessageDialog(null, "Se elimino el materia correctamente");
            
            ps.close();
            
    }   catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "MateriaData Sentencia SQL erronea-borrarMateria");
        }
    }
    
    public void actualizaMateria(Materia materia){
        String sql="UPDATE materia SET nombreMateria = ?, año = ?, estado = ? WHERE idMateria = ?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAño());
            ps.setBoolean(3, materia.isEstado());
            ps.setInt(4, materia.getIdMateria());
            
         
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Datos de la materia actualizados");
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "MateriaData Sentencia SQL erronea-actualizarMateria");
        }
    }
}