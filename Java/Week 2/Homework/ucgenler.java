import java.util.Scanner;
public class hm3 {

    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);
        double a = inp.nextDouble();
        double b = inp.nextDouble();
        double c = inp.nextDouble();
        
        if (a==b &b==c)
        {
            System.out.print("Eskenar ucgen");
        }
        if (a!=b & b!=c & a!=c)
        {
            System.out.print("Cesitkenar Ucgen");
        }
        else System.out.print("ikizkenar Ucgen");
    }

}
