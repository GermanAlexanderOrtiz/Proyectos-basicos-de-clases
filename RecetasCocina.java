import java.util.Scanner;

public class RecetasCocina {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Recetas de Cocina ***");

        //Abrir scanner
        var sc = new Scanner(System.in);

        //Pedimos las Variables
        System.out.print("Nombre de la receta: ");
        var nombreReceta = sc.nextLine();

        System.out.print("Ingredientes: ");
        var ingredientesReceta = sc.nextLine();

        System.out.print("Tiempo de preparacion (mins): ");
        var tiempoPreparacion = Integer.parseInt(sc.nextLine());

        System.out.print("Ingresa la dificultad: ");
        var dificultad = sc.nextLine();
        sc.close();

        //Imprimimos los valores
        System.out.println("\n*** Receta de cocina ***");
        System.out.println("Nombre receta: " + nombreReceta);
        System.out.println("Ingredientes: " + ingredientesReceta);
        System.out.println("Tiempo de preparación: " + tiempoPreparacion);
        System.out.println("Dificultad (Fácil/Medio/Difícil): " + dificultad);
    }
}
