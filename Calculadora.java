import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        var menu = """
                *** Calculadora java ***

                1. Suma
                2. Resta
                3. Multiplicación
                4. Division
                5. Salir
                
                Seleccione una opción:\s""";
        
        double num1 = 0.0, num2 = 0.0, resultado = 0.0;
        var salir = false;
        int opcion;
        Scanner sc = new Scanner(System.in);

        while (!salir) {
            System.out.print(menu);
            opcion = sc.nextInt();
            if (opcion >= 1 && opcion <=4) {
                System.out.print("Digita el primer número: ");
                num1 = sc.nextDouble();
                System.out.print("Digita el segundo número: ");
                num2 = sc.nextDouble();
            }
            switch (opcion) {
                case 1 -> {
                    resultado = num1 + num2;
                    System.out.println("\nLa suma de: " + num1 + " y " + num2 + " es: " + (resultado) + "\n");
                }
                case 2 -> {
                    resultado = num1 - num2;
                    System.out.println("\nLa resta de: " + num1 + " y " + num2 + " es: " + (resultado) + "\n");
                }
                case 3 ->{
                    resultado = num1 * num2;
                    System.out.println("\nLa multiplicaión de: " + num1 + " y " + num2 + " es: " + (resultado) + "\n");
                }
                case 4 ->{
                    if (num2 == 0) {
                        System.out.println("Error, división entre 0" + "\n");
                    }else {
                        resultado = num1 / num2;
                        System.out.println("\nLa división de: " + num1 + " entre " + num2 + " es: " + (resultado) + "\n");
                    }
                }
                case 5 ->{
                    System.out.println("\nSaliendo del sistema...");
                    salir = true;
                    sc.close();
                }
                default -> System.out.println("\nOpción inválida.\n");
            }
        }
    }
}
