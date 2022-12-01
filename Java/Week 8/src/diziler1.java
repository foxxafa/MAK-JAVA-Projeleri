import java.util.Arrays;
import java.util.Scanner;
public class diziler1
{

    public static void main(String[] args) 
    {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int[] dizi=new int[n];
        for (int i = 0; i < n; i++) 
        {
            dizi[i]=inp.nextInt();
        }
        System.out.println(Arrays.toString(dizi));
        int tpl=0;
        for(int i =0;i<n;i++)
        {
            tpl+=dizi[i];
        }
        System.out.println(tpl);
        System.out.println(tpl/n);
    }

}
