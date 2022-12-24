
import java.util.Scanner;


public class kelimeleriterstenyazdırma 
{

    public static void main(String[] args) 
    {
        Scanner inp = new Scanner(System.in);
        String cümle = inp.nextLine();
        for (int i = cümle.length()-1; i >= 0; i--) 
        {
            System.out.print(cümle.charAt(i));
        }
    }

}
