import java.util.Scanner;
public class exp5 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a=inp.nextInt();
        int b = inp.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                System.out.print("*");
            }
            System.out.println();
            
        }
    }

}
