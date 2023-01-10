
import java.util.Arrays;
import java.util.Random;


public class minmaxrandomarray 
{
    public static int[][] ikiboyutlu(int[][] arr,int alt, int üst)
    {
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = 0; j < arr[0].length; j++) 
            {
                arr[i][j]=rnd.nextInt(üst-alt-1)+alt+1;
            }
        }
        
        return arr;
    }
    

    public static void main(String[] args) 
    {
        int[][] a=new int[5][2];
        System.out.println(Arrays.deepToString(ikiboyutlu(a,0,11)));
        
        for (int i = 0; i < a.length; i++) 
        {
            for (int j = 0; j < a[0].length; j++) 
            {
                System.out.print(a[i][j]+", ");
            }
            System.out.println("");
        }
    }

}
