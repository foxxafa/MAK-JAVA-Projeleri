
import java.util.Scanner;


public class Maclaurinehesaplama 
{
    public static double fact(int x)
    {
        double c=1;
        for (int i = 1; i <=x; i++) 
        {
            c*=i;
        }
        return c;
    }

    public static void main(String[] args) 
    {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        double tpl=0;
        for (int i = 0; i <= n; i++) 
        {
            tpl+=Math.pow(1, i)/fact(i);
        }
        System.out.println(tpl);
    }

}
