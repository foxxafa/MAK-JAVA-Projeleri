public class armstrongsayıları 
{
    public static void main(String[] args)
    {
        for (int k = 100; k < 1000; k++) 
        {
            int c=0;
            int i=1;
            int x=k;
            do
            {
                int b=x%(int)Math.pow(10, i);
                int y=x-b;
                c+=Math.pow(b/Math.pow(10, i-1), 3);
                x=y;
                i+=1;
            }
            while(x/Math.pow(10, i)>0);
            
            if(c==k)
            {
                System.out.println(k);
            }
        }
        
    }

}
