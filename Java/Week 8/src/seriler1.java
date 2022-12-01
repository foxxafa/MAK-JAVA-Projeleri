import java.util.Scanner;
public class seriler1 
{
    public static int fact(int x)
    {
        int c=1;
        for (int i = 1; i <=x ; i++) 
        {
            c*=i;
        }
        return c;
    }

    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        double tpl=0;
        for (int i = 1; i <=n; i++)
        {
            tpl+=((double)i/fact(i));
        }
        System.out.println(tpl);
    }

}
