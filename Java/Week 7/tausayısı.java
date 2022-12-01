import java.util.Scanner;
public class tausayısı {

    public static void main(String[] args) 
    {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        for (int i = 1; i <= n; i++) 
        {
            int syc=0;
            for (int j = 1; j <= i; j++) 
            {
                if(i%j==0)
                {
                    syc+=1;
                }
            }
            if(i%syc==0)
            {
                System.out.println("Tau sayısıdır"+i);
            }
        }
    }

}
