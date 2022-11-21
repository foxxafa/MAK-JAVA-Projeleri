import java.util.Scanner;
public class hm3 
{
    public static int carpantpl(int n)
    {
        int tpl=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                tpl+=i;
            }
        }
        return tpl;
    }
    public static void main(String[] args) 
    {
        Scanner inp = new Scanner(System.in);
        int m = inp.nextInt();
        int n = inp.nextInt();
        
        if(carpantpl(m)== carpantpl(n))
        {
            System.out.println("dostsayılar");
        }
        
    }

}
