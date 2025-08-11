import java.util.Scanner;

public class EstacionAnioConSwitch {
    public static void main(String[] args) {
        System.out.println("*** Sistema para Identificar la Estacion del Año ***");

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese número de mes (1/12): ");
        var mes = Integer.parseInt(sc.nextLine());
        sc.close();
        var estacion = switch (mes) {
            case 1, 2, 12 -> "Invierno";
            case 3, 4, 5 -> "Primavera";
            case 6, 7, 8 -> "Verano";
            case 9, 10, 11 -> "Otoño"; 
            default ->"Estación desconocida";
        };
        System.out.printf("La estacion para el mes %d es %s", mes, estacion);
    }
}
