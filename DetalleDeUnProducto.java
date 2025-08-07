public class DetalleDeUnProducto {

    public static void main(String[] args) {
        //Definimos variables
        String nombreProducto = "Vaso de vidreo";
        double precio = 1.55;
        int cantidadDisponible = 50;
        boolean estaDisponible = true;
        
        System.out.println("Nombre del Producto "+ nombreProducto + "\n" +
         "Precio: " + precio + "$" + " \n" + "Cantidad disponible: " + cantidadDisponible + "\n" +
         "Disponible para venta: " + estaDisponible + "\n\n");
        
        //Alteramos valores
        nombreProducto = "Peluches";
        precio = 5.00;
        cantidadDisponible = 0;
        estaDisponible = false;

        System.out.println("Nombre del Producto "+ nombreProducto + "\n" +
         "Precio: " + precio + "$" + " \n" + "Cantidad disponible: " + cantidadDisponible + "\n" +
         "Disponible para venta: " + estaDisponible);
    }

}
