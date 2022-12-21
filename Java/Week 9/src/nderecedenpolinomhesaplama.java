package Example;

import java.util.Arrays;
import java.util.Scanner;


public class nderecedenpolinomhesaplama 
{
    public static double f(double x,double[] a)
    {
        double tpl=0;
        for (int i = 0; i < a.length; i++) 
        {
            tpl+=a[i]*Math.pow(x, a.length-i-1);
        }
        return tpl;
    }

    public static void main(String[] args) 
    {
        Scanner inp =new Scanner(System.in);
        
        System.out.print("Kaçıncı dereceden polinom oluşturmak istiyorsunuz? : ");
        int n = inp.nextInt();
        System.out.println();
        
        System.out.println("Hangi x değerini hesaplamak istiyorsunuz? : ");
        double x=inp.nextInt();
        
        double[] a = new double[n+1];
        
        for (int i = 0; i <a.length; i++) 
        {
            System.out.println((i+1)+". Katsayıyı girin");
            a[i]=inp.nextDouble();
        }
        
        String b="";
        for (int i = 0; i < a.length; i++) 
        {
            if(i==a.length-1)
            {
                b+=a[i]+"x^"+(a.length-i-1);
            }
            else
            {
                b+=a[i]+"x^"+(a.length-i-1)+" + ";
            }
            
        }
        System.out.println("Formülünüz: "+b);
        
        System.out.println(f(x,a));
    }

}
