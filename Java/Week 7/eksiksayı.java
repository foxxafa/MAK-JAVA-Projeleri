import java.util.Scanner;
public class eksiksayı 
{
    public static boolean asalmı(int x)
    {
        for (int i = 2; i < x; i++) 
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
        
        for (int i = 2; i <=n; i++) 
        {
            if(asalmı(i)==true&asalmı(i+2))
            {
                System.out.println(i+" "+(i+2));
            }
        }
        
    }

}
