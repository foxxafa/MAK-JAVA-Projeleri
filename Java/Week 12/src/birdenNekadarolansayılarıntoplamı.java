
public class birdenNekadarolansayılarıntoplamı 
{
    public static int karetoplam(int n)
    {
        int toplam=0;
        for (int i = 1; i <=n; i++) 
        {
            toplam+=i*i;
        }
        return toplam;
    }

    public static void main(String[] args) 
    {
        System.out.println(karetoplam(3));
    }

}
