
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        

    // Kullanıcıdan Aldığınız iki sayı değerlerini değiştiriniz.

       Scanner scanner = new Scanner(System.in);
  
       int birinci_sayi;
       int ikinci_sayi;
       
        System.err.println("Birinci sayiyi giriniz :");
        birinci_sayi = scanner.nextInt();
        System.out.println("İkinci sayiyi giriniz :");
        ikinci_sayi = scanner.nextInt();
        System.out.println("Değiştirilmeden önce .......");
        System.out.println("Birinci Sayi :" +birinci_sayi +  " İkinci Sayi :"+ikinci_sayi );

        int gecici_sayi = birinci_sayi;
        birinci_sayi = ikinci_sayi;
        ikinci_sayi = gecici_sayi;
        System.out.println("Değiştirildikten sonra......");
        System.out.println("Birinci Sayi :" +birinci_sayi +  " İkinci Sayi :"+ikinci_sayi);
    }
}
