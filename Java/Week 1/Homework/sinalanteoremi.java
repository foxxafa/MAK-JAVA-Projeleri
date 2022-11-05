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
import java.lang.Math;
public class sinalanteoremi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("1. Kenarı giriniz: ");
        double k1=input.nextDouble();
        System.out.println("2. Kenarı giriniz: ");
        double k2=input.nextDouble();
        System.out.println("2 Kenar arasındaki açıyı girin: ");
        double a=input.nextDouble();
        System.out.println("Alan: "+(k1*k2*Math.sin(Math.toRadians(a)))/2);
        
    }
    
}
