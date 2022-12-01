public class markovsayısı
{

    public static void main(String[] args) 
    {
        for (int i = 0; i <=50; i++) 
        {
            for (int j = 0; j <= 50; j++) 
            {
                for (int k = 0; k <= 50; k++) 
                {
                    if(i*i+k*k+j*j==3*i*j*k)
                    {
                        System.out.println(i+" "+j+" "+k);
                    }
                }
            }
        }
    }

}
