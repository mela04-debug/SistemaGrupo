package modelo;
import java.util.Date;
/**
 *
 * @author Lenovo Jorge
 */
public class Auditoria {
    
    private int idAuditoria;
    private String tablaAfectada;
    private String operacion;
    private int idUsuario;
    private Date fechaHora;
    private String datosAnteriores;
    private String datosNuevos;
    
    public Auditoria() {
    }
    
    public Auditoria (int idAuditoria, String tablaAfectada,
                        String operacion, int idUsuario, Date fechaHora,
                        String datosAnteriores, String datosNuevos){
        
        this.idAuditoria = idAuditoria;
        this.tablaAfectada = tablaAfectada;
        this.operacion = operacion;
        this.idUsuario = idUsuario;
        this.fechaHora = fechaHora;
        this.datosAnteriores = datosAnteriores;
        this.datosNuevos = datosNuevos;
    }

    public int getIdAuditoria() {
        return idAuditoria;
    }

    public void setIdAuditoria(int idAuditoria) {
        this.idAuditoria = idAuditoria;
    }

    public String getTablaAfectada() {
        return tablaAfectada;
    }

    public void setTablaAfectada(String tablaAfectada) {
        this.tablaAfectada = tablaAfectada;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getDatosAnteriores() {
        return datosAnteriores;
    }

    public void setDatosAnteriores(String datosAnteriores) {
        this.datosAnteriores = datosAnteriores;
    }

    public String getDatosNuevos() {
        return datosNuevos;
    }

    public void setDatosNuevos(String datosNuevos) {
        this.datosNuevos = datosNuevos;
    }
}
