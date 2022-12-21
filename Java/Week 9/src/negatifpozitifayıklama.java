
import java.util.Arrays;
import java.util.Scanner;


public class negatifpozitifayıklama 
{

    public static void main(String[] args)
    {
        Scanner inp =new Scanner(System.in);
        System.out.print("Kaç elamanlı dizi olacak?:");
        int n = inp.nextInt();
        System.out.println();
        
        int[] a = new int[n];
        
        for (int i = 0; i < a.length; i++) 
        {
            System.out.print((i+1)+". Elamanı girin : ");
            a[i]=inp.nextInt();
            System.out.println("");
        }
        
        int ps=0;//pozitif elaman sayısı
        for (int i = 0; i < a.length; i++) 
        {
            if(a[i]>0)
            {
                ps+=1;
            }
        }
        
        int[] pa=new int[ps];
        int[] na=new int[n-ps];
        int syc=0;
        for (int i = 0; i <a.length; i++) 
        {
            if(a[i]>0)
            {
                pa[syc]=a[i];
                syc+=1;
            }
        }
        syc=0;
        for (int i = 0; i <a.length; i++) 
        {
            if(a[i]<0)
            {
                na[syc]=a[i];
                syc+=1;
            }
        }
        System.out.println(Arrays.toString(na));
        System.out.println(Arrays.toString(pa));
    }

}
