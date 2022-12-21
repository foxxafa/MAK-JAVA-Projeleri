package Example;

import java.util.Scanner;


public class ortalamahesaplatma
{

    public static void main(String[] args) 
    {
        Scanner inp=new Scanner(System.in);
        int n = inp.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++)
        {
            System.out.println((i+1)+". Elemanı girin");
            a[i]=inp.nextInt();
        }
        
        int atpl=0;
        int gc=1;
        double htpl=0;
        int khtpl=0;
        for (int i = 0; i < a.length; i++) 
        {
            atpl+=a[i];
            gc*=a[i];
            htpl+=(1.0/a[i]);
            khtpl+=a[i]*a[i];
        }
        System.out.println("Aritmatik Ortalama: "+atpl/n);
        System.out.println("Geometrik Ortalama: "+Math.pow(gc,(1.0/n)));
        System.out.println("Harmonik Ortalama: "+(double)n/htpl);
        System.out.println("Kontraharmonik Ortalama: "+(double)khtpl/(double)atpl);
    }

}
