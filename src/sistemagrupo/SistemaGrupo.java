
package sistemagrupo;
import dao.UsuarioDAO;

/**
 *
 * @author Melani
 */
public class SistemaGrupo {

    public static void main(String[] args) {

        UsuarioDAO usuarioDAO =
                new UsuarioDAO();

        boolean acceso =
                usuarioDAO.login(
                        //pendiente crear usuario con privilegios
                        "jmendoza",
                        "123456"
                );

        if (acceso) {

            System.out.println(
                    "LOGIN CORRECTO"
            );

        } else {

            System.out.println(
                    "USUARIO O PASSWORD INCORRECTOS"
            );

        }
    }
}