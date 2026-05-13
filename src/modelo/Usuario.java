package modelo;
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
    private int idEmpleado;

    public Usuario() {
    }

    public Usuario(int idUsuario,
                   String username,
                   String passwordHash,
                   String estado,
                   int idEmpleado) {

        this.idUsuario = idUsuario;
        this.username = username;
        this.passwordHash = passwordHash;
        this.estado = estado;
        this.idEmpleado = idEmpleado;
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

    public int  getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
     @Override
    public String toString() {
        return username;
    }
}