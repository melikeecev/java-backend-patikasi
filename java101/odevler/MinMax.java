import java.util.Scanner;

public class MinMax {
  public static void main(String[] args) {

    int select, number, min = 1, max = 1;
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Kaç tane sayı gireceksiniz: ");
    select = input.nextInt();

    for (int i = 1; i <= select; i++){
      System.out.print(i + ".sayiyi giriniz: ");
      number = input.nextInt();
      if (number > max){
        max = number;
      }else if (number < min){
        min = number;
      }
    }

    System.out.println("En büyük sayı: " + max);
    System.out.println("En küçük sayı: " + min);
    
  }
}
