import java.util.Scanner;

public class SistemaCalificaciones {
    public static void main(String[] args) {
        System.out.println("*** Sistema de calificaiones ***");

        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, ingrese su calificación: ");
        var calificacion = Integer.parseInt(sc.nextLine());
        sc.close();
        var nota = "";
        if (calificacion >= 9 && calificacion <= 10)
            nota = "A";
        else if (calificacion >= 8 && calificacion < 9)
            nota = "B";
        else if (calificacion >= 7 && calificacion < 8)
            nota = "C";
        else if (calificacion >= 6 && calificacion < 7)
            nota = "D";
        else if (calificacion >= 0 && calificacion < 6)
            nota = "F";
        else nota = "Valor desconocido";
        System.out.printf("Su calificación es %d para la nota de %s", calificacion, nota);
    }
}
