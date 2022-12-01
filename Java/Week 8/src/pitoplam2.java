import java.util.Scanner;
public class pitoplam2 
{

    public static void main(String[] args)
    {
        Scanner inp =new Scanner(System.in);
        int n=inp.nextInt();
        double tpl=0;
        for (int i = 1; i <=n*4; i+=4) 
        {
            tpl+=(1/(double)i)-(1/(double)(i+2));
        }
        System.out.println(4*tpl);
    }

}
