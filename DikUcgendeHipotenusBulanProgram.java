import java.util.Scanner;

public class DikUcgendeHipotenusBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c, u, alan, hipotenüs;
        
        // Kullanıcıdan iki dik kenarın uzunluğunu alın
        System.out.print("Birinci dik kenarın uzunluğunu girin: ");
        a = input.nextDouble();
        
        System.out.print("İkinci dik kenarın uzunluğunu girin: ");
        b = input.nextDouble();
        
        // Hipotenüsü hesaplayın ve kullanıcıya ekrana yazdırın
        hipotenüs = Math.sqrt(a*a + b*b);
        System.out.println("Hipotenüs: " + hipotenüs);
        
        // Kullanıcıdan üç kenar uzunluğunu alın
        System.out.print("Üçgenin birinci kenar uzunluğunu girin: ");
        a = input.nextDouble();
        
        System.out.print("Üçgenin ikinci kenar uzunluğunu girin: ");
        b = input.nextDouble();
        
        System.out.print("Üçgenin üçüncü kenar uzunluğunu girin: ");
        c = input.nextDouble();
        
        // Alanı hesaplayın ve kullanıcıya ekrana yazdırın
        u = (a + b + c) / 2;
        alan = Math.sqrt(u * (u-a) * (u-b) * (u-c));
        System.out.println("Üçgenin alanı: " + alan);
        
        input.close();
    }
}
