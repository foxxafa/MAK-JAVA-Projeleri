
import java.util.Scanner;


public class Paraüstü
{

    public static void main(String[] args)
    {
        double[] a = {200,100,50,20,10,5,1,0.5,0.25,0.1,0.05,0.01};//madeni ve kağıt birimler
        Scanner inp = new Scanner(System.in);
        System.out.println("Alışveriş tutarını girin");
        double tutar = inp.nextDouble();// alışveriş tutarı
        double mstrp;// müştrei parası
        do
        {
            System.out.println("Ödeyeceğiniz tutarı girin");
            mstrp=inp.nextDouble();
        }
        while(mstrp-tutar<0);
        
        double pü=mstrp-tutar; //para üstü
        int i=0;
        while(i<a.length)
        {
            if(pü-a[i]>=0)
            {
                pü-=a[i];
                System.out.println(a[i]);
            }
            else i+=1;
        }
    }

}
