import java.util.Scanner;
public class exp4 {

    public static void main(String[] args) {
        String a ="1234";
        int toplam=0;
        for(int i =1;i<a.length();i++)
        {
            toplam+=Integer.parseInt(a.substring(i,i+1));
        }
        System.out.println(toplam);
    }

}
