/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import data.Guia;

/**
 *
 * @author LuisAneri
 */

import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LuisAneri
 */

public class MySQLDAOGuia{
    
    
    /*
    *   ------------------------------------
    *   SENTENCIAS PARA LAS TABLAS DE JUGADOR
    *   ------------------------------------_
    */
    
    final String INSERT = "INSERT INTO Guias( userName, email, password) VALUES (?,?,?)"; 
    final String UPDATE = "UPDATE Guias SET userName = ? , email = ?, password = ? WHERE idGuia = ?";
    final String DELETE = "DELETE FROM Guias WHERE idGuia = ?";
    final String GETALL = "SELECT idGuia, userName, email, password FROM Guias";
    final String GETONE = "SELECT idGuia, userName, email, password FROM Guias WHERE email LIKE ?";
    
    
    private Connection conn;
    
    public MySQLDAOGuia(Connection conn) {
        
        this.conn = conn;
        
    }

    public void insertar(Guia g) throws DAOException {
		
		PreparedStatement stat = null;
        
        try{
            stat = conn.prepareStatement(INSERT);   
            
            stat.setString(1, g.getUsername());
            stat.setString(2, g.getEmail());
            stat.setString(3, g.getPassword());
            
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

	public void modificar(Guia g) throws DAOException {
		
		PreparedStatement stat = null;
		
		try{
            stat = conn.prepareStatement(UPDATE);   
            
            stat.setString(1, g.getUsername());
            stat.setString(2, g.getEmail());
            stat.setString(3, g.getPassword());
            stat.setInt(4, g.getIdGuia());
            
            
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
		
    private Guia convertir(ResultSet rs) throws Exception{
        
        String nombre = rs.getString("userName");
        String email = rs.getString("email");
        String password = rs.getString("password");
        int idGuia = rs.getInt("idGuia");
        
        Guia g = new Guia(nombre,email,password);
        g.setIdGuia(idGuia);
        
        return g;
        
    }

    public List<Guia> obtenerTodos() throws Exception {
            
        PreparedStatement stat = null;
	    ResultSet rs = null;
	    List<Guia> usuarios = new ArrayList<>();
	       
            try {
                     try{

                         stat = conn.prepareStatement(GETALL);
                         rs = stat.executeQuery();
                         while(rs.next()){

                             usuarios.add(convertir(rs));

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

             return usuarios;
	}

    public Guia obtener(String email) throws Exception {
        PreparedStatement stat = null;
        ResultSet rs = null;
        Guia u = null;
           try {
                try{

                    stat = conn.prepareStatement(GETONE);
                    stat.setString(1, email);
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

}
