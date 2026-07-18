
package utils;


public class ValidadorEmail {
    
    // public static: Não necessita de objeto na classe
    public static boolean validarEmail(String email) {
        return email.contains("@") && email.contains(".");
    }
}
