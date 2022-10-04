import java.util.Scanner;

public class TersUcgen {
  public static void main(String[] args) {

    int number;
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Basamak sayısı giriniz: ");
    number = input.nextInt();

    for(int i=number; i>0; i--){
      for(int j=number-i; j>0; j--){
        System.out.print(" ");
      }
      for(int k=(2*i)-1; k>0; k--){
        System.out.print("*");
      }
      System.out.println(" ");
    } 
  }
}
