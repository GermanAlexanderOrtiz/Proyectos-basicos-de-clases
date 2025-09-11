import java.util.Scanner;

public class CalcularAreaRectangulo {
    public static void main(String[] args) {
        System.out.println("*** Calcular Area y Perimetro de un rectangulo ***");

        var sc = new Scanner(System.in);

        System.out.print("Ingrese el valor de la base: ");
        var base = Float.parseFloat(sc.nextLine());

        System.out.print("Ingrese el valor de la altura: ");
        var altura = Float.parseFloat(sc.nextLine());
        sc.close();

        var area = base * altura;
        var perimetro = 2 * (base + altura);

        System.out.printf("""
                \n
                -----------------------
                El area del rectangulo es: %.2f
                El perimetro del rectangulo es: %.2f
                """, area, perimetro);

    }
}
