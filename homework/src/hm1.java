import java.util.Scanner;
public class hm1 {

    public static void main(String[] args) 
    {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int t2=0;
        int t3=0;
        for(int i=1;i<=n;i++)
        {
            if (i%2==0)
            {
                t2+=i;
            }
            else
            {
                t3+=i;
            }
        }
        System.out.println(n*(n+1)/2);
        System.out.println(t2);
        System.out.println(t3);
    }

}
