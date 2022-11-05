import java.util.Scanner;
public class hm5 {

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        int toplam=0;
        
        if (a>b)
        {
            for (int i=1;i<=b;i++)
            {
                toplam+=a;
            }
        }
        else
        {
            for (int i=1;i<=a;i++)
            {
                toplam+=b;
            }
        }
        
        
        System.out.print(toplam);
        
    }

}
