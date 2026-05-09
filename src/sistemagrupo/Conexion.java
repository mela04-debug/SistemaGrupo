/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagrupo;

/**
 *
 * @author Melani
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public Connection conectar() {

        Connection con = null;

        try {

            String url =
            "jdbc:sqlserver://26.240.15.208:1433;" +
            "databaseName=ProyectoGrupo;" +
            "encrypt=true;" +
            "trustServerCertificate=true;";

            String user = "grupo";
            String pass = "123456";

            con = DriverManager.getConnection(url, user, pass);

            System.out.println("CONEXIÓN EXITOSA");

        } catch (SQLException e) {
            System.out.println("ERROR SQL: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        return con;
    }
}