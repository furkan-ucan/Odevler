package DuplicatePairs;

import java.util.*;

public class DuplicatePairs {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 5, 6, 7, 8, 8, 9, 10, 10, 11, 12, 13, 14, 14, 15};
        Map<Integer, Integer> countMap = new HashMap<>();
        
        // Dizideki sayıların tekrar sayılarını hesapla
        for (int number : numbers) {
            if (number % 2 == 0) {
                if (countMap.containsKey(number)) {
                    countMap.put(number, countMap.get(number) + 1);
                } else {
                    countMap.put(number, 1);
                }
            }
        }
        
        // Tekrar eden çift sayıları ekrana yazdır
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " sayısı " + entry.getValue() + " kez tekrar ediyor.");
            }
        }
    }
}