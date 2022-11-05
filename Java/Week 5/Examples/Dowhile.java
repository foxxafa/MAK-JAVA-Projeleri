import java.util.Scanner;
public class exp1 {

    public static void main(String[] args) 
    {
        Scanner inp = new Scanner(System.in);
        int n;
        
        do
        {
            n = inp.nextInt();
        }
        while(n<0 | n>100);
    }

}
