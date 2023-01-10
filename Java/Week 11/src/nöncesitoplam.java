
import java.util.Random;
import java.util.Scanner;


public class nöncesitoplam
{

    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int[][] a =new int[n][n];
        Random rnd = new Random();
        
        //rnd sayılar diziye atılıyor
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                a[i][j]=rnd.nextInt(n*n)+1;
            }
        }
        
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                System.out.print(a[i][j]+",");
            }
            System.out.println("");
        }
        
        int tpl=0;
        for (int i = 0; i < n-1; i++) 
        {
            tpl+=a[n-2][i];
        }
        
        for (int i = 0; i < n-1; i++) 
        {
            tpl+=a[i][n-2];
        }
        System.out.println(tpl-a[n-2][n-2]);
    }

}
