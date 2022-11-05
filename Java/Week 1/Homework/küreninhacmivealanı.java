/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 2foxx
 */
import java.lang.Math;
import java.util.Scanner;
public class küreninhacmivealanı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        double r = input.nextDouble();
        System.out.println("Kürenin Alanı"+4*Math.PI*r*r);
        System.out.println("Kürenin Hacimi"+(4/3)*Math.PI*Math.pow(r, 3));
    }
    
}
