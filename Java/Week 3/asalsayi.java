import java.util.Scanner;
public class exp5 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n=inp.nextInt();
        for (int i=2;i<n/2;i++)
        {
            if(n%i==0)
            {
                System.out.println("Sayi asal degildir");
                break;
            }
        }
        System.out.println("Sayi asaldir");
    }

}
