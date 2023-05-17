package DersNotu;

import java.util.Scanner;

public class DersGecme {

    // Bu sınıf, bir öğrencinin dersi geçip geçmediğini belirler.

    public static void main(String[] args) {

        // Derslerin bir dizisini tanımla.
        String[] dersler = {"Matematik", "Fizik", "Türkçe", "Kimya", "Müzik"};

        // Geçme notunu tanımla.
        int gecmeNotu = 55;

        // Toplam not ve ders sayısını tanımla.
        int toplamNot = 0;
        int dersSayisi = 0;

        // Bir Scanner nesnesi oluştur.
        Scanner inp = new Scanner(System.in);

        // Dersler dizisi üzerinde dön.
        for (String ders : dersler) {

            // Kullanıcıdan geçerli ders notunu girmesini iste.
            System.out.print(ders + " dersinin notunu girin: ");

            // Kullanıcıdan notu al.
            int not = inp.nextInt();

            // Notun geçerli bir aralıkta olup olmadığını kontrol et.
            if (not >= 0 && not <= 100) {

                // Notu toplam nota ekle.
                toplamNot += not;

                // Ders sayısını artır.
                dersSayisi++;
            }
        }

        // Ders sayısının 0'dan büyük olup olmadığını kontrol et.
        if (dersSayisi > 0) {

            // Ortalama notu hesapla.
            double ortalama = (double) toplamNot / dersSayisi;

            // Ortalama notu ekrana yazdır.
            System.out.println("Ortalama: " + ortalama);

            // Ortalama notun geçme notundan büyük veya buna eşit olup olmadığını kontrol et.
            if (ortalama >= gecmeNotu) {

                // Öğrencinin dersten geçtiğini belirten bir mesaj yazdır.
                System.out.println("Tebrikler! Dersten geçtiniz!");
            } else {

                // Öğrencinin dersten kaldığını belirten bir mesaj yazdır.
                System.out.println("Üzgünüz! Dersten kaldınız!");
            }
        } else {

            // Geçerli olmayan notların girildiğini belirten bir mesaj yazdır.
            System.out.println("Geçerli olmayan notlar girildi, ortalama hesaplanamıyor!");
        inp.close();
        }
    }
}
