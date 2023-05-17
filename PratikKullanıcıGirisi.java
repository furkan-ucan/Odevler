import java.util.Scanner;

public class PratikKullanıcıGirisi {



    public static void main(String[] args) {

        // Değişkenleri tanımlanır.
        String kullaniciAdi, sifre, yeniSifre;
        Scanner inp = new Scanner(System.in);

        // Kullanıcıdan kullanıcı adı ve şifresini girmesi istenir.
        System.out.println("Kullanıcı ADınız: ");
        kullaniciAdi = inp.nextLine();

        System.out.println("Şifreniz : ");
        sifre = inp.nextLine();

        // Kullanıcı adı ve şifre doğru mu diye kontrol edilir.
        if (kullaniciAdi.equals("frkan") && sifre.equals("mrb63")) {

            // Giriş başarılı.
            System.out.println("Giriş başarılı!");

        } else {

            // Giriş başarısız olur ve neyden kayanaklandığı belirlenir.

            // Kullanıcı adının doğru olup olmadığını kontrol edilir.
            if (kullaniciAdi.equals("frkan")) {

                // Doğru kullanıcı adı, yanlış şifre.
                System.out.println("Kullanıcı adı doğru, şifre yanlış.");

                // Kullanıcıya şifresini sıfırlamak isteyip istemediği sorulur.
                System.out.println("Şifrenizi sıfırlamak ister misiniz? (E/H)");
                String cevap = inp.nextLine();

                // Kullanıcı şifresini sıfırlamak istiyorsa, yeni bir şifre girmesini iste.
                if (cevap.equalsIgnoreCase("E")) {

                    System.out.print("Yeni şifrenizi giriniz. (Önceki şifreden farklı olsun): ");
                    yeniSifre = inp.nextLine();

                    // Yeni şifrenin eski şifreden farklı olup olmadığını kontrol edilir.
                    if (!yeniSifre.equals("mrb63")) {

                        // Yeni şifre başarıyla oluşturuldu.
                        System.out.print("Yeni şifreniz başarıyla oluşturuldu.");

                    } else {

                        // Geçersiz deneme!! 
                        System.out.print("Şifren eski şifrenle aynı olamaz. Lütfen değiştirin");

                    }

                } else if (cevap.equalsIgnoreCase("H")) {

                    // Kullanıcı şifresini sıfırlamak istemiyor.
                    System.out.print("Kullanıcı giriş sayfasından ayrılıyorsunuz... İyi günler.");

                } else {

                    // Geçersiz giriş! Lütfen sadece 'E' veya 'H' seçeneklerinden birini girin.
                    System.out.print("Geçersiz giriş! Lütfen sadece 'E' veya 'H' seçeneklerinden birini girin.");

                }

            } else if (sifre.equals("mrb63")) {

                // Doğru şifre, yanlış kullanıcı adı.
                System.out.println("Şifre doğru, kullanıcı adı yanlış.");

            } else {

                // Yanlış kullanıcı adı ve şifre.
                System.out.println("Kullanıcı adı ve şifre yanlış.");

            }
        inp.close();    
        }

    }
}
