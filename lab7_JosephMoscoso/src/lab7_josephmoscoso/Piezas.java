/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_josephmoscoso;

/**
 *
 * @author joseph
 */
public class Piezas {
    private String nombre;
    private String material;
    private int tamaño;
    private int tiempo;

    public Piezas() {
    }

    public Piezas(String nombre, String material, int tamaño, int tiempo) {
        this.nombre = nombre;
        this.material = material;
        this.tamaño = tamaño;
        this.tiempo = tiempo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
