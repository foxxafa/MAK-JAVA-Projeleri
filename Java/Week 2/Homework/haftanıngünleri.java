import java.util.Scanner;
public class haftan�ng�nleri {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String[] dizi = {"Pazartesi","Sali","Carsamba","Persembe","Cuma","Cumartesi","Pazar"};
        System.out.print(dizi[inp.nextInt()-1]);
    }

}
