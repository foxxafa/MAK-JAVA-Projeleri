import java.util.Scanner;
public class hm6 {

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        int toplam=0;
        for (int i=1;i<=n;i++)
        {
            toplam+=i*i;
        }
        
        System.out.print(toplam);
    }

}
