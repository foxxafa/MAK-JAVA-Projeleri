
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class minbulma 
{
    public static int[] rndarray(int n)
    {
        Random rnd = new Random();
        int[] a=new int[n];
        for (int i = 0; i < a.length; i++) 
        {
            a[i]=rnd.nextInt(n);
        }
        return a;
    }

    public static void main(String[] args)
    {
        
        Scanner inp = new Scanner(System.in);
        int n =inp.nextInt();
        
        int[] a=rndarray(n);
        
        int min=a[0];
        int adres=0;
        for (int i = 1; i < a.length; i++) 
        {
            if(min>a[i])
            {
                min=a[i];
                adres=i;
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println(min);
        System.out.println(adres);
    }

}
