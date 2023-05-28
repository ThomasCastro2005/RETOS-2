package Retos;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

/*crear un programa con arreglos que permite realizar la funcion de juego AHORCADO*/

public class Reto3 {
    public static void main(String[] args) {
        Scanner capturar = new Scanner(System.in);
    
        String[] palabras = {"camaleon", "oso", "leche", "memoria"};
        Random random = new Random();
        String palabra = palabras[random.nextInt(palabras.length)];

        char[] letrasCorrectas = new char[palabra.length()];
        Arrays.fill(letrasCorrectas, '_');

        int intentos = 0;
        boolean palabraCompleta = false;

        while (intentos < 6 && !palabraCompleta) {
            System.out.println("Palabra: " + String.valueOf(letrasCorrectas));
            System.out.print("Ingrese una letra: ");
            char letra = capturar.next().charAt(0);
            boolean letraEncontrada = false;

            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(i) == letra) {
                    letrasCorrectas[i] = letra;
                    letraEncontrada = true;
                }
            }

            if (!letraEncontrada) {
                intentos++;
                System.out.println("Letra incorrecta. Intentos restantes: " + (6 - intentos));
            }

            if (Arrays.equals(letrasCorrectas, palabra.toCharArray())) {
                palabraCompleta = true;
            }
        }

        if (palabraCompleta) {
            System.out.println("¡Felicidades! Has adivinado la palabra correctamente: " + palabra);
        } else {
            System.out.println("¡Oh no! Has perdido. La palabra correcta era: " + palabra);
        }

        capturar.close();
    }

}

