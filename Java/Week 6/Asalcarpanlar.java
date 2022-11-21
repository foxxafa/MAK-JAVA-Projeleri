import java.util.Scanner;
public class hm2 {

    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int s=2;
        while(n>1)
        {
            if(n%s==0)
            {
                n=n/s;
                System.out.println(s);
            }
            else
            {
                s+=1;
            }
        }
    }

}
