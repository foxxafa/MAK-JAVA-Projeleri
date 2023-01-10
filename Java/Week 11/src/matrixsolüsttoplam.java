
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class matrixsolüsttoplam
{

    public static void main(String[] args) 
    {
        Scanner inp = new Scanner(System.in);
        Random rnd=new Random();
        int n = inp.nextInt();
        
        int[][] A=new int[n][n];
        
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                A[i][j]=rnd.nextInt(n);
                System.out.print(A[i][j]+",");
            }
            System.out.println("");
        }
        
        int toplam=0;
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                if((i+j)<(n))
                {
                    toplam+=A[i][j];
                }
            }
        }
        
        System.out.println(toplam);
        
        //System.out.println(A[5][2]);
    }

}
