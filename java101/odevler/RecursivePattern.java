import java.util.Scanner;

public class RecursivePattern {

  public static void pattern(int number) {

        System.out.print(number + " ");

        if (0 < number) {
            pattern(number - 5);
            System.out.print(number + " ");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        int number = scanner.nextInt();

        pattern(number);
    }
}
