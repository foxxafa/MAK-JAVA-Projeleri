import java.util.Scanner;
public class hm4 {

    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);
        int a=inp.nextInt();
        int toplam=0;
        if (a%2==0)
        {
            a-=1;
        }
        for (int i=1;i<=a;i+=2)
        {
            toplam+=i;
        }
        
        System.out.print(toplam);
    }

}
