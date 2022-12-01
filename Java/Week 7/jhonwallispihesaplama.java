
import java.util.Scanner;


public class jhonwallispihesaplama 
{

    public static void main(String[] args) 
    {
        Scanner inp = new Scanner(System.in);
        int n=inp.nextInt();
        double c=1;
        for (int i = 1; i <= n; i++) 
        {
            double c1=4*i*i;
            c=c*(c1/(c1-1));
        }
        System.out.println(2*c);
    }

}
