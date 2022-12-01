import java.util.Scanner;
import java.lang.Math;
public class deneme 
{

    public static void main(String[] args) 
    {
        //                       b s
        //                     b s
        //                   b s 
        //fibonacci sayıları 1 1 2 3 5 8 13 21
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int b1=1;
        int b2=1;
        for (int i = 1; i <= n; i++) 
        {
            int tpl=b1+b2;
            System.out.println(b2);
            b1=b2;
            b2=tpl;
        }
    }

}
