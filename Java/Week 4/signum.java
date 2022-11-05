import java.util.Scanner;
public class signum {
    
    public static int f(int x)
    {
        return (x*x) - (5*x) + 3;
    }

    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int sn=f(n);
        if(sn<0)
        {
            System.out.println(-1);
        }
        if(sn>0)
        {
            System.out.println(1);
        }
        if(sn==0)
        {
            System.out.println(0);
        }
    }

}
