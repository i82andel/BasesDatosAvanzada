/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;


import data.Ruta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Date;
import java.time.LocalDate;

/**
 *
 * @author LuisAneri
 */
public class MySQLDAORuta {
    
    
    /*
    *   ------------------------------------
    *   SENTENCIAS PARA LAS TABLAS DE JUGADOR
    *   ------------------------------------_
    */
    
    final String INSERT = "INSERT INTO Rutas( idRutas, nombre, fechaCreacion, precio, tipoRuta, guia) VALUES (?,?,?,?,?,?)"; 
    final String UPDATE = "UPDATE Rutas SET nombre = ?, fechaCreacio = ?, precio = ?, tipoRuta = ?, guia = ? WHERE idRutas = ?";
    final String DELETE = "DELETE FROM Rutas WHERE idRutas = ?";
    final String GETALL = "SELECT idRutas, nombre, fechaCreacion, precio, tipoRuta, guia FROM Rutas WHERE guia = ?";
    final String GETONE = "SELECT idRutas, nombre, fechaCreacion, precio, tipoRuta, guia FROM Rutas WHERE idRutas = ?";
    
    
    private Connection conn;
    
    public MySQLDAORuta(Connection conn) {
        
        this.conn = conn;
        
    }

    public void insertar(Ruta r) throws DAOException {
		
		PreparedStatement stat = null;
        
        try{
            stat = conn.prepareStatement(INSERT);   
            stat.setInt(1, r.getIdRuta());
            stat.setString(2, r.getNombre());
            stat.setDate(3, Date.valueOf(r.getFecha()));
            stat.setFloat(4, r.getPrecio());
            stat.setString(5, r.getTipoRuta());
            stat.setInt(6, r.getGuia());
            
            if(stat.executeUpdate() == 0){
                throw new DAOException("Puede que no se haya guardado.");
            }
            
        } catch(SQLException ex){
            throw new DAOException("Error en SQL", ex);
        } finally{
            if (stat !=  null){
                
                try{
                    stat.close();
                }catch(SQLException ex){
                    throw new DAOException("Error en SQL", ex);
                }
            }if(stat != null){
               
               try{
                   stat.close();
               }catch(SQLException ex){
                   new DAOException("Error en SQL", ex);
               }
           }
        }
		
	}

	public void modificar(Ruta r) throws DAOException {
		
            PreparedStatement stat = null;

            try{
                stat = conn.prepareStatement(UPDATE);   

                stat.setString(1, r.getNombre());
                stat.setDate(2, Date.valueOf(r.getFecha()));
                stat.setFloat(3, r.getPrecio());
                stat.setString(4, r.getTipoRuta());
                stat.setInt(5, r.getGuia());
                stat.setInt(6, r.getIdRuta());
            
            if(stat.executeUpdate() == 0){
                throw new DAOException("Puede que no se haya guardado.");
            }
            
        } catch(SQLException ex){
            throw new DAOException("Error en SQL", ex);
        } finally{
            if (stat !=  null){
                
                try{
                    stat.close();
                }catch(SQLException ex){
                    throw new DAOException("Error en SQL", ex);
                }
            }if(stat != null){
               
               try{
                   stat.close();
               }catch(SQLException ex){
                   new DAOException("Error en SQL", ex);
               }
               
           }
        }
		
	}

	public void eliminar(int id) throws DAOException {
		
		PreparedStatement stat = null;
        
        try{
            
            stat = conn.prepareStatement(DELETE);
            stat.setInt(1, id);

            if(stat.executeUpdate() == 0){
                throw new DAOException("Puede que no se haya guardado.");
            }
            
        } catch(SQLException ex){
            throw new DAOException("Error en SQL", ex);
        } finally{
            if (stat !=  null){
                
                try{
                    stat.close();
                }catch(SQLException ex){
                    throw new DAOException("Error en SQL", ex);
                }
            }
        }
    }
		
    private Ruta convertir(ResultSet rs) throws Exception{
        
        int idRutas = rs.getInt("idRutas");
        String nombre = rs.getString("nombre");
        LocalDate fecha = rs.getDate("fechaCreacion").toLocalDate();
        Float precio = rs.getFloat("precio");
        String tipoRuta = rs.getString("tipoRuta");
        int idGuia = rs.getInt("guia");
        
        Ruta g = new Ruta(idRutas,nombre,fecha,precio,tipoRuta);
        g.setGuia(idGuia);
        
        return g;
        
    }

    public List<Ruta> obtenerTodos(int id) throws Exception {
            
        PreparedStatement stat = null;
	    ResultSet rs = null;
	    List<Ruta> rutas = new ArrayList<>();
	       
            try {
                try{

                    stat = conn.prepareStatement(GETALL);
                    stat.setInt(1, id);
                    rs = stat.executeQuery();
                    while(rs.next()){

                        rutas.add(convertir(rs));

                    }

                   }catch(SQLException ex){
                        throw new DAOException("Error en SQL", ex);
                   }finally{

                       if(rs != null){

                           try{
                               rs.close();
                           }catch(SQLException ex){
                               new DAOException("Error en SQL", ex);
                           }

                       }
                       if(stat != null){

                           try{
                               stat.close();
                           }catch(SQLException ex){
                               new DAOException("Error en SQL", ex);
                           }

                       }
                   }
             } catch (DAOException e) {
                     // TODO Auto-generated catch block
                     e.printStackTrace();
             } catch (Exception e) {
                     // TODO Auto-generated catch block
                     e.printStackTrace();
             }

             return rutas;
	}

    public Ruta obtener(int idGuia) throws Exception {
        PreparedStatement stat = null;
        ResultSet rs = null;
        Ruta u = null;
           try {
                try{

                    stat = conn.prepareStatement(GETONE);
                    stat.setInt(1, idGuia);
                    rs = stat.executeQuery();
                    if(rs.next()){

                        u = convertir(rs);

                    }else{
                        throw new DAOException("No se ha encontrado ese registro.");
                    }

                   }catch(SQLException ex){
                        throw new DAOException("Error en SQL", ex);
                   }finally{

                       if(rs != null){

                           try{
                               rs.close();
                           }catch(SQLException ex){
                               new DAOException("Error en SQL", ex);
                           }

                       }
                       if(stat != null){

                           try{
                               stat.close();
                           }catch(SQLException ex){
                               new DAOException("Error en SQL", ex);
                           }

                       }
                   }
            } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
            }

            return u;
    }

    public void eliminar(Ruta r) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
