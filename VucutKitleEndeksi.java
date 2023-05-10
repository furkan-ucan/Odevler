import java.util.Scanner;
public class VucutKitleEndeksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Boyunuzu(Metre Cinsinden) giriniz: ");
        double boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu (Kg) giriniz: ");
        double kg = input.nextDouble();
        double kitle_endeksi = kg/(boy*boy);
        System.out.println("Vücut Kitle İndeksiniz: " + kitle_endeksi);

        input.close();

    }
}
