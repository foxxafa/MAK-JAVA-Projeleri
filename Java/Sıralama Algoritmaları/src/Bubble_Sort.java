import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Bubble_Sort 
{
    public static int[] bubble_sort(int[] a)
    {
        for (int i = 0; i < a.length; i++) 
        {
            for (int j = 0; j < a.length-i-1; j++) 
            {
                if(a[j]>a[j+1])
                {
                    int g=a[j];
                    a[j]=a[j+1];
                    a[j+1]=g;
                    System.out.println(Arrays.toString(a));
                }
            }
        }
        return a;
    }
    public static int[] rndarray(int n)
    {
        Random rnd = new Random();
        int[] a = new int[n];
        for (int i = 0; i <n; i++) 
        {
            int rnds=rnd.nextInt(n);
            a[i]=rnds;
            for (int j = 0; j <i; j++) 
            {
                if(a[i]==a[j])
                {
                    rnds=rnd.nextInt(n);
                    i--;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) 
    {
        
        Scanner inp = new Scanner(System.in);
        int n= inp.nextInt();
        int[] a=rndarray(n);
        System.out.println(Arrays.toString(a));
        bubble_sort(a);
    }

}
