import java.util.Scanner;
public class KDVTutarıHesaplayanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen ürünün fiyatını girin: ");
        double fiyat = input.nextDouble();

        double kdvOrani = fiyat <= 1000 ? 0.18 : 0.08;
        double kdvTutari = fiyat * kdvOrani;
        double kdvliFiyat = fiyat + kdvTutari;

        System.out.println("KDV'siz fiyat: " + fiyat);
        System.out.println("KDV oranı: %" + (int)(kdvOrani * 100));
        System.out.println("KDV tutarı: " + kdvTutari);
        System.out.println("KDV'li fiyat: " + kdvliFiyat);
    }
}
