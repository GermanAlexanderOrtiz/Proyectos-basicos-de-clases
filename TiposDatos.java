public class TiposDatos {
    public static void main(String[] args) {
        // Tipos de datos en java
        // Datos Enteros
        
        byte tipoByte = 127; // rango de valores -128 - 127 almacena valor 8bits
        System.out.println("tipoByte = " + tipoByte); //En vscode no funciona el atajo de soutv mas sin embargo en IntelleJi o netBeans sí
        
        short tipoShort = 32767; // rango de valores -32768 - 32767 almacena valor 16bits
        System.out.println("tipoShort = " + tipoShort);

        int tipoInt =  2147483647; // rango de valores -2147483648 - 2147483647 almacena valor 32bits
        System.out.println("tipoInt = " + tipoInt);

        long tipoLong = 9223372036854775807L; // rango de valores -9,223,372,036,854,775,808 - 9,223,372,036,854,775,807 almacena valor 64bits se debe de color L para usar el valor máximo
        System.out.println("tipoLong = " + tipoLong);

        // Datos Flotantes 

        float tipoFloat = 3.14F; // rango de valores 3.40282347 x 10^38 (positivo y negativo) almacena valor 32bits y se debe especificar el tipo con una F
        System.out.println("tipoFloat = " + tipoFloat);

        double tipoDouble = 1.79769313486231570; // rango de valores 1.79769313486231570 x 10^308 (positivo y negativo) almacena máximo valor 64bits por defecto cualquier flotante es double
        System.out.println("tipoDouble = " + tipoDouble);

        
    }
}
