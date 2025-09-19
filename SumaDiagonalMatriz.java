import java.util.Scanner;

public class SumaDiagonalMatriz {
    public static void main(String[] args) {
        //Definir variables y abrir scanner
        int renglones, columnas;
        var sc = new Scanner(System.in);
        
        System.out.print("Introduce cantidad de renglones: ");
        renglones = Integer.parseInt(sc.nextLine());
        System.out.print("Introduce cantidad de columnas: ");
        columnas = Integer.parseInt(sc.nextLine());
        var matriz = new int[renglones][columnas];

        //Rellenar los valores
        
        for(var ren = 0; ren < renglones; ren++){
            for(var col = 0; col < columnas; col++){
                System.out.print("Introduce el valor[" + ren + "][" + col + "]: ");
                matriz[ren][col] = Integer.parseInt(sc.nextLine());
            }
        }
        //Suma diagonal de la matriz
        var SumaDiagonalMatriz = 0;
        System.out.println("");
        for(var ren = 0; ren < renglones; ren++){
            for(var col = 0; col < columnas; col++){
                if (ren == col) {
                    SumaDiagonalMatriz+= matriz[ren][col];
                }
            }
        }
        System.out.println("Valor de la suma: " + SumaDiagonalMatriz);
        sc.close();
    }
}
