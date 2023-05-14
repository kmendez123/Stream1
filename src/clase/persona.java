package clase;

/**
 *
 * @author ASUS
 */
public class persona {

    private String nombre;
    private String primer_ape;
    private String segundo_ape;

    public persona() {
    }

    public persona(String nombre, String primer_ape, String segundo_ape) {
        this.nombre = nombre;
        this.primer_ape = primer_ape;
        this.segundo_ape = segundo_ape;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimer_ape() {
        return primer_ape;
    }

    public void setPrimer_ape(String primer_ape) {
        this.primer_ape = primer_ape;
    }

    public String getSegundo_ape() {
        return segundo_ape;
    }

    public void setSegundo_ape(String segundo_ape) {
        this.segundo_ape = segundo_ape;
    }

    @Override
    public String toString() {
        return "persona{" + "nombre=" + nombre + ", primer_ape=" + primer_ape + ", segundo_ape=" + segundo_ape + '}';
    }

}
