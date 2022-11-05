import java.util.Scanner;
public class hw1 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a=inp.nextInt();
        if (a<0)
        {
            System.out.print("Sayi negatif");
        }
        if (a>0)
        {
            System.out.print("Sayiniz pozitif");
        }
        else System.out.print("Girdiginiz sayi 0");
    }
    

}
