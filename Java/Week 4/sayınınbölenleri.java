package homework;

import java.util.Scanner;
public class Homework {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n =inp.nextInt();
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)
            {
                System.out.println(i);
            }
        }
        System.out.println(n);
    }

}
