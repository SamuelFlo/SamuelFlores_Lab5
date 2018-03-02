package samuelflores_lab5;
public class Villanos {
    private String nombre;
    private String poder;
    private String debilidad;
    private String escuadron;
    private String fuerza;
    private String agilidadfisica;
    private String agilidadmental;

    public Villanos() {
    }

    public Villanos(String nombre, String poder, String debilidad, String escuadron, String fuerza, String agilidadfisica, String agilidadmental) {
        this.nombre = nombre;
        this.poder = poder;
        this.debilidad = debilidad;
        this.escuadron = escuadron;
        this.fuerza = fuerza;
        this.agilidadfisica = agilidadfisica;
        this.agilidadmental = agilidadmental;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public String getEscuadron() {
        return escuadron;
    }

    public void setEscuadron(String escuadron) {
        this.escuadron = escuadron;
    }

    public String getFuerza() {
        return fuerza;
    }

    public void setFuerza(String fuerza) {
        this.fuerza = fuerza;
    }

    public String getAgilidadfisica() {
        return agilidadfisica;
    }

    public void setAgilidadfisica(String agilidadfisica) {
        this.agilidadfisica = agilidadfisica;
    }

    public String getAgilidadmental() {
        return agilidadmental;
    }

    public void setAgilidadmental(String agilidadmental) {
        this.agilidadmental = agilidadmental;
    }

    @Override
    public String toString() {
        return "Superheroes{" + "nombre=" + nombre + ", poder=" + poder + ", debilidad=" + debilidad + ", escuadron=" + escuadron + ", fuerza=" + fuerza + ", agilidadfisica=" + agilidadfisica + ", agilidadmental=" + agilidadmental + '}';
    }
    
}
