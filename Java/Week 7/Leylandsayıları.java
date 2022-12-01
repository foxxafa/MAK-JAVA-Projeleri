import java.util.Scanner;
public class Leylandsayıları
{

    public static void main(String[] args)
    {
        Scanner inp=new Scanner(System.in);
        int x= inp.nextInt();
        int y= inp.nextInt();
        
        for (int i = 2; i <=x; i++) 
        {
            for (int j = 2; j <= y; j++) 
            {
                System.out.println(Math.pow(i, j)+Math.pow(j, i));
            }
        }
        
    }

}
