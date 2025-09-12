public class GeneradorEmail {
    public static void main(String[] args) {

        System.out.println("*** Generador de Emails ***");

        //Declaramos variables
        var nombre = "German Alexander Ortiz Peña";
        var empresa = "Nix Coorporation";
        var dominio = "com.co";

        // estandarisamos a minusculas y quitamos espacios

        var nombreMinusculas = nombre.toLowerCase().replace(" ", ".");
        var empresaMinusculas = empresa.toLowerCase().replace(" ", "");
        var dominioEstandarizado = "@" + empresaMinusculas + "." + dominio;

        // Generamos email
        var email = new StringBuilder();
        email.append(nombreMinusculas).append(dominioEstandarizado);

        System.out.println("Email generado: " + email);
    }
}
