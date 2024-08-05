
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author zelay
 */
public class EX_Palindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        System.out.print("Ingresar una palabra: ");
        String palabra = sc.next().toLowerCase();

        int inicio = 0;
        int fin = palabra.length() - 1;
        boolean palindromo = true;

        while (inicio < fin && palindromo) {
            if (palabra.charAt(inicio) != palabra.charAt(fin)) {
                palindromo = false;
            }
            inicio++;
            fin--;
        }

        if (palindromo) {
            System.out.println( palabra + " es un palindromo");
        } else {
            System.out.println( palabra + " no es un palindromo");
        }
    }
}
