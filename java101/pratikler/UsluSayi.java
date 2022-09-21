import java.util.Scanner;

public class UsluSayi {
  public static void main(String[] args) {

    int n,k;
    int total = 1;

    Scanner input = new Scanner(System.in);
    System.out.print("Üssü alınacak sayı: ");
    n = input.nextInt();
    System.out.print("Üs olacak sayı: ");
    k = input.nextInt();

    /*
    int i=1;
    while(i<=k){
      total *= n;
      i++;
    }
    */

    for(int i=1; i<=k; i++){
      total *= n;
    }

    System.out.println("Cevap: " + total);
      
  }
}
