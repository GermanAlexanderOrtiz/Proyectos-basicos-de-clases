import java.util.Scanner;

public class MaayorDeDosNumeros {
    public static void main(String[] args) {
        System.out.println("*** Sistema para saber si un número es mayor que otro ***");

        // Pedir numeros
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        var numero1 = Integer.parseInt(sc.nextLine());
        
        System.out.print("Ingrese el segundo número: ");
        var numero2 = Integer.parseInt(sc.nextLine());
        
        sc.close();

        if (numero1 > numero2) {
            System.out.println("El número: " + numero1 + " es mayor");
        }else{
            System.out.println("El número: " + numero2 + " es mayor");
        }

    }
}
