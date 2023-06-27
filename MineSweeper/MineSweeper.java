package MineSweeper;

import java.util.Scanner;

public class MineSweeper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Satır sayısını girin: ");
        int satirSayisi = scanner.nextInt();
        System.out.print("Sütun sayısını girin: ");
        int sutunSayisi = scanner.nextInt();
        
        int elemanSayisi = satirSayisi * sutunSayisi;
        int mayinSayisi = elemanSayisi / 4;
        int[][] mayinlar = new int[mayinSayisi][2];
        int[][] oyunTahtasi = new int[satirSayisi][sutunSayisi];
        
        for (int i = 0; i < mayinSayisi; i++) {
            int satir, sutun;
            do {
                satir = (int) (Math.random() * satirSayisi);
                sutun = (int) (Math.random() * sutunSayisi);
            } while (mayinVarMi(mayinlar, satir, sutun));
            mayinlar[i][0] = satir;
            mayinlar[i][1] = sutun;
        }
        
        boolean oyunDevamEdiyor = true;
        while (oyunDevamEdiyor) {
            oyunTahtasiniGoster(oyunTahtasi);
            System.out.print("Satır seçin: ");
            int satir = scanner.nextInt();
            System.out.print("Sütun seçin: ");
            int sutun = scanner.nextInt();
            
            if (satir < 0 || satir >= satirSayisi || sutun < 0 || sutun >= sutunSayisi) {
                System.out.println("Geçersiz bir nokta seçtiniz. Lütfen tekrar deneyin.");
            } else if (mayinVarMi(mayinlar, satir, sutun)) {
                System.out.println("Mayına bastınız! Oyun bitti.");
                oyunDevamEdiyor = false;
            } else {
                int mayinSayisiEtrafta = mayinSayisiEtrafta(mayinlar, satir, sutun);
                oyunTahtasi[satir][sutun] = mayinSayisiEtrafta;
                if (oyunBittiMi(oyunTahtasi, mayinlar)) {
                    System.out.println("Tebrikler! Tüm mayınları buldunuz.");
                    oyunDevamEdiyor = false;
                }
            }
        }
    }
    
    public static boolean mayinVarMi(int[][] mayinlar, int satir, int sutun) {
        for (int i = 0; i < mayinlar.length; i++) {
            if (mayinlar[i][0] == satir && mayinlar[i][1] == sutun) {
                return true;
            }
        }
        return false;
    }
    
    public static int mayinSayisiEtrafta(int[][] mayinlar, int satir, int sutun) {
        int sayac = 0;
        for (int i = satir - 1; i <= satir + 1; i++) {
            for (int j = sutun - 1; j <= sutun + 1; j++) {
                if (i >= 0 && i < mayinlar.length && j >= 0 && j < mayinlar[0].length && mayinVarMi(mayinlar, i, j)) {
                    sayac++;
                }
            }
        }
        return sayac;
    }
    
    public static boolean oyunBittiMi(int[][] oyunTahtasi, int[][] mayinlar) {
        for (int i = 0; i < oyunTahtasi.length; i++) {
            for (int j = 0; j < oyunTahtasi[0].length; j++) {
                if (oyunTahtasi[i][j] == 0 && !mayinVarMi(mayinlar, i, j)) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public static void oyunTahtasiniGoster(int[][] oyunTahtasi) {
        for (int i = 0; i < oyunTahtasi.length; i++) {
            for (int j = 0; j < oyunTahtasi[0].length; j++) {
                if (oyunTahtasi[i][j] == 0) {
                    System.out.print("- ");
                } else {
                    System.out.print(oyunTahtasi[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}