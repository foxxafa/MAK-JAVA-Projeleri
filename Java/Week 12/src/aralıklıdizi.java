
import java.util.Arrays;
import java.util.Scanner;


public class aralıklıdizi 
{
    public static int doğrulama(int a,int b)
    {
        Scanner inp = new Scanner(System.in);
        int sayi;
        do
        {
            sayi=inp.nextInt();
        }
        while(sayi<a | sayi>b);
        return sayi;
    }

    public static void main(String[] args)
    {
        
        int[] a = new int[doğrulama(0,10)];
        
        for (int i = 0; i < a.length; i++) 
        {
            a[i]=doğrulama(10,20);
        }
        
        System.out.println(Arrays.toString(a));
    }

}
