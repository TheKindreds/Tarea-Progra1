
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author zelay
 */
public class EX_PiramideNum {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Que numero de filas desea en la piramide");
        int num = sc.nextInt();
        for(int i=1 ; i<=num ;i++){
                for(int o=1;o<i;o++){
                    System.out.print("  ");
                }
                  for(int n=i;n<=num;n++){
                      System.out.print(n+" ");
                  }
                   for(int nu=num-1;nu>=i;nu--){
                       System.out.print(nu+" ");
                   }
                 System.out.println();
            }
        }  
}
