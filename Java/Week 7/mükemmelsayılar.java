import java.util.Scanner;
import java.lang.Math;
public class mükemmelsayılar 
{
    public static boolean asalmı(double x)
    {
        int syc=0;
        for (int i = 1; i <=x; i++) 
        {
            if(x%i==0)
            {
                syc+=1;
            }
        }
        if(syc==2)
        {
            return true;
        }
        else return false;
    }
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        int n= inp.nextInt();
        
        for (int i = 1; i <= n; i++) 
        {
            double a=Math.pow(2, i);
            double b=Math.pow(2, i+1)-1;
            if(asalmı(b))
            {
                System.out.println(a*b);
            }
        }
    }

}
