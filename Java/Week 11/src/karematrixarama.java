
import java.util.Arrays;
import java.util.Scanner;


public class karematrixarama 
{

    public static void main(String[] args) 
    {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int[][] nn= new int[n][n];
        
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                nn[i][j]=inp.nextInt();
            }
        }
        
        System.out.println(Arrays.deepToString(nn));

        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                System.out.print(nn[i][j]+",");
            }
            System.out.println("");
        }
        
        int enb=nn[0][0];
        int enk=nn[0][0];
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                if(nn[i][j]>enb)
                {
                    enb=nn[i][j];
                }
                if(nn[i][j]<enk)
                {
                    enk=nn[i][j];
                }
            }
        }
        System.out.println(enb);
        System.out.println(enk);
    }

}
