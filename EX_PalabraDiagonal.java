
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author zelay
 */
public class EX_PalabraDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String palabra;
        char caracter;
        System.out.println("Ingrese una palabra");
        palabra = leer.next();
        for (int i = 0; i < palabra.length(); i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            caracter = palabra.charAt(i);
            System.out.println(caracter);
        }

        for (int k = palabra.length() - 1; k >= 0; k--) {
            for (int j = 0; j < k; j++) {
                System.out.print(" ");
            }
            caracter = palabra.charAt(k);
            System.out.println(caracter);
        }
    } 
}
