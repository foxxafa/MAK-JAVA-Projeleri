
import java.util.Scanner;


public class birbasbirson 
{

    public static void main(String[] args) 
    {
        Scanner inp = new Scanner(System.in);
        String cümle = inp.nextLine();
        int bas=0;
        int son=cümle.length()-1;
        for (int i = 0; i < cümle.length(); i++) 
        {
            if(i%2==0)
            {
                System.out.println(cümle.charAt(bas));
                bas+=1;
            }
            else
            {
                System.out.println(cümle.charAt(son));
                son-=1;
            }
            
        }
    }

}
