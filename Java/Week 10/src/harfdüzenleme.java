
import java.util.Scanner;


public class harfdüzenleme 
{

    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        String cümle=inp.nextLine();
        
        int s = cümle.length();
        
        String k1="";
        
        for (int i = (s/2)-1; i >=0 ; i--) 
        {
            k1+=cümle.charAt(i);
        }
        System.out.println(k1);
        String k2="";
        for (int i = s-1; i >=s/2 ; i--) 
        {
            k2+=cümle.charAt(i);
        }
        System.out.println(k1+k2);
        
    }

}
