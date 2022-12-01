import java.util.Scanner;
public class fibonacciasaları
{

    public static void main(String[] args) 
    {
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        int f1=1;
        int f2=1;
        int s2=0;
        
        while(s2<n)
        {
            int f3=f1+f2;
            f1=f2;
            f2=f3;
            int s1=0;
            for (int i = 2; i < f3-1; i++) 
            {
                if(f3%i==0)
                {
                    s1+=1;
                }
            }
            if(s1==0)
            {
                s2+=1;
                System.out.println(f3);
            }
        }   
    }
}
