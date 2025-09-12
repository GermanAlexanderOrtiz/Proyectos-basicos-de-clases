import java.util.Scanner;

public class SistemaAdministracionDeCuentas {
    public static void main(String[] args) {
        System.out.println("*** Sitema de administracion de cuentas ***");

        String menu = """
                1. Crear cuenta.
                2. Eliminar cuenta.
                3. Salir.
                """;
        
        Scanner sc = new Scanner(System.in);

        var opcion = 0;
        while (opcion != 3) {
            System.out.println("Eliga una opcion: ");
            System.out.println("\n" + menu);
            opcion = Integer.parseInt(sc.nextLine());
                switch (opcion) {
                    case 1:
                        System.out.println("Creando cuenta...");
                        System.out.println("\nSe creó la cuenta con éxito");
                        break;
                    case 2:
                        System.out.println("Elmininando cuenta...");
                        System.out.println("\nSe eliminó la cuenta con éxito");
                        break;
                    case 3:
                        System.out.println("Saliendo del sistema...");
                        System.out.println("\nSe salió del sistema con exíto.");
                        opcion = 3;
                        break;
                    default:
                        System.out.println("opcion invalida");
                        break;
                }
        }
        sc.close();
        
    }
}
