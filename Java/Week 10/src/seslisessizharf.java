
import java.util.Scanner;


public class seslisessizharf 
{

    public static void main(String[] args) 
    {
        Scanner inp = new Scanner(System.in);
        char[] sslharf={'a','e','ı','i','o','ö','u','ü'};
        String cümle = inp.nextLine();
        String k1="";
        String k2="";
        
        
        for (int i = 0; i < cümle.length(); i++) 
        {
            boolean k =false;
            for (int j = 0; j < sslharf.length; j++) 
            {
                if(cümle.charAt(i)==sslharf[j])
                {
                    k1+=cümle.charAt(i);
                    k=true;
                    break;
                }
            }
            if(k==false)
            {
                k2+=cümle.charAt(i);
            }
        }
        System.out.println(k1);
        System.out.println(k2);
    }

}
