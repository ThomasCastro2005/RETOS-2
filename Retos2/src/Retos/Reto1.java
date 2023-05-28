package Retos;
import java.util.Scanner;
/* Construya un programa que solicite la cantidad de notas a evaluar en
 una materia y el valor de cada una de dichas notas. Calcule el
 promedio de dichas de notas para obtener la nota final y agregue las
 siguientes anotaciones según corresponda:*/

public class Reto1 {
    public static void main(String[] args) {
        Scanner capturar = new Scanner(System.in);
        float valorNota = 0;
        float valorTotal = 0;
        int canNotas;
        float promedio = 0;
        

        System.out.println("Ingrese la cantidad de  notas a evaluar en una materia: ");
        canNotas = capturar.nextInt();

        for (int i = 0; i<canNotas; i++){
            System.out.println("Calificacion del (1) al (5) \n");
            System.out.println("ingrese el valor de la nota " + (i+1) + ": ");
             valorNota = capturar.nextFloat();
             valorTotal = valorTotal + valorNota;
            System.out.println("El valor de la nota " + (i+1) + " es: " + valorNota);
            System.out.println("------------------------------------------------------");
        }

        promedio = valorTotal / canNotas;
        System.out.println("Su promedio es de: " + promedio + "\n");



        if(promedio <= 3.0){
            System.out.println("tu nota promedio es de: " + promedio + ", lo que quiere decir que REPROBASTE");
        }else if(promedio >= 3.0 && promedio <= 4.0){
            System.out.println("tu nota promedio es de: " + promedio + ", lo que quiere decir que PASASTE RASPANDO");
        }else if(promedio > 4.0){
            System.out.println("tu nota promedio es de: " + promedio + ", lo que quiere decir que APROBASTE CON BUESNOS RESULTADOS");
        }

    }
}
