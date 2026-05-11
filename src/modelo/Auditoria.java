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
    //Relacion con Usuario
    private Usuario usuario;
    
    private Date fecha;
   
    private String datosAnteriores;
    private String datosNuevos;

    public Auditoria() {
    }

    public Auditoria(int idAuditoria,
                     Usuario usuario,
                     String tablaAfectada,
                     String operacion,
                     String datosAnteriores,
                     String datosNuevos,
                     Date fecha) {

        this.idAuditoria = idAuditoria;
        this.usuario = usuario;
        this.tablaAfectada = tablaAfectada;
        this.operacion = operacion;
        this.datosAnteriores = datosAnteriores;
        this.datosNuevos = datosNuevos;
        this.fecha = fecha;
    }

    public int getIdAuditoria() {
        return idAuditoria;
    }

    public void setIdAuditoria(int idAuditoria) {
        this.idAuditoria = idAuditoria;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
