/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unipiloto.estdatos.colas.mundo;

/**
 *
 * @author SG702-15
 */
public class Pedido {
    private String horaPedido;         
    private String esDomicilio;
    
    public Pedido(){
        
    }
    public String getHoraPedido() {
        return horaPedido;
    }

    public void setHoraPedido(String horaPedido) {
        this.horaPedido = horaPedido;
    }

    public String getEsDomicilio() {
        return esDomicilio;
    }

    public void setEsDomicilio(String esDomicilio) {
        this.esDomicilio = esDomicilio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Pedido{" + "horaPedido=" + horaPedido + ", esDomicilio=" + esDomicilio + ", direccion=" + direccion + '}';
    }
    
}
