import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double armutFiyat = 2.14;
        double elmaFiyat = 3.67;
        double domatesFiyat = 1.11;
        double muzFiyat = 0.95;
        double patlicanFiyat = 5.00;

        System.out.print("Armut kaç kilo? : ");
        double armutKilo = input.nextDouble();
        System.out.print("Elma kaç kilo? : ");
        double elmaKilo = input.nextDouble();
        System.out.print("Domates kaç kilo? : ");
        double domatesKilo = input.nextDouble();
        System.out.print("Muz kaç kilo? : ");
        double muzKilo = input.nextDouble();
        System.out.print("Patlıcan kaç kilo? : ");
        double patlicanKilo = input.nextDouble();

        double armutTutar = armutFiyat * armutKilo;
        double elmaTutar = elmaFiyat * elmaKilo;
        double domatesTutar = domatesFiyat * domatesKilo;
        double muzTutar = muzFiyat * muzKilo;
        double patlicanTutar = patlicanFiyat * patlicanKilo;

        double toplamTutar = armutTutar + elmaTutar + domatesTutar + muzTutar + patlicanTutar;

        System.out.println("Armut toplam tutarı : " + String.format("%.2f", armutTutar) + " TL");
        System.out.println("Elma toplam tutarı : " + String.format("%.2f", elmaTutar) + " TL");
        System.out.println("Domates toplam tutarı : " + String.format("%.2f", domatesTutar) + " TL");
        System.out.println("Muz toplam tutarı : " + String.format("%.2f", muzTutar) + " TL");
        System.out.println("Patlıcan toplam tutarı : " + String.format("%.2f", patlicanTutar) + " TL");
        System.out.println("Toplam Tutar : " + String.format("%.2f", toplamTutar) + " TL");
        input.close();
    }
}
