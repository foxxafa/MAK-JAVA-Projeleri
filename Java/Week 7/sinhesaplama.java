import java.util.Scanner;
public class sinhesaplama 
{
    public static double fact(int x)
    {
        double c=1;
        for (int i = 1; i <=x; i++) 
        {
            c*=i;
        }
        return c;
    }
    public static void main(String[] args) 
    {
        Scanner inp = new Scanner(System.in);
        int n=inp.nextInt();
        double x=inp.nextDouble();
        x=Math.toRadians(x);
        double tpl=0;
        for (int i = 1; i <= n; i++) 
        {
            tpl+=(Math.pow(-1, i-1)*Math.pow(x, 2*i-1))/fact(2*i-1);
        }
        System.out.println(tpl);
    }

}
