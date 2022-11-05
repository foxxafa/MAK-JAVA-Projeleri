
import java.util.Scanner;
public class energy {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        double m = input.nextDouble();
        double g = 9.8;
        double h = input.nextDouble();
        double v = input.nextDouble();
        System.out.println("Kütleinin potansiyel enerjisi: "+m*g*h);
        System.out.println("Kütlenin kinetik enerjisi: "+(m*Math.pow(v, 2))/2);
    }
    
}
