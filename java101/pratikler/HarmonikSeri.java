import java.util.Scanner;

public class HarmonikSeri {
  public static void main(String[] args) {

    int n;
    double result = 0.0;
    Scanner input = new Scanner(System.in);

    System.out.print("N sayısını giriniz: ");
    n = input.nextInt();

    for(double i = 1; i<=n; i++){
      result += (1/i);
    }

    System.out.println(result);
  }
}
