
public class Kare {

    public static void main(String[] args) 
  {
        for (int i = 0; i < 5; i++) 
        {
            if (i==0 | i==4)
            {
                for (int j = 1; j <= 5; j++) 
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            else
            {
                System.out.print("*");
                for (int k = 1; k <= 3; k++) 
                {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
                    
        }
    }

}
