
import java.util.Scanner;


public class gümüşoran 
{

    public static void main(String[] args) 
    {
        Scanner inp = new Scanner(System.in);
        double u=inp.nextInt();
        double b=u/(2+Math.sqrt(2));
        double a=u*b;
        System.out.println(a);
        System.out.println(b);
    }

}
