package conexion;

/**
 *
 * @author Melani
 */
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

    Connection con;

    public Connection conectar() {

        try {

            String url =
            "jdbc:sqlserver://constructora.mssql.somee.com:1433;"
            + "databaseName=constructora;"
            + "encrypt=true;"
            + "trustServerCertificate=true;";

            String user = "melushca_SQLLogin_1";

            // PEGA AQUI LA CONTRASEÑA QUE COPIASTE EN SOMEE
            String password = "jn4pr2114i";

            con = DriverManager.getConnection(url, user, password);

            System.out.println("Conexion exitosa a Somee SQL Server");

        } catch (Exception e) {

            System.out.println("Error de conexion: " + e);
        }

        return con;
    }
}