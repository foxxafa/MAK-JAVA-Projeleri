
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Insertion_sort 
{
    //insertion sort
    public static int[] ınsertion(int[] a)
    {
        for (int i = 0; i < a.length-1;i++) 
        {
            for (int j = i; j >= 0; j--) 
            {
                if(a[j]>a[j+1])
                {
                    int g=a[j];
                    a[j]=a[j+1];
                    a[j+1]=g;
                    System.out.println(Arrays.toString(a));
                }
                else break;
            }
        }
        return a;
    }
    
    //random dizi oluşturma.Dizide her sayıdan bir tane
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
        int[] a =rndarray(n);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(ınsertion(a)));
    }

}
