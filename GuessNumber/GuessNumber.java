package GuessNumber;

import java.util.*;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rastgeleSayi = (int) (Math.random() * 101);
        int tahmin = -1;
        int tahminSayisi = 0;
        
        System.out.println("0 ile 100 arasında bir sayı seçildi. Tahmininizi girin.");
        
        while (tahmin != rastgeleSayi) {
            tahmin = scanner.nextInt();
            tahminSayisi++;
            
            if (tahmin < rastgeleSayi) {
                System.out.println("Daha büyük bir sayı girin.");
            } else if (tahmin > rastgeleSayi) {
                System.out.println("Daha küçük bir sayı girin.");
            } else {
                System.out.println("Tebrikler! " + tahminSayisi + " tahminde doğru sayıyı buldunuz.");
            }
        }
        scanner.close();
    }
}