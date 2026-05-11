package modelo;
//import java.util.Date;

import vista.EmpleadoForm;

/**
 *
 * @author Lenovo Jorge
 */
public class Usuario {

    private int idUsuario;
    private String username;
    private String passwordHash;
    private String estado;

    // RELACIÓN CON EMPLEADO
    private EmpleadoForm empleado;

    public Usuario() {
    }

    public Usuario(int idUsuario,
                   String username,
                   String passwordHash,
                   String estado,
                   EmpleadoForm empleado) {

        this.idUsuario = idUsuario;
        this.username = username;
        this.passwordHash = passwordHash;
        this.estado = estado;
        this.empleado = empleado;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public EmpleadoForm getEmpleado() {
        return empleado;
    }

    public void setEmpleado(EmpleadoForm empleado) {
        this.empleado = empleado;
    }
}