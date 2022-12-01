import java.util.Scanner;
public class Hilbertsayıları 
{

    public static void main(String[] args) 
    {
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        if((n-1)%4==0)
        {
            System.out.println("hilbert sayısıdır");
        }
        else
        {
            System.out.println("hilbert sayısı değildir");
        }
    }

}
