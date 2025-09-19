import java.util.Scanner;

public class SistemaDeEnvios {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Envios ***");

        final var ENVIO_NACIONAL = 10.0;
        final var ENVIO_INTERNACIONAL = 20.0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese destino (nacional/internacional): ");
        var destino = sc.nextLine().toLowerCase();
        System.out.print("Ingrese peso de su paquete (Kg): ");
        var peso = Double.parseDouble(sc.nextLine());
        sc.close();
        var tarifa = 0.0;
        if (destino.equals("nacional"))
            tarifa = peso * ENVIO_NACIONAL;
            else tarifa = peso * ENVIO_INTERNACIONAL;
        
        System.out.printf("""
                %n El costo del envio para su paquete es de: $%.1f %n con peso de: %.1fKg %n con escala: %s
                """, tarifa, peso, destino);
    }
}
