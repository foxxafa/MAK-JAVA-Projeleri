import java.util.Scanner;
public class delannoysayısı 
{
    public static int D(int m,int n)
    {
        if(m==0 |n==0)
        {
            return 1;
        }
        else
        {
            return D(m-1,n)+D(m-1,n-1)+D(m,n-1);
        }
    }
    public static void main(String[] args) 
    {
        Scanner inp = new Scanner(System.in);
        int m=inp.nextInt();
        int n = inp.nextInt();
        System.out.println(D(m,n));
        
    }

}
