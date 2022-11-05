import java.util.Scanner;
public class hm2 {

    public static void main(String[] args) 
    {
        int n;
        do
        {
            Scanner inp = new Scanner(System.in);
            n = inp.nextInt();
        }while(n<=7);
        
        for (int i = 0; i <= n/3; i++) 
        {
            for (int j = 0; j <= n/5; j++) 
            {
                if(3*i+5*j==n)
                {
                    System.out.println(i+"  "+j);
                }
            }
        }
    }

}
