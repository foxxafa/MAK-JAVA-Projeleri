import java.util.Scanner;
public class pisagorüçlemesi
{

    public static void main(String[] args) 
    {
        //orn 56 7 24 25
        Scanner inp = new Scanner(System.in);
        int n=inp.nextInt();
        for (int a = 1; a <= n-1; a++) 
        {
            for (int b = a+1; b <= n-a; b++) 
            {
                int c=n-(a+b);
                if(a*a+b*b==c*c)
                {
                    System.out.println(a+" "+b+" "+c);
                }
            }
        }
    }

}
