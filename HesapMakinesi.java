import java.util.Scanner;


public class HesapMakinesi{
    public static void main(String[] args) {
        int n1, n2, select;
        Scanner input = new Scanner(System.in);
        System.out.println("İlk Sayıyı giriniz: ");
        n1 = input.nextInt();
        System.out.println("İkinci Sayıyı Giriniz: ");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz: ");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.print("Toplam: " + (n1+n2));
                break;
            case 2:
                System.out.print( "Çıkarma: " + (n1-n2));
                break;
            case 3:
                System.out.print("Çarpma: " + (n1*n2));
                break;
            case 4:
                if (n2 != 0 ) {
                    System.out.print("Bölme" + (n1/n2));

                } else{
                    System.out.print("Bir sayı Sıfıra bölünemez");

                }
                
                break;
            default:
                System.out.println("Geçersiz işlem");
                break;
        }
        input.close();
    }
}
