import java.util.Scanner;

public class AutenticacionUsuario {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Autenticación ***");

        final var USUARIO = "admin";
        final var PASSWORD = "123";
        var sc = new Scanner(System.in);
        
        //Pedir credenciales al usuario
        System.out.print("Ingrese nombre de usuario: ");
        var user = sc.nextLine();

        System.out.print("Ingrese contrañesa: ");
        var password = sc.nextLine();
        sc.close();
        //Comparamos valores
        var validacion = USUARIO.equals(user) && PASSWORD.equals(password);

        System.out.println("¿Los datos son correctos?: " + validacion);
    }
}
