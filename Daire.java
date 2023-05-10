import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz(cm): ");
        double yaricap = input.nextDouble();
        System.out.print("Daire diliminin merkez açısının ölçüsünü giriniz: ");
        double aci = input.nextDouble();
        double pi = 3.14;
        double alan = (pi * (yaricap * yaricap) * aci) / 360;
        System.out.println("Daire diliminin alanı: " + alan);
    }
}
