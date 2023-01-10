
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class sutuncarpım {

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
        
        int[] b=new int[n];
        for (int i = 0; i < n; i++) 
        {
            int crpm=1;
            for (int j = 0; j < n; j++) 
            {
                crpm*=a[j][i];
            }
            b[i]=crpm;
        }
        
        System.out.println(Arrays.toString(b));
    }

}
