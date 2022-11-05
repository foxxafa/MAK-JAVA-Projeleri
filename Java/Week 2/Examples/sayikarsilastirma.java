import java.util.Scanner;

public class exp2 {
    public static boolean karsilastirma(int x,int y,int z)
    {
        if (x>y & x>z) 
            return true;
        else 
            return false;
    }

    public static void main(String[] args) 
    {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        int c = inp.nextInt();
        
        if (karsilastirma(a,b,c))
            System.out.println(a);
        if (karsilastirma(b,a,c))
            System.out.println(b);
        if (karsilastirma(c,b,a))
            System.out.println(c);
    }

}
