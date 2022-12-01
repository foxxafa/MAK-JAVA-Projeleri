import java.util.Scanner;
public class Negafibonacci
{

    public static void main(String[] args) 
    {
        Scanner inp = new Scanner(System.in);
        int n=inp.nextInt();
        int f1=1;
        int f2=-1;
        for (int i = 1; i <= n-2; i++) 
        {
            int f3=f1-f2;
            System.out.println(f3);
            f1=f2;
            f2=f3;
        }
    }

}
