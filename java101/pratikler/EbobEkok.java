import java.util.Scanner;

public class EbobEkok {
  public static void main(String[] args) {

    int ebob = 1, ekok;
    Scanner input = new Scanner(System.in);
    System.out.print("n1 sayısını giriniz: ");
    int n1 = input.nextInt();

    System.out.print("n2 sayısını giriniz: ");
    int n2 = input.nextInt();

    int i = 1;
    while (i<=n1 && i<=n2) {
      if(n1 % i == 0 && n2 % i == 0){
        ebob = i;
      }
      i++;
    }
    System.out.println("Ebob = " + ebob);

    ekok = (n1 * n2) / ebob;

    System.out.println("Ekok = " + ekok);
    
  }
}
