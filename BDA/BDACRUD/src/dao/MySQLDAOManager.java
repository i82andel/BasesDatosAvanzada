/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author LuisAneri
 */
public class MySQLDAOManager {
    
    	private Connection conn;
	private MySQLDAOGuia guias= null;
	private MySQLDAORuta rutas = null;

	public MySQLDAOManager(String url, String username, String password) throws SQLException{
            conn = DriverManager.getConnection(url,username,password);
        }    

	public MySQLDAOGuia getGuias() {
            if(guias == null){
                guias = new MySQLDAOGuia(conn);
            }
            return guias;
	}

	public MySQLDAORuta getRutas() {
            if(rutas == null){
                rutas = new MySQLDAORuta(conn);
            }
		return rutas;
	}

        public void close() throws SQLException{
            conn.close();
        }
}
