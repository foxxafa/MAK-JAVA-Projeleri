import java.util.Arrays;
import java.util.Scanner;
public class dönüsüm {

    public static void main(String[] args)
    {
        Scanner inp= new Scanner(System.in);
        String d= inp.next();
        int n= inp.nextInt();
        
        String[] br= {"km","hm","dam","dm","cm","mm"};
        double[] bri={0.001,0.01,0.1,10,100,1000};
        System.out.println(bri[Arrays.asList(br).indexOf(d)]*n);
    }

}
