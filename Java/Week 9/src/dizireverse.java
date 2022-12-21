
import java.util.Arrays;
import java.util.Scanner;

public class dizireverse 
{

    public static void main(String[] args)
    {
        int[] a =dizilerrnd.rndarray(6);
        System.out.println(Arrays.toString(a));
        Scanner inp=new Scanner(System.in);
        int as=a.length/2;
        for (int i = 0; i <as; i++) 
        {
            int g=a[i];
            a[i]=a[a.length-i-1];
            a[a.length-i-1]=g;
        }
        System.out.println(Arrays.toString(a));
    }

}
