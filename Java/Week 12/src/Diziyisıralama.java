
import java.util.Arrays;


public class Diziyisıralama 
{
    public static int[] sort(int[] array)
    {
        for (int i = 0; i < array.length; i++) 
        {
            for (int j = 0; j < array.length-i-1; j++) 
            {
                if(array[j]>array[j+1])
                {
                    int temp=array[j+1];
                    array[j+1]=array[j];
                    array[j]=temp;
                }
            }
        }
        
        return array;
    }

    public static void main(String[] args) 
    {
        int[] dizi ={1,4,2,3,6,5};
        System.out.println(Arrays.toString(dizi));
        System.out.println(Arrays.toString(sort(dizi)));
    }

}
