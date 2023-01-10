import java.util.Arrays;
import java.util.Scanner;

public class ikinoyutludizitanımlama 
{

    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int m = inp.nextInt();
        
        int[][] A=new int[m][n];
        int[][] B=new int[m][n];
        
        for (int i = 0; i < m; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                A[i][j]=inp.nextInt();
                B[i][j]=inp.nextInt();
            }
        }
        
        System.out.println(Arrays.deepToString(A));
        System.out.println(Arrays.deepToString(B));
        
        int[][] tpl=new int[m][n];
        for (int i = 0; i < m; i++) 
        {
            for (int j = 0; j < n; j++)
            {
                tpl[i][j]=A[i][j]+B[i][j];
            }
        }
        
        System.out.println(Arrays.deepToString(tpl));
    }

}
