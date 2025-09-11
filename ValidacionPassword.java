import java.util.Scanner;

public class ValidacionPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var controlador = false;

        //Validación de password
        while (!controlador) {
            System.out.print("*** Sistema de Validación de Contraseñas *** " + "\n\nIngrese Contraseña: ");
            var password = sc.nextLine().strip().toLowerCase();    
            
            if (password.length() < 6) {
                System.out.println("Contraseña inválida, prueba con otra contraseña.");
            }else{
                System.out.println("Contraseña correcta.");
                controlador = true;
                sc.close();
            }
        }

    }
}
