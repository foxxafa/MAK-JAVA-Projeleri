import java.util.Scanner;
public class exp1 {

    public static void main(String[] args) 
    {
        Scanner inp =new Scanner(System.in);
        int a = inp.nextInt();
        int tplc=0;
        int tplt=0;
        for(int i =0;i<=a;i++)
        {
            if (i%2==0)
            {
                tplc+=i;
            }
            else tplt+=i;
        }
        
        System.out.println(tplc);
        System.out.println(tplt);
    }

}
