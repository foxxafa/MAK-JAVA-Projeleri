
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class sınıf 
{

    public static void main(String[] args)
    {
        Random rnd = new Random();
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int m=inp.nextInt();
        
        int[][] notlar=new int[m][n];
        
        for (int i = 0; i < m; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                notlar[i][j]=rnd.nextInt(100);
            }
        }
        System.out.println(Arrays.deepToString(notlar));
        
        int[] ogrno=new int[n];
        for (int i = 0; i < n; i++) 
        {
            ogrno[i]=(int)(10000+(10000)*rnd.nextDouble());
        }
        
        System.out.println(Arrays.toString(ogrno));
    }

}
