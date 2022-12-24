
import java.util.Random;
import java.util.Scanner;


public class rastgeleBüyüklük {

    public static void main(String[] args) 
    {
        Scanner inp = new Scanner(System.in);
        Random rnd = new Random();
        
        String kelime = inp.nextLine();
        
        for (int i = 0; i < kelime.length(); i++) 
        {
            if(rnd.nextInt(2)%2==0)
            {
                System.out.print(Character.toLowerCase(kelime.charAt(i)));
            }
            else
            {
                System.out.print(Character.toUpperCase(kelime.charAt(i)));
            }
        }
        
    }

}
