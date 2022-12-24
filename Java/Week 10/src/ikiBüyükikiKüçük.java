
import java.util.Scanner;


public class ikiBüyükikiKüçük 
{

    public static void main(String[] args) 
    {
        Scanner inp =new Scanner(System.in);
        String cümle = inp.nextLine();
        int syc=1;
        for (int i = 0; i < cümle.length(); i++) 
        {
            if(i%2==0)
            {
                syc*=-1;
            }
            if (syc==1) 
            {
                System.out.print(Character.toLowerCase(cümle.charAt(i)));
            }
            if(syc==-1)
            {
                System.out.print(Character.toUpperCase(cümle.charAt(i)));
            }
        }
    }

}
