import java.util.Scanner;
public class Stirling_Bell_Hesap {

    public static double komb(double x,double y)
    {
        return fact(x)/(fact(x-y)*fact(y));
    }
    public static double fact(double x)
    {
        double c=1;
        for (int i = 2; i <= x; i++) 
        {
            c*=i;
        }
        return c;
    }
    public static double S(double n,double k)
    {
        double tpl=0;
        for (int i = 0; i <=k; i++) 
        {
            tpl+=Math.pow(-1, i)*komb(k,i)*Math.pow(k-i,n);
        }
        return tpl*(1/fact(k));
    }

    public static void main(String[] args) 
    {
        java.util.Scanner inp = new java.util.Scanner(System.in);
        int n = inp.nextInt();
        double tpl=0;
        for (int k = 1; k <= n; k++) 
        {
            tpl+=S(n,k);
        }
        System.out.println(tpl);
    }

}
