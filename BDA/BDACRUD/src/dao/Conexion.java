/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author LuisAneri
 */

public class Conexion 
{
    private static Connection conn = null;
    private static String login="i82andel";
    private static String password="lande00";
    private static String url="jdbc:oracle:thin:@oraclepr.uco.es:1521:oraclepr";

    public static Connection getConnection(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection(url,login,password);
            conn.setAutoCommit(false);
            if (conn!=null){
                System.out.println("Conexion exisota");
            }
            else{
                System.out.println("Conexion erronea");
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Conexion erronea "+ e.getMessage());
        }
        return conn;
    }

    public void desconexion(){
        try {
            conn.close();
        } catch (Exception e) {
            System.out.println("Error al desconectar "+ e.getMessage());
        }
    }

    public static void main(String[] args) {
        Conexion c=new Conexion();
        c.getConnection();
    }
}
