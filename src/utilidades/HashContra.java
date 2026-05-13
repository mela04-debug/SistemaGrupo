package utilidades;
import java.security.MessageDigest;
/**
 *
 * @author Lenovo Jorge
 */

public class HashContra {

    public static String encriptarSHA256(String texto) {

        try {

            MessageDigest md =
                    MessageDigest.getInstance("SHA-256");

            byte[] hash = md.digest(texto.getBytes("UTF-8"));

            StringBuilder sb = new StringBuilder();

            for (byte b : hash) {
                sb.append(String.format("%02x", b));
            }

            return sb.toString();

        } catch (Exception e) {
            return null;
        }
    }
}