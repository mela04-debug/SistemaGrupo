package dao;

/**
 *
 * @author Lenovo
 */
import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UsuarioDAO {

    Conexion cn = new Conexion();

    public boolean login(String usuario, String password) {

        String sql = """
                     SELECT *
                     FROM usuarios
                     WHERE username = ?
                     AND password_hash = ?
                     AND estado = 'activo'
                     """;

        try {

            Connection con = cn.conectar();

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setString(1, usuario);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                return true;

            }

        } catch (Exception e) {

            System.out.println(
                    "Error login: " + e.toString()
            );

        }

        return false;
    }
}