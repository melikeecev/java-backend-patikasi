import java.util.Scanner;

public class DordunKatlariToplam {
  public static void main(String[] args) {
    int n;
    int sum = 0;
    Scanner input = new Scanner(System.in);

    do{
      System.out.print("Sayı giriniz: ");
      n = input.nextInt();
      if(n%4 == 0){
        sum += n;
      }
    }while(n%2==0);

    System.out.println("Toplam: " + sum);
  }
}
