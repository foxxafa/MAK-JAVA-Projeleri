
import java.util.Scanner;


public class harfsayma {

    public static void main(String[] args) 
    {
        Scanner inp = new Scanner(System.in);
        char harf = inp.nextLine().charAt(0);
        String kelime=inp.nextLine();
        int syc=0;
        for (int i = 0; i < kelime.length(); i++) 
        {
            if(kelime.charAt(i)==harf)
            {
                syc+=1;
            }
        }
        System.out.println(syc);
    }

}
