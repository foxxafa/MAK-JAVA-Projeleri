
import java.util.Scanner;


public class harflerinsırasınagöreyıldız 
{

    public static void main(String[] args) 
    {
        char a ='a';
        System.out.println(a+0);
        char z='z';
        System.out.println(z+0);
        System.out.println(z-a);
        char c='c';
        System.out.println((z-a)-(z-c)+1);
        
        Scanner inp = new Scanner(System.in);
        String cümle=inp.nextLine();
        
        for (int i = 0; i < cümle.length(); i++) 
        {
            char harf=cümle.charAt(i);
            for (int j = 0; j < (z-a)-(z-harf)+1; j++) 
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
