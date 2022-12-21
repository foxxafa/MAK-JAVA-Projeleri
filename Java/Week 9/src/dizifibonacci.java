
import java.util.Arrays;
import java.util.Scanner;


public class dizifibonacci 
{

    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int[] fib= new int[n];
        fib[0]=1;
        fib[1]=1;
        for (int i = 2; i < fib.length; i++) 
        {
            fib[i]=fib[i-1]+fib[i-2];
        }
        
        String a="[";
        for (int i = 0; i < fib.length; i++) 
        {
            if(i==fib.length-1)
            {
                a+=""+fib[i];
            }
            else a+=""+fib[i]+", ";
            
        }
        a+="]";
        System.out.println(a);
        System.out.println(Arrays.toString(fib));
    }

}
