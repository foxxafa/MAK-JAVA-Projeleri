
import java.util.Random;
import java.util.Scanner;


public class Montecarlopihesaplama 
{

    public static void main(String[] args) 
    {
        Scanner inp = new Scanner(System.in);
        Random rnd = new Random();
        int n =inp.nextInt();
        int syc=0;
        for (int i = 1; i <= n; i++) 
        {
            double x=rnd.nextDouble();
            double y=rnd.nextDouble();
            
            if(x*x+y*y<1)
            {
                syc+=1;
            }
        }
        System.out.println(4*((double)syc/(double)n));
        
    }

}
