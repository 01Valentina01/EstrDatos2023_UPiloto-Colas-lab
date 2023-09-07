/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unipiloto.estdatos.colas.mundo;

/**
 *
 * @author SG702-15
 */
public class Producto {
    private String nombre;
    private String tiempoPreparacion;         
    private double costo;        
    
    public Producto(){
        
    }
    
    public Producto(String nombre, String tiempoPreparacion, double costo) {

        this.nombre = nombre;
        this.edad = tiempoPreparacion;
        this.costo = costo;

    }
    public String getNombre() {

    return nombre;

    }
    public void setNombre(String nombre) {

        this.nombre = nombre;

    }
public String getTiempoPreparacion() {

    return tiempoPreparacion;

    }
    public void setTiempoPreparacion(String tiempoPreparacion) {

        this.tiempoPreparacion = tiempoPreparacion;

    }
    public double getCosto() {

    return  costo;

    }
    public void setCosto(double costo) {

        this.costo = costo;

    }
}

    

