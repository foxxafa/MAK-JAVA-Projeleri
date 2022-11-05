/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

/**
 *
 * @author 2foxx
 */
import java.util.Scanner;
public class excample3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        
        int toplam =a+b+c;
        System.out.println(toplam);
        System.out.println(a*b*c);
        System.out.println(toplam/3);
    }
    
}
