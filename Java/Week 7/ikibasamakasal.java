public class ikibasamakasal 
{
    public static boolean asalmi(int x)
    {
        for (int i = 2; i <x; i++) 
        {
            if(x%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) 
    {
        for (int i = 2; i <= 7; i++) 
        {
            if(asalmi(i))
            {
                for (int j = 2; j <= 7; j++) 
                {
                    if(asalmi(j))
                    {
                        System.out.println(10*i+j);
                    }
                }
            }
        }
    }

}
