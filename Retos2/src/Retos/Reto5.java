package Retos;
import java.util.Scanner;

public class Reto5 {
    public static void main(String[] args) {
        Scanner capturar = new Scanner(System.in);

        System.out.print("Ingrese el número de filas: ");
        int nFilas = capturar.nextInt();

        System.out.print("Ingrese el número de columnas: ");
        int nColumnas = capturar.nextInt();

        int[][] matriz = new int[nFilas][nColumnas];
        //FOR PARA SOLICITAR EL VALOR DE CADA POSICION
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                System.out.print("Ingrese el valor en la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = capturar.nextInt();
            }
        }

        //FOR PARA MOSTRAR EL VALOR DE CADA POSICION
        System.out.println("La matriz ingresada es:");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        //FOR PAR HACER COMPARACION DE LAS LINEAS DE CODIGO
        System.out.println("Los números iguales en la matriz son:");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                for (int x = i; x < nFilas; x++) {
                    for (int y = (x == i) ? j + 1 : 0; y < nColumnas; y++) {
                        if (matriz[i][j] == matriz[x][y]) {
                            System.out.println("[" + i + "][" + j + "] = [" + x + "][" + y + "] = " + matriz[i][j]);
                        }
                    }
                }
            }
        }

        capturar.close();
    }
}
