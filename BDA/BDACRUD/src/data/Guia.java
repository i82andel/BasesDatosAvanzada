/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author LuisAneri
 */
public class Guia {
    
    private int idGuia;
    private String username;
    private String email;
    private String password;

    public Guia(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public int getIdGuia() {
        return idGuia;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setIdGuia(int idGuia) {
        this.idGuia = idGuia;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
