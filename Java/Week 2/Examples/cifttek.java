import java.util.Scanner;
public class exp1 
{
    public static void main(String[] args)
    {
        System.out.println("Lutfen sayi girin: ");
        Scanner inp=new Scanner(System.in);
        if (inp.nextInt()%2==0)
        {
            System.out.print("Sayi Cift");
        }
        else System.out.print("Sayi tek");
    }

}
