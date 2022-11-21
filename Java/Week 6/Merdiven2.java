import java.util.Scanner;
public class Merdiven2 {

    public static void main(String[] args) 
    {
        Scanner inp = new Scanner(System.in);
        int r= inp.nextInt();
        for (int i = 0; i <r; i++) 
        {
            for (int j = 0; j <= r-i; j++) 
            {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) 
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
