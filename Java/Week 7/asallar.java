import java.util.Scanner;
public class asallar 
{
    public static boolean asalmi(int x)
    {
        for (int i = 2; i <x; i++) 
        {
            if(x%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) 
    {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        for (int i = 2; i <= n; i++) 
        {
            if(asalmi(i))
                System.out.println(i);
        }
    }

}
