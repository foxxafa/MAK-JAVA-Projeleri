/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 2foxx
 */
import java.util.Scanner;
public class yüzdehesap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen kabın hacmini giriniz: ");
        double v = input.nextDouble();
        System.out.println("Lütfen su hacmini giriniz: ");
        double vs = input.nextDouble();
        System.out.println("%"+(vs/v)*100);
    }
    
}
