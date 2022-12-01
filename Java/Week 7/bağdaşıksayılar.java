import java.util.Scanner;
public class bağdaşıksayılar 
{

    public static void main(String[] args) 
    {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b= inp.nextInt();
        
        int ab=a%10;
        int bb=b%10;
        
        int ao=a/10;
        int bo=b/10;
        if(ab+bb==10&ao==bo)
        {
            System.out.println("bağdaşık");
        }
    }

}
