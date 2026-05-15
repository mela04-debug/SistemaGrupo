    package conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    
    private static final String URL = "jdbc:sqlserver://localhost:1433;"
            + "databaseName=constructora;"
            + "trustServerCertificate=true;";
    
    private static final String USER = "melani";
    private static final String PASSWORD = "12345";
    
    public static Connection conectar() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("✅ Conexión exitosa!");
            return con;
        } catch (ClassNotFoundException e) {
            System.out.println("❌ Driver no encontrado: " + e.getMessage());
            return null;
        } catch (Exception e) {
            System.out.println("❌ Error de conexión: " + e.getMessage());
            return null;
        }
    }
    
    public static void desconectar(Connection con) {
        try {
            if (con != null && !con.isClosed()) {
                con.close();
                System.out.println("✅ Conexión cerrada!");
            }
        } catch (Exception e) {
            System.out.println("❌ Error al cerrar: " + e.getMessage());
        }
    }
}