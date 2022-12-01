
import java.util.Scanner;


public class Madhavapihesaplama
{

    public static void main(String[] args) 
    {
        Scanner inp = new Scanner(System.in);
        int n=inp.nextInt();
        double t=0;
        for (int i = 0; i <= n-1; i++) 
        {
            t+=(Math.pow(-1, i))/((double)(2*i+1)*Math.pow(3, i));
        }
        System.out.println(Math.sqrt(12)*t);
    }

}
