
import java.util.Arrays;


public class dizilertoplam
{
    public static int[] dizileritopla(int[] a,int[] b)
    {
        int[] toplam=new int[a.length];
        for (int i = 0; i < a.length; i++) 
        {
            toplam[i]=a[i]+b[i];
        }
        return toplam;
    }

    public static void main(String[] args) 
    {
        int[] arr1={1,2,3,4};
        int[] arr2={5,6,7,8};
        
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(dizileritopla(arr1,arr2)));
    }

}
