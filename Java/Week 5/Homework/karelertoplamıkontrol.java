import java.util.Scanner;
public class hm3 
{

    public static void main(String[] args) 
    {
        Scanner inp =new Scanner(System.in);
        int n ;
        do
        {
            n=inp.nextInt();
        }while(n<0);
        
        for (int i = -n; i <n; i++) 
        {
            for (int j = -n; j < n; j++) 
            {
                if(i*i+j*j==n)
                {
                    System.out.println(i+"  "+j);
                }
            }
        }
    }

}
