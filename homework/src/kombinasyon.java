import java.util.Scanner;
public class kombinasyon {
    public static int fct(int n)
    {
        int c=1;
        for(int i=2;i<=n;i++)
        {
            c*=i;
        }
        return c;
    }

    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int r = inp.nextInt();
        int s=fct(n)/(fct(r)*fct(n-r));
        System.out.println(s);
    }

}
