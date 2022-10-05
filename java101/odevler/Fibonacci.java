import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args) {
    int count, sum, number1=0, number2=1;

    Scanner input = new Scanner(System.in);
    System.out.print("Bir sayı giriniz: ");
    count = input.nextInt();

    int i=1;
    while(i<=count){
      System.out.print(number1+ " ");
      sum = number1+number2;
      number1 = number2;
      number2 = sum;
      i++;
    }
  }
}
