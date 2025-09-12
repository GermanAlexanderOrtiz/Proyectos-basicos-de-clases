import java.util.Random;
import java.util.Scanner;

public class GeneradorID {
    public static void main(String[] args) {
        //Abrimos scanner
        System.out.println("*** Generador de ID ***");
        var sc = new Scanner(System.in);
        //Definimos variables
        System.out.print("Ingresa tu Nombre: ");
        var nombre = sc.nextLine();
        
        System.out.print("Ingresa tu Apellido: ");
        var apellido = sc.nextLine();

        System.out.print("Ingresa año de nacimiento (YYYY): ");
        var anioDeNacimiento = sc.nextLine();
        sc.close();

        //Generamos el numero aleatorio entre 1 y 999
        var random = new Random();
        var numeroAleatorio = random.nextInt(9999) +1;

        //Obtenemos los dos primeros caracteres y pasamos a mayusculas
        var primerosCaracteresNombre = nombre.substring(0,2).toUpperCase();
        var primerosCaracteresApellido = apellido.substring(0,3).toUpperCase();
        var ultimosCaracteresAnio = anioDeNacimiento.substring(2);

        var mensaje = """
                \nHola, %s.
                Tu nuevo número de identificación (ID) generado por el sistema es:
                %s%s%s%04d
                ¡Felicidades!
                """.formatted(nombre, primerosCaracteresNombre, primerosCaracteresApellido, ultimosCaracteresAnio, numeroAleatorio);
        
        System.out.println(mensaje);
    }
}
