import java.util.Scanner;
public class hm4 
{

    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        
        double tpl=0;
        int s=0;
        
        for (int i =1 ; i <=n; i++) 
        {
            if(n%i==0)
            {
                tpl+=i;
                s+=1;
                //System.out.println(i);
            }
        }
        
        if ((tpl/s)%1==0)
        {
            System.out.println("aritmatik");
        }
    }

}
