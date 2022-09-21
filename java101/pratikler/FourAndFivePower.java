import java.util.Scanner;

public class FourAndFivePower {
  public static void main(String[] args) {

    int n;
    Scanner input = new Scanner(System.in);
    System.out.print("Sınır sayısı giriniz: ");
    n = input.nextInt();

    for(int i=1; i<=n; i++) {
      if(i%4==0 || i%5==0){
        System.out.println(i);
      }
    }
    
  }
}
