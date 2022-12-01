import java.util.Scanner;
import java.lang.Math;
public class Euleriansayısı 
{
    public static int fact(int x)
    {
        int c=1;
        for (int i = 2; i <=x; i++) 
        {
            c*=i;
        }
        return c;
    }
    
    public static void main(String[] args)
    {
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        int m= inp.nextInt();
        double t=Math.pow(n+1, m);
        
        for (int i = 1; i <= n; i++) 
        {
            int c=fact(m+1)/(fact(m+1-i)*fact(i));
            t+=Math.pow(-1, i)*c*Math.pow(n+1-i, m);
        }
        System.out.println(t);
    }

}
