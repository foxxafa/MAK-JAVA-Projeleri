
import java.util.Random;
import java.util.Scanner;


public class diziortalama 
{
    public static double diziortalama(int[][] a)
    {
        int tpl=0;
        for (int i = 0; i < a.length; i++) 
        {
            for (int j = 0; j < a.length; j++) 
            {
                tpl+=a[i][j];
            }
        }
        return (1.0)*tpl/((a.length)*(a.length));
    }

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
                a[i][j]=rnd.nextInt(n)+1;
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
        
        System.out.println(diziortalama(a));
    }

}
