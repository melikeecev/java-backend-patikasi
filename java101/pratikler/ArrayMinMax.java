import java.util.Scanner;
import java.util.Arrays;

public class ArrayMinMax {

  public static void main(String[] args){

    int[] list = {15, 12, 788, 1, -1, -788, 2, 0};
    int number;
    int min = list[0];
    int max = list[0];

    Scanner input = new Scanner(System.in);

    System.out.println("Dizi: " + Arrays.toString(list));
    System.out.print("Girilen sayı: ");
    number = input.nextInt();
      
    Arrays.sort(list);
    for (int i : list) {
      if (i < number) {
        min = i;
      }
      if (i > number) {
        max = i;
        break;
      }
    }

    System.out.println("Girilen sayıdan küçük en yakın sayı: " + min);
    System.out.println("Girilen sayıdan büyük en yakın sayı: " + max);
  }
}
