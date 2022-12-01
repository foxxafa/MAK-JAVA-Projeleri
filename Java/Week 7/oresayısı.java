import java.util.Scanner;
public class oresayısı 
{

    public static void main(String[] args) 
    {
        Scanner inp= new Scanner(System.in);
        int n= inp.nextInt();
        int syc=0;
        double tpl=0;
        for (int i = 1; i <= n; i++) 
        {
            if(n%i==0)
            {
                syc+=1;
                tpl+=(1/(double)i);
            }
        }
        if(syc%tpl==0)
        {
            System.out.println("ore");
        }
        else
        {
            System.out.println("ore değil");
        }
    }

}
