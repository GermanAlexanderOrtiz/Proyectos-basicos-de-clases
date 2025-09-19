import java.util.Scanner;

public class SistemaDeAutenticacion {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Autenticación ***");

        final var USUARIO = "admin";
        final var PASSWORD = 123;

        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor ingrese usuario: ");
        var usuario = sc.nextLine().strip().toLowerCase();

        System.out.print("Por favor ingrese contraseña: ");
        var password = Integer.parseInt(sc.nextLine());

        sc.close();

        if (USUARIO.equals(usuario) && password == PASSWORD)
            System.out.println("Bienvenido al sistema.");
        else if (USUARIO.equals(usuario) == false && password == PASSWORD)
        System.out.println("Usuario incorrecto.");
        else if (password != PASSWORD && USUARIO.equals(usuario))
        System.out.println("Contraseña incorrecta.");
        else System.out.println("Usuario y contraseña incorrectos");
    }
}
