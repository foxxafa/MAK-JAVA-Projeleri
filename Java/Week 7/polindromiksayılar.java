
public class polindromiksayılar 
{

    public static void main(String[] args)
    {
        for (int i = 100; i <= 10000; i++)
        {
            if(i<1000)
            {
                int a=i/100;
                if((i-(101*a))%10==0)
                {
                    System.out.println(i);
                }
            }
            else
            {
                int b1=i/1000;
                int b2=(i%1000)/100;
                int b3 =(i%100)/10;
                int b4=i%10;
                if(b1==b4&b2==b3)
                {
                    System.out.println(i);
                }
            }
            
        }
    }

}
