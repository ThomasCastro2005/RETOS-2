package Retos;

import java.util.Scanner;

public class Reto4 {
    public static void main(String[] args) {
        Scanner capturar = new Scanner(System.in);
        String[][] mExpendedora = new String[4][4];

        for (int filas = 0; filas < 4; filas++) {
            for (int columnas = 0; columnas < 4; columnas++) {
                int precio;
                String nombrePro;
                System.out.print("Ingrese el nombre del producto en la posición [" + filas + "][" + columnas + "]: ");
                nombrePro = capturar.next();

                System.out.print("Ingrese el precio del producto " + nombrePro + ": ");
                precio = capturar.nextInt();

                String converPrecio = precio + "";
                mExpendedora[filas][columnas] = nombrePro + converPrecio;
            }
        }
        
        System.out.println("---------------------------------------------");
        for (int filas = 0; filas < 4; filas++) {
            for (int columnas = 0; columnas < 4; columnas++) {
                System.out.print("[" + filas + "][" + columnas + "]: " + mExpendedora[filas][columnas] + "\t");
            }
            System.out.println();
        }
    }
}
