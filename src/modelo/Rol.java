package modelo;

/**
 *
 * @author Lenovo Jorge
 */
public class Rol {
    // ATRIBUTOS
    private int idRol;
    private String nombreRol;

    // CONSTRUCTOR VACÍO
    public Rol() {
    }

    // CONSTRUCTOR CON PARÁMETROS
    public Rol(int idRol, String nombreRol) {

        this.idRol = idRol;
        this.nombreRol = nombreRol;
    }

    // GETTERS Y SETTERS

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }

    // TO STRING

    @Override
    public String toString() {
        return nombreRol;
    }
}
