import java.util.Arrays;
import java.util.Scanner;

public class ArrayOrder {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutu n: ");
        int n = input.nextInt();
        int[] list = new int[n];

        System.out.println("Dizinin elemanlarını giriniz:");
        for (int i = 0; i < list.length; i++) {
            int turn = i+1;
            System.out.print(turn++ + ". Elemanı: ");
            list[i] = input.nextInt();
        }
        Arrays.sort(list);

        System.out.println("Sıralama: " + Arrays.toString(list));
    }
}
