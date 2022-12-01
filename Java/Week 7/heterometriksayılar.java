import java.util.Scanner;
public class heterometriksayılar {

    public static void main(String[] args) 
    {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        for (int i = 1; i <= n; i++) 
        {
            System.out.println(i+" "+(i+1)+" = "+((i*i)+i));
        }
    }

}
