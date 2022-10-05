import java.util.Scanner;

public class RecursivePower {

  public static int power(int base, int powerRaised) {
    if (powerRaised != 0) {
      return (base * power(base, powerRaised - 1));
    }
    else {
      return 1;
    }
  }

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Taban sayıyı giriniz: ");
    int base = input.nextInt();
    System.out.print("Üssü giriniz: ");
    int powerRaised = input.nextInt();

    int result = power(base, powerRaised);
    System.out.println("Sonuç: " + result);
  }
}
