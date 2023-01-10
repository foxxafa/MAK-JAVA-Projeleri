
import java.util.Random;
import java.util.Scanner;


public class dizisıralama 
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
        
        System.out.println("~~~~~~~~~~~~~~");
        
        int[] b=new int[n];
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                b[j]=a[i][j];
            }
            
            for (int j = 0; j < n; j++) 
            {
                for (int k = 0; k < n-1; k++) 
                {
                    if(b[k]>b[k+1])
                    {
                        int temp=b[k];
                        b[k]=b[k+1];
                        b[k+1]=temp;
                    }
                }
            }
            
            for (int j = 0; j < n; j++) 
            {
                a[i][j]=b[j];
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
    }

}
