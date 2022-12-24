
import java.util.Scanner;


public class yazısıra 
{

    public static void main(String[] args) 
    {
        Scanner inp = new Scanner(System.in);
        String cümle = inp.nextLine();
        
        for (int i = 0; i < cümle.length(); i++) 
        {
            System.out.print(cümle.charAt(i));
            System.out.print(i+1);
        }

    }

}
