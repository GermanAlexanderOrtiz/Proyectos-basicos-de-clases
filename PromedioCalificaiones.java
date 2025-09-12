import java.util.Scanner;

public class PromedioCalificaiones {
 public static void main(String[] args) {
    System.out.println("*** Sistema Promedio De Calificaiones ***");

    //Abrir scanner
    Scanner sc = new Scanner(System.in);
    //Pedir cantidad de notas
    System.out.print("Digita la cantidad de calificaciones: ");
    int cantidadNotas = Integer.parseInt(sc.nextLine());

    int[] calificaciones = new int[cantidadNotas];

    for (int i = 0; i < cantidadNotas; i++) {
        System.out.print("Digita las calificaiones[" + i + "]: ");
        calificaciones[i] = Integer.parseInt(sc.nextLine());
    }
    var sumaPromedio = 0;
    for (int i = 0; i < cantidadNotas; i++) {
        sumaPromedio += calificaciones[i];
    }
    var promedio = sumaPromedio/cantidadNotas;
    System.out.println("\n Su promedio es de: " + promedio);
    sc.close();
 }
}
