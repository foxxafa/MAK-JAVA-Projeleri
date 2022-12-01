import java.util.Scanner;
public class Floyd_üçgeni 
{

    public static void main(String[] args) 
    {
        Scanner inp = new Scanner(System.in);
        int n= inp.nextInt();
        int s=1;
        for (int i = 1; i <= n; i++) 
        {
            for (int j = 1; j <=i; j++) 
            {
                System.out.print(s);
                s++;
            }
            System.out.println();
        }
    }

}
