import java.util.Scanner;
public class kare_ücgensel_sayılar 
{

    public static void main(String[] args) 
    {
        Scanner inp = new Scanner(System.in);
        int n=inp.nextInt();
        for (int i = 0; i <= n; i++) 
        {
            int tr=i*(i+1)/2;
            if(Math.sqrt(tr)%1==0)
            {
                System.out.println(tr);
            }
        }
    }

}
