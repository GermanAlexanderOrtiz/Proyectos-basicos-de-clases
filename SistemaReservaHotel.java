import java.util.Scanner;

public class SistemaReservaHotel {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Reserva de Hotel ***");

        //Definir constantes
        final var CON_VISTA_MAR = 190.50;
        final var SIN_VISTA_MAR = 150.50;

        //Pedir datos al usuario
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese su nombre: ");
        var nombre = sc.nextLine();

        System.out.print("¿Cuantos días desea quedarse?: ");
        var diasEstadia = Integer.parseInt(sc.nextLine());

        System.out.print("¿Desea vista al mar (true/false)?: ");
        var tieneVistaMar = Boolean.parseBoolean(sc.nextLine());

        sc.close();

        //Realizar calculos
        var vistaMar = (tieneVistaMar == true) ? "Sí :)": "No :(" ;
        var valorTotal = (tieneVistaMar == true) ? (diasEstadia * CON_VISTA_MAR) : (diasEstadia * SIN_VISTA_MAR);

        System.out.printf("""
                %n------------- Detalles de la reserva ---------------------
                Ususario: %s
                Dias de estadia: %d
                Costo total: $%.2f
                Habitación con vista al mar: %s
                """, nombre, diasEstadia, valorTotal, vistaMar);

    }
}
