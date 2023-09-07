/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unipiloto.estdatos.colas.mundo;

import java.util.Iterator;

/**
 *
 * @author SG702-15
 */
public class ListaDoble<T> implements Iterable<T>{
    //Atributos

    private Nodo<T> primero;

    //Constructor por defecto
    public ListaDoble() {
        listaVacia();
    }

    //Vacia la lista
    private void listaVacia() {
        primero = null;
    }

    //Indica si la lista esta vacia
    public boolean estaVacia() {
        return primero == null;
    }

    //Insertar al pricipio de la lista
    public void insertarPrimero(T t) {
        Nodo<T> nuevo = new Nodo<>(t);

        if (!estaVacia()) {
            //Sino esta vacia, el primero actual pasa a ser
            // el siguiente de nuestro nuevo nodo
            nuevo.setSiguiente(primero);
        }

        //el primero apunta al nodo nuevo
        primero = nuevo;

    }

    //Inserta al final de la lista
    public void insertarUltimo(T t) {

        Nodo<T> aux = new Nodo<>(t);
        Nodo<T> rec_aux;

        if (estaVacia()) {
            insertarPrimero(t);
        } else {
            rec_aux = primero;

            //Buscamos el ultimo nodo
            while (rec_aux.getSiguiente() != null) {
                rec_aux = rec_aux.getSiguiente();
            }

            //Actualizamos el siguiente del ultimo
            rec_aux.setSiguiente(aux);
        }
    }

    //Eliminar primero
    public void quitarPrimero() {
        Nodo<T> aux;
        if (!estaVacia()) {
            aux = primero;
            primero = primero.getSiguiente();
            aux = null; //Lo marcamos para el recolector de basura
        }
    }

    //Eliminar ultimo
    public void quitarUltimo() {
        Nodo<T> aux = primero;
        if (aux.getSiguiente() == null) //Aqi entra, si la lista tiene un elemento
        {
            listaVacia();
        }
        if (!estaVacia()) {
            aux = primero;

            //Buscamos el penultimo, por eso hay dos getSiguiente()
            while (aux.getSiguiente().getSiguiente() != null) {
                aux = aux.getSiguiente();
            }

            //Marcamos el siguiente del antepenultimo como nulo, eliminando el ultimo
            aux.setSiguiente(null);
        }

    }

    @Override
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
