package modelo;
/**
 *
 * @author Lenovo Jorge
 */
public class Empleado {

    private int idEmpleado;
    private String nombreEmpleado;
    private String apellidoEmpleado;

    public Empleado() {
    }

    public Empleado(int idEmpleado,
                     String nombre,
                     String apellido) {

        this.idEmpleado = idEmpleado;
        this.nombreEmpleado = nombre;
        this.apellidoEmpleado = apellido;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombreEmpleado;
    }

    public void setNombre(String nombre) {
        this.nombreEmpleado = nombre;
    }

    public String getApellido() {
        return apellidoEmpleado;
    }

    public void setApellido(String apellido) {
        this.apellidoEmpleado = apellido;
    }
}