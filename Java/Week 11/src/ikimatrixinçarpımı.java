
import java.util.Arrays;
import java.util.Scanner;


public class ikimatrixinçarpımı
{

    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int m = inp.nextInt();
        
        int[][] A=new int[m][n];
        int[][] B=new int[n][m];
        
        for (int i = 0; i < m; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                A[i][j]=inp.nextInt();
                B[j][i]=inp.nextInt();
            }
        }
        
        int[][] crp=new int[m][n];
        for (int i = 0; i < m; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                for (int k = 0; k < m; k++) 
                {
                    crp[n][m]=A[i][k]*B[k][j];
                }
            }
        }
        
        System.out.println(Arrays.deepToString(crp));
    }

}
