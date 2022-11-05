import java.util.Scanner;
public class exp2 {

    public static void main(String[] args) 
    {
        Scanner inp=new Scanner(System.in);
        int v,f;
        do
        {
            System.out.println("Lutfen 0 - 100 Arasinda vize notu giriniz :");
            v= inp.nextInt();
        }
        while(v<0 | v>100);
        
        do
        {
            System.out.println("Lutfen 0 - 100 Arasýnda final notu giriniz :");
            f= inp.nextInt();
        }
        while(f<0 | f>100);
        
        double ort =(v*0.4 + f*0.6);
        System.out.println(ort);
        
        
        if(0<=ort & 49>=ort )
        {
            System.out.println("D");
        }
        if(50<=ort & 59>=ort )
        {
            System.out.println("C");
        }
        if(60<=ort & 79>=ort )
        {
            System.out.println("B");
        }
        if(80<=ort & 100>=ort )
        {
            System.out.println("A");
        }
        
        

    }

}
