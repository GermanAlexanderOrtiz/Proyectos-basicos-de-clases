import java.util.Random;
import java.util.Scanner;

public class JuegoNumeroSecreto {
    public static void main(String[] args) {
        System.out.println("Bien venido al Juego del Número Secreto\n\n Tienes 3 intentos para adivinar el número secreto de 1 - 10");

        var sc = new Scanner(System.in);
        var random = new Random();
        int numeroAleatorio = random.nextInt(10) + 1;
        int vidas = 3;
        int intentos = 0;
        boolean adivinado = false;
        while ( vidas > 0 && !adivinado) {
            System.out.print("¿Cuál crees que es el número secreto?: ");
            int intento = sc.nextInt();
            intentos++;

            if (intento == numeroAleatorio) {
                adivinado = true;
                System.out.println("\nFelicidades, has adivinado el número " + numeroAleatorio 
                                 + " en " + intentos + " intento" + (intentos > 1 ? "s" : ""));
            } else {
                vidas--;
                System.out.println("Vidas restantes: " + vidas);
                System.out.println("El número secreto es " + (intento < numeroAleatorio ? "mayor" : "menor"));
                System.out.println("--------------------------");
            }
            if (vidas == 0) {
                System.out.println("\nLo siento, mejor suerte a la próxima. El número secreto era: " + numeroAleatorio);
                sc.close();
                adivinado = true;
            }
            
    
        }

    }
}

