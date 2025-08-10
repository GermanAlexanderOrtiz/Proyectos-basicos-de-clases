import java.util.Scanner;

public class EstacionDelAnio {
    public static void main(String[] args) {
        System.out.println("*** Sistema para Identificar la Estacion del Año ***");

        //Pedir numero del mes
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese número de mes: ");
        var mes = Integer.parseInt(sc.nextLine());
        sc.close();
        //Calcular estación
        if (mes == 1 || mes == 2 || mes == 12) {
            System.out.println("La estación es: Invierno.");
        }else if (mes == 3 || mes == 4 || mes == 5) {
            System.out.println("La estación es: Primavera.");
        }else if (mes == 6 || mes == 7 || mes == 8) {
            System.out.println("La estación es: Verano.");
        }else if (mes == 9 || mes == 10 || mes == 11) {
            System.out.println("La estación es: Otoño.");
        }else{
            System.out.println("Estación desconocida.");
        }
    }
}
