import java.util.Scanner;
public class exp3 {

    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        int b = inp.nextInt();
        for(int i =0;i<=100;i++)
        {
            if (b==i*i*i-i*i)
            {
                System.out.print(i);
                break;
            }
        }
    }

}
