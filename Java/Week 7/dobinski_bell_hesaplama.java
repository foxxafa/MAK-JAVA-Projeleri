import java.util.Scanner;
public class dobinski_bell_hesaplama 
{

    public static void main(String[] args) 
    {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        for (int i = 1; i <= n; i++) 
        {
            double t=0;
            double f=1;
            for (int j = 1; j <= 20; j++) 
            {
                f*=j;
                t+=Math.pow(j, i)/f;
            }
            System.out.println(t/2.7182818284);
        }
    }

}
