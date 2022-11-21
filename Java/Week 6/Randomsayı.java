import java.util.Scanner;
import java.util.Random;
public class Randomsayı {

    public static void main(String[] args) 
    {
        Scanner inp = new Scanner(System.in);
        Random rnd=new Random();
        int r=rnd.nextInt(100);
        System.out.println(r);
        
        while(true)
        {
            int n;
            do
            {
                System.out.println("Lütfen 0-100 arasında sayı tahmin edin.");
                n=inp.nextInt();
            }while(n<0 | n>100);   
            
            if (n==r)
            {
                System.out.println("Tebrikler");
                break;
            }
            if (n<r)
            {
                System.out.println("Lütfen daha büyük sayı girin: ");
            }
            else
            {
                System.out.println("Lütfen daha küçük sayı girin: ");
            }
        }
    }

}
