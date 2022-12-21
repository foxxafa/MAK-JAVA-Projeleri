
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;



public class maxbulma
{
    public static int[] rndarray(int n)
    {
        Random rnd = new Random();
        int[] a=new int[n];
        for (int i = 0; i < a.length; i++) 
        {
            a[i]=rnd.nextInt(100);
        }
        return a;
    }
    public static void main(String[] args) 
    {
        Scanner inp = new Scanner(System.in);
        int n =inp.nextInt();
        
        int[] a=rndarray(n);
        int max=a[0];
        int adres=0;
        for (int i = 1; i < a.length; i++) 
        {
            if(max<a[i])
            {
                max=a[i];
                adres=i;
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println(max);
        System.out.println(adres);
    }

}
