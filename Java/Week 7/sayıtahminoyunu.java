import java.util.Random;
import java.util.Scanner;
public class sayıtahminoyunu 
{

    public static void main(String[] args) 
    {
        Scanner inp = new Scanner(System.in);
        Random rnd = new Random();
        int rnds=rnd.nextInt(100);
        int n;
        do
        {
            n=inp.nextInt();
            if(n<rnds)
                System.out.println("daha büyük sayı girin");
            if(n>rnds)
                System.out.println("daha küçük sayı girin");
        }
        while(n!=rnds);
        System.out.println("bilidiniz");
    }

}
