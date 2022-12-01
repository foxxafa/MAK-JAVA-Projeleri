import java.util.Scanner;
import java.lang.Math;
public class pihesaplama 
{

    public static void main(String[] args) 
    {
        Scanner inp = new Scanner(System.in);
        int n= inp.nextInt();
        double tpl=0;
        for (int i = 0; i <=n; i++) 
        {
            tpl+=Math.pow(-1, i)/(double)(2*i+1);
        }
        double pi=4*tpl;
        System.out.println(pi);
    }

}
