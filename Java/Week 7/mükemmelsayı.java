import java.util.Scanner;
public class mükemmelsayı
{

    public static void main(String[] args) 
    {
        Scanner inp = new Scanner(System.in);
        int n=inp.nextInt();
        int tpl=0;
        for (int i = 1; i < n; i++) 
        {
            if(n%i==0)
            {
                tpl+=i;
            }
        }
        if(tpl==n)
        {
            System.out.println("mükemmelsayı");
        }
    }

}
