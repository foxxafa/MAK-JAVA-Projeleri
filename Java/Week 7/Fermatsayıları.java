import java.util.Scanner;
public class Fermatsayıları 
{

    public static void main(String[] args)
    {
        Scanner inp=new Scanner(System.in);
        int n= inp.nextInt();
        for (int i = 0; i <= n-1; i++) 
        {
            System.out.println(Math.pow(2, Math.pow(2, i))+1);
        }
    }

}
