package classroom;

public class Persona {

    final long cedula;
    String nombre;
    static int totalPersonas = 0;
    static int cedulasCreadas = 0;

    Persona(long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }
    
    Persona(String nombre, long cedula) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }

    Persona(long cedula) {
        this.cedula = cedula;
        this.nombre = "";
        totalPersonas++;
    }

    Persona(String nombre) {
        this.nombre = nombre;
        this.cedula = cedulasCreadas;
        cedulasCreadas++;
        totalPersonas++;
    }
    
    Persona() {
    	this("");
    }
    
    long getCedula() {
        return cedula;
    }

    String getNombre() {
        return nombre;
    }

    void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
