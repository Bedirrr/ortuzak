import java.util.Arrays;
import java.util.Scanner;

public class ortuzak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Dizi boyutunu girin: ");
        int size = input.nextInt();

        int[] array = new int[size];
        System.out.printf("Lütfen %d tane sayı girin:%n", size);
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }

        System.out.print("Bir sayı girin: ");
        int number = input.nextInt();

        Arrays.sort(array); // Diziyi sırala

        int index = Arrays.binarySearch(array, number);
        if (index >= 0) {
            System.out.printf("%d sayısı dizide bulunmaktadır.%n", number);
        } else {
            index = -index - 1;
            if (index == 0) { // Sayı dizinin en küçük elemanından daha küçük
                System.out.printf("Girilen sayı, %d'den küçüktür.%n", array[0]);
                System.out.printf("Dizinin en küçük elemanı %d'dir.%n", array[0]);
                System.out.printf("Dizinin en büyük elemanı %d'dir.%n", array[1]);
            } else if (index == array.length) { // Sayı dizinin en büyük elemanından daha büyük
                System.out.printf("Girilen sayı, %d'den büyüktür.%n", array[array.length - 1]);
                System.out.printf("Dizinin en küçük elemanı %d'dir.%n", array[array.length - 2]);
                System.out.printf("Dizinin en büyük elemanı %d'dir.%n", array[array.length - 1]);
            } else { // Sayı dizinin arasında bir yerde
                System.out.printf("Girilen sayı, %d ve %d arasındadır.%n", array[index - 1], array[index]);
                System.out.printf("En yakın küçük sayı %d'dir.%n", array[index - 1]);
                System.out.printf("En yakın büyük sayı %d'dir.%n", array[index]);
            }
        }
    }
}