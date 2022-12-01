
import java.util.Scanner;


public class brothersehesaplama
{
    public static double fact(int x)
    {
        double c=1;
        for (int i = 1; i <= x; i++)
        {
            c*=i;
        }
        return c;
    }

    public static void main(String[] args) 
    {
        Scanner inp = new Scanner(System.in);
        int n=inp.nextInt();
        double tpl=0;
        for (int i = 0; i <= n; i++) 
        {
            tpl+=(2*i+2)/fact(2*i+1);
        }
        System.out.println(tpl);
    }

}
