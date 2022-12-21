
import java.util.Arrays;
import java.util.Scanner;


public class ogrogrenci 
{
    public static int arrysum(int[] a)
    {
        int tpl=0;
        for (int i = 0; i < a.length; i++) 
        {
            tpl+=a[i];
        }
        return tpl;
    }

    public static void main(String[] args) 
    {
        Scanner inp = new Scanner(System.in);
        int n=inp.nextInt();
        
        int[] notlar =new int[n];
        int not;
        
        for (int i = 0; i < notlar.length; i++) 
        {
            do
            {
                System.out.println((i+1)+". Notu giriniz");
                not=inp.nextInt();
            }while(0<not & not>100);
            
            notlar[i]=not;
        }
        System.out.println(Arrays.toString(notlar));
        int tpl=arrysum(notlar);
        double ort=tpl/notlar.length;
        System.out.println(ort+" ortalama");
        
        int gecen=0;
        for (int i = 0; i < notlar.length; i++) 
        {
            if(notlar[i]<=ort)
            {
                System.out.println((i+1)+". öğrenci kaldı");
            }
            else 
            {
                System.out.println((i+1)+". öğrenci geçti");
                gecen-=-1;
            }
        }
        System.out.println(gecen+" Kişi dersi geçti");
        System.out.println((notlar.length-gecen)+" Kişi kaldı");
    }

}
