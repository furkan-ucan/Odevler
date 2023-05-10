import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen gidilen mesafeyi (KM cinsinden) giriniz: ");
        double mesafe = input.nextDouble();
        double ucret = 10 + (mesafe * 2.20);
        ucret = (ucret < 20) ? 20 : ucret;
        System.out.println("Toplam tutar: " + ucret + " TL");
    }
}
