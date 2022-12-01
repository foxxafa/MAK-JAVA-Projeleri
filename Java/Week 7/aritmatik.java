import java.util.Scanner;
public class aritmatik
{

    public static void main(String[] args) 
    {
        Scanner inp = new Scanner(System.in);
        int n=inp.nextInt();
        int tpl=0;
        int s=0;
        for (int i = 1; i <= n; i++) 
        {
            if(n%i==0)
            {
                tpl+=i;
                s++;
            }
        }
        if(tpl%s==0)
        {
            System.out.println("aritmatik sayıdır");
        }
        else
        {
            System.out.println("aritmatik sayı değildir");
        }
        
    }

}
