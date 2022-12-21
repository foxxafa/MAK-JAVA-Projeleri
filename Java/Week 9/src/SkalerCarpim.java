package Example;
import java.util.Scanner;

public class SkalerCarpim 
{

    public static void main(String[] args)
    {
        Scanner inp=new Scanner(System.in);
        System.out.println("Dizinin elaman sayısını girin");
        int n = inp.nextInt();
        
        int[] a = new int[n];
        int[] b = new int[n];
        
        for (int i = 0; i < a.length; i++) 
        {
            System.out.println("A dizisi için değer girin");
            a[i]=inp.nextInt();
            System.out.println("B dizisi için değer girin");
            b[i]=inp.nextInt();
        }
        
        int sc=0;
        for (int i = 0; i < a.length; i++) 
        {
            sc+=a[i]*b[i];
        }
        System.out.println(sc);
    }
}
