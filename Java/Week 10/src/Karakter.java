
import java.util.Scanner;


public class Karakter {

    public static void main(String[] args)
    {
        char c ='3';
        System.out.println(c+0);
        System.out.println(c+1);
        
        Scanner inp = new Scanner(System.in);
        String st=inp.nextLine();
        System.out.println(st.charAt(0));
        
        for (int i = 0; i < st.length(); i++) 
        {
            System.out.println(st.charAt(i));
        }
        
    }

}
