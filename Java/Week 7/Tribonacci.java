
import java.util.Scanner;


public class Tribonacci 
{

    public static void main(String[] args) 
    {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int b1=1;
        int b2=1;
        int b3=2;
        for (int i = 1; i <= n; i++) 
        {
            int tpl=b1+b2+b3;
            System.out.println(b3);
            b1=b2;
            b2=b3;
            b3=tpl;
        }
    }

}
