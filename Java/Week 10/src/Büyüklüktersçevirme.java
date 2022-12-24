
import java.util.Scanner;


public class Büyüklüktersçevirme 
{

    public static void main(String[] args)
    {
        Scanner inp =new Scanner(System.in);
        String cümle = inp.nextLine();
        
        for (int i = 0; i < cümle.length(); i++) 
        {
            if(Character.toLowerCase(cümle.charAt(i))==cümle.charAt(i))//bu harf küçük
            {
                System.out.print(Character.toUpperCase(cümle.charAt(i)));
            }
            else
            {
                System.out.print(Character.toLowerCase(cümle.charAt(i)));
            }
        }
        
    }

}
