
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class dizilerrnd 
{
    public static int[] rndarray(int n)
    {
        Scanner inp = new Scanner(System.in);
        Random rnd = new Random();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) 
        {
            a[i]=rnd.nextInt(100);
        }
        return a;
    }
    public static void main(String[] args) 
    {
        int[] a =rndarray(5);
        System.out.println(Arrays.toString(a));
    }

}
