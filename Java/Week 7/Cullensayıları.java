import java.util.Scanner;
public class Cullensayıları
{

    public static void main(String[] args) 
    {
        Scanner inp=new Scanner(System.in);
        int n= inp.nextInt();
        for (int i = 1; i <=n; i++) 
        {
            System.out.println((Math.pow(2, i)*i)+1);
        }
    }

}
