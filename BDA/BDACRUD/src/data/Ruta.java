/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author LuisAneri
 */
public class Ruta {
    
    private int idRuta;
    private String nombre;
    private LocalDate fecha;
    private float precio;
    private String tipoRuta;
    private int guia;

    public Ruta(int idRuta,String nombre, LocalDate fecha, float precio, String tipoRuta) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.precio = precio;
        this.tipoRuta = tipoRuta;
        this.idRuta = idRuta;
    }

    public int getIdRuta() {
        return idRuta;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public float getPrecio() {
        return precio;
    }

    public String getTipoRuta() {
        return tipoRuta;
    }

    public void setIdRuta(int idRuta) {
        this.idRuta = idRuta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setTipoRuta(String tipoRuta) {
        this.tipoRuta = tipoRuta;
    }

    public int getGuia() {
        return guia;
    }

    public void setGuia(int guia) {
        this.guia = guia;
    }
    
    
    
    
}
