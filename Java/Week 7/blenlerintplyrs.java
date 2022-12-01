
import java.util.Scanner;


public class blenlerintplyrs {

    public static void main(String[] args) 
    {
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        int tpl=0;
        for (int i = 1; i <= n; i++) 
        {
            if(n%i==0)
            {
                tpl+=i;
                System.out.println(i);
            }
        }
        if(n*2<tpl)
        {
            System.out.println("Eksik sayı"+n);
        }
    }

}
