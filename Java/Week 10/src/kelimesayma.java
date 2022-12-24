
import java.util.Scanner;


public class kelimesayma 
{

    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        String cümle = inp.nextLine();
        int syc=0;
        char[] dizi={' ',',','.'};
        for (int i = 0; i < cümle.length(); i++) 
        {
            for (int j = 0; j < dizi.length; j++) 
            {
                if(dizi[j]==cümle.charAt(i))
                {
                    syc+=1;
                }
            }
        }
        System.out.println(syc+" tane kelime var");
    }

}
