package samuelflores_lab5;

import java.util.ArrayList;

public class Escuadrones {
    private String nombre;
    private String localidad;
    private String lema;
    private String lider;
    private String tipo;
    private ArrayList miembro = new ArrayList();

    public Escuadrones() {
    }

    public Escuadrones(String nombre, String localidad, String lema, String lider, String tipo) {
        this.nombre = nombre;
        this.localidad = localidad;
        this.lema = lema;
        this.lider = lider;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getLema() {
        return lema;
    }

    public void setLema(String lema) {
        this.lema = lema;
    }

    public String getLider() {
        return lider;
    }

    public void setLider(String lider) {
        this.lider = lider;
    }

    public Object getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList getMiembro() {
        return miembro;
    }

    public void setMiembro(ArrayList miembro) {
        this.miembro = miembro;
    }

    @Override
    public String toString() {
        return "Escuadrones{" + "nombre=" + nombre + ", localidad=" + localidad + ", lema=" + lema + ", lider=" + lider + ", tipo=" + tipo + ", miembro=" + miembro + '}';
    }
    
    
}
