import java.util.Scanner;

public class TamBolunenSayilar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner sınıfı değişken tanımlanıyor.
        // Değişkenler tanımlanıyor.
        int sayi = 0;
        int toplam = 0;
        int adet = 0;
        double ortalama = 0.00;
        // kullanıcıdan veri girişi alınıyor.
        System.out.print("Bir sayı girin: ");
        sayi = input.nextInt();
        // Hesaplama ve Ekrana yazdırma işlemleri yapılıyor.
        for (int i = 0; i <= sayi; i++) {
            if (i > 0 && i % 3 == 0 && i % 4 == 0) {
                toplam += i;
                adet++;
                System.out.println(adet + ". bölünebilen sayı : " + i);
            }
        }
        ortalama = (double) toplam / adet;
        System.out.println("Bölünebilen sayı adedi : " + adet);
        System.out.println("Sayıların Toplamları : " + toplam);
        System.out.println("Sayıların Ortalaması : " + ortalama);

    }
}
