
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class elemanlarırandomollandizi 
{
    public static int[] randint(int m)
    {
        Random rnd = new Random();
        int[] a=new int[m];
        
        for (int i = 0; i < m; i++) 
        {
            a[i]=rnd.nextInt(m);
        }
        return a;
    }

    public static void main(String[] args) 
    {
        System.out.println(Arrays.toString(randint(10)));   
    }

}
