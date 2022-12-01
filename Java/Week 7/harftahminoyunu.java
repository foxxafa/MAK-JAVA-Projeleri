
import java.util.Random;
import java.util.Scanner;


public class harftahminoyunu 
{

    public static void main(String[] args) 
    {
        Scanner inp = new Scanner(System.in);
        Random r = new Random();
        char c = (char)(r.nextInt(26) + 'a');
        System.out.println(c);
        for (int i = 1; i <= 10; i++) 
        {
            if(c==inp.next().charAt(0))
            {
                System.out.println(i+". Hakta bildiniz");
            }
        }
        System.out.println("bilemediniz");
    }

}
