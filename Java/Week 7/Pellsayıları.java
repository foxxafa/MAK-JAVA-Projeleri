import java.util.Scanner;
import java.lang.Math;
public class Pellsayıları 
{
    public static double hspl(int x)
    {
        return (Math.pow(1+Math.sqrt(2),x)-Math.pow(1-Math.sqrt(2),x))/(2*Math.sqrt(2));
    }
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        int n=inp.nextInt();
        for (int i = 1; i <=n ; i++) 
        {
            System.out.println(Math.round(hspl(i)));
        }
        
    }

}
