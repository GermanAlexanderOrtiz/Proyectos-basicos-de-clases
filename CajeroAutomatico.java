import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        double saldo = 1000.00;
        var menu = """
                *** Aplicación de Cajero Automático ***
                Operaciones que puedes realizar:
                1. Consultar saldo
                2. Retirar
                3. Depositar
                4. Salir
                Escoje una opcion:
                """;
        
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 4) {
            System.out.print(menu);
            opcion = Integer.parseInt(sc.nextLine());
            switch (opcion) {
                case 1 -> System.out.println( "\nTu saldo actual es de: " + saldo + "\n");
                case 2 -> {
                    System.out.print("\n¿Cuánto desea retirar?: ");
                    var retiro = Double.parseDouble(sc.nextLine());
                    if (retiro <= saldo){
                        System.out.println("\nRetiro éxitoso. \n Saldo actual: " + (saldo - retiro) + "\n");
                    saldo -= retiro;
                    }
                    else  System.out.println("\nNo tienes suficiente saldo para hacer el retiro. \n Saldo actual: " + saldo + "\n");
                }
                case 3 -> {
                    System.out.print("\n¿Cuánto desea depositar?: ");
                    var deposito = Double.parseDouble(sc.nextLine());
                    System.out.println("\nDeposito éxitoso. \n Saldo actual: " + (saldo + deposito) + "\n");
                    saldo -= deposito;
                }
                case 4 ->{
                    System.out.println("\nSaliendo del sistema.");
                    opcion = 4;  
                    sc.close();
                } 
                default -> System.out.println("\nOpción inválida, seleccione una opción válida\n");
            }
        }
    }
}
