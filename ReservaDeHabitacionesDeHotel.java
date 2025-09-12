public class ReservaDeHabitacionesDeHotel {
    public static void main(String[] args) {
        //Definimos variables
        String nombreCliente = "Juan Peña";
        int diasDeEstancia = 5;
        double tarifaDiaria = 7.00;
        boolean tieneVistaMar = false;

        System.out.println("******** Sistema de reservaciones de hotel ********" + "\n\n");

        System.out.println("Nombre Cliente: " + nombreCliente + "\n" + "Dias de estancia: " + diasDeEstancia + "\n" +
         "Tarifa Diaria: " + tarifaDiaria + "\n" + "Cuenta con vista al mar: " + tieneVistaMar + "\n\n");

        //Alteramos variables
        nombreCliente = "Carlos Rueda";
        diasDeEstancia = 10;
        tarifaDiaria = 10.00;
        tieneVistaMar = true;
        
        System.out.println("Nombre Cliente: " + nombreCliente + "\n" + "Dias de estancia: " + diasDeEstancia + "\n" +
         "Tarifa Diaria: " + tarifaDiaria + "\n" + "Cuenta con vista al mar: " + tieneVistaMar + "\n\n");

        System.out.println("******** Fin del sistema ********");
    }

}
