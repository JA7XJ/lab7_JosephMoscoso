/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_josephmoscoso;

import java.util.ArrayList;

/**
 *
 * @author joseph
 */
public class Autos {
    private String nombre;
    private ArrayList<Piezas> pieza=new ArrayList();

    public Autos() {
    }

    public Autos(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Piezas> getPieza() {
        return pieza;
    }

    public void setPieza(ArrayList<Piezas> pieza) {
        this.pieza = pieza;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
