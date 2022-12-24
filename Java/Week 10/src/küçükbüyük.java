
import java.util.Scanner;


public class küçükbüyük {

    public static void main(String[] args) 
    {
        Scanner inp = new Scanner(System.in);
        String cümle = inp.nextLine();
        int syc=0;
        for (int i = 0; i < cümle.length(); i++) 
        {
            if(syc%2==0)
            {
                System.out.print(Character.toLowerCase(cümle.charAt(i)));
            }
            else
            {
                System.out.print(Character.toUpperCase(cümle.charAt(i)));
            }
            syc+=1;
        }
        
    }

}
