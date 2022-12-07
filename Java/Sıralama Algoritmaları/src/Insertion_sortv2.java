
import java.util.Arrays;


public class Insertion_sortv2 
{

    public static void main(String[] args) 
    {
        int[] a={4,1,2,5,3,0};
        int i=1;
        for (int j = 1; j <a.length; j++) 
        {
            i=0;
            while(a[j]>a[i])
            {
                i+=1;
            }
            int m=a[j];
            for (int k = 0; k <=j-i-1; k++) 
            {
                a[j-k]=a[j-k-1];
            }
            a[i]=m;
            
        }
        System.out.println(Arrays.toString(a));
    }

}
