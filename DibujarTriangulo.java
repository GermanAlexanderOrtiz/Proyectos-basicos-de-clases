import java.util.Scanner;

public class DibujarTriangulo {
    public static void main(String[] args) {
        System.out.println("*** Dibuja un triánulo ***");
        var sc = new Scanner(System.in);
        System.out.print("Proporciona el número de filas: ");
        var numeroFilas = sc.nextInt();
        sc.close();

        for(var fila = 1; fila <= numeroFilas; fila++){
            var espaciosBlanco = " ".repeat(numeroFilas - fila);
            var asterisco = "*".repeat(2*fila-1);
            System.out.println(espaciosBlanco + asterisco);
        }
    }
}
