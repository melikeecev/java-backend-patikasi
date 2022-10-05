import java.util.Scanner;

public class RecursivePrime {

  public static boolean isPrime(int n, int i){
    if(n <= 2){
      return (n == 2) ? true : false;
    }else if(n % i == 0){
      return false;
    }else if(i * i > n){
      return true;
    }
    return isPrime(n, i + 1);
  }
  

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Sayı giriniz: ");
    int n = input.nextInt();

    if (isPrime(n, 2)){
      System.out.println(n+ " sayısı ASALDIR!");
    }else{
      System.out.println(n+ " sayısı ASAL DEĞİLDİR!");
    }
    
  }
}
