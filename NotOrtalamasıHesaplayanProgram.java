package Odevler;
import java.util.Scanner;

public class NotOrtalamasıHesaplayanProgram{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu girin: ");
        int matematikNotu = input.nextInt();

        System.out.print("Fizik notunuzu girin: ");
        int fizikNotu = input.nextInt();

        System.out.print("Kimya notunuzu girin: ");
        int kimyaNotu = input.nextInt();

        System.out.print("Türkçe notunuzu girin: ");
        int turkceNotu = input.nextInt();

        System.out.print("Tarih notunuzu girin: ");
        int tarihNotu = input.nextInt();

        System.out.print("Müzik notunuzu girin: ");
        int muzikNotu = input.nextInt();

        double ortalama = (matematikNotu + fizikNotu + kimyaNotu + turkceNotu + tarihNotu + muzikNotu) / 6.0;

        String sinifGecmeDurumu = (ortalama >= 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";

        System.out.println("Ortalama: " + ortalama);
        System.out.println(sinifGecmeDurumu);
    }
}
    