import java.util.Scanner;

public class MukemmelSayi {
  public static void main(String[] args) {

    int number, sum=0;
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Bir sayı giriniz: ");
    number = input.nextInt();

    for(int i=1; i<number; i++){
      if(number%i==0){
        sum = sum+i;
      }
    }

    if(sum == number){
      System.out.println(number+ " mükemmel sayıdır");
    }else{
      System.out.println(number+ " mükemmel sayı değildir");
    }
    
  }
}
