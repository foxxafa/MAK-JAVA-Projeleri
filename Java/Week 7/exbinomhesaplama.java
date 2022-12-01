import java.util.Scanner;
public class exbinomhesaplama {

    public static void main(String[] args)
    {
        Scanner inp=new Scanner(System.in);
        double n=inp.nextInt();
        double x=inp.nextInt();
        System.out.println(Math.pow(1+x/n, n));
    }

}
