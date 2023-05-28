package Retos;
import java.util.Scanner;
/*En una competencia de natación se desea implementar una
aplicación para almacenar el tiempo por cada competidor. El usuario
debe especificar cuantos competidores participarán en la
competencia y digitar los nombres y tiempos de cada uno. Muestre en
pantalla cada nadador con su respectivo tiempo. Plantee de qué
forma podría determinar quien es el ganador*/
public class Reto2 {
    public static void main(String[] args) {
        Scanner capturar = new Scanner(System.in);
        int canCompetidores;
        
        float tiempoMinimo = -1;
        String ganador = "";

        System.out.println("Ingrese la cantidad de competidores: ");
        canCompetidores = capturar.nextInt();
        capturar.nextLine();

        for(int i=0; i<canCompetidores; i++){
            String nombre;
            float tiempo;
            System.out.print("ingrese el nombre del competidor: ");
            nombre = capturar.nextLine();

            System.out.print("ingrese el tiempo: ");
            tiempo = capturar.nextFloat();
            capturar.nextLine();

            System.out.println("El jugador " + (i+1) + ": " + nombre + " tiene un tiempo de: " + tiempo);

            if(tiempoMinimo == -1 || tiempo < tiempoMinimo){
                tiempoMinimo = tiempo;
                ganador = nombre;
            }
        }

        System.out.println("El ganador es " + ganador + " con el tiempo de " + tiempoMinimo);
          

    }
    
}
