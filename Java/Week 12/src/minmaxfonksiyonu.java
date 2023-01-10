
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class minmaxfonksiyonu 
{
    
    public static void minmax(int a[])
    {
        int min=a[0],mk1=0;
        int max=a[0],mk2=0;
        for (int i = 1; i < a.length; i++) 
        {
            if(min>a[i])
            {
                min=a[i];
                mk1=i;
            }
            if(max<a[i])
            {
                max=a[i];
                mk2=i;
            }
        }
        System.out.println(min);
        System.out.println(max);
        System.out.println(mk1);
        System.out.println(mk2);
    }

    public static void main(String[] args) 
    {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int[] a =new int[n];
        Random rnd = new Random();
        
        //rnd sayılar diziye atılıyor
        for (int j = 0; j < n; j++) 
        {
            a[j]=rnd.nextInt(n*n)+1;
        }
        
        System.out.println(Arrays.toString(a));
        
        minmax(a);
    }

}
