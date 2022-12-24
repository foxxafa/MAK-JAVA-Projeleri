
import java.util.Scanner;


public class Sesliharfler 
{

    public static void main(String[] args) 
    {
        String[] shrf={"a","e","i","o","u"};
        Scanner inp = new Scanner(System.in);
        String cümle = inp.nextLine();
        int syc=0;
        for (int i = 0; i < cümle.length(); i++) 
        {
            for (int j = 0; j < shrf.length; j++) 
            {
                if(cümle.charAt(i)==shrf[j].charAt(0))
                {
                    syc+=1;
                    System.out.print(i+",");
                }
            }
        }
        System.out.println("");
        System.out.println(syc+" Tane sesli harf var");
    }

}
