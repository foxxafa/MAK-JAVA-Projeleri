import java.util.Scanner;
public class coshesaplama
{

    public static void main(String[] args) 
    {
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        double x=inp.nextInt();
        x=Math.toRadians(x);
        double tpl=1;
        for (int i = 1; i < n; i++) 
        {
            int f=1;
            for (int j = 1; j <= 2*i; j++) 
            {
                f*=j;
            }
            tpl+=Math.pow(-1, i)*Math.pow(x, 2*i)/f;
        }
        System.out.println(tpl);
    }

}
