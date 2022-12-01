import java.util.Scanner;
public class lne_hesaplama 
{

    public static void main(String[] args) 
    {
        Scanner inp =new Scanner(System.in);
        int n = inp.nextInt();
        double tpl=0;
        for (int i = 0; i < n; i++) 
        {
            tpl+=1/(double)((2*i+1)*(2*i+2));
        }
        System.out.println(tpl);
    }

}
