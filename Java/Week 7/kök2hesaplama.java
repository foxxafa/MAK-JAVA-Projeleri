import java.util.Scanner;
public class kök2hesaplama 
{

    public static void main(String[] args) 
    {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        double t=1;
        for (int i = 1; i <= n; i++) 
        {
            t=2+1/t;
        }
        System.out.println(1+1/t);
    }

}
