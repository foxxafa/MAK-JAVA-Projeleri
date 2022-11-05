import java.util.Scanner;
public class faktoriyel {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int f=1;
        for (int i=1;i<=n;i++)
        {
            f*=i;
        }
        System.out.println(f);
    }

}
