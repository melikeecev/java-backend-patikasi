import java.util.Scanner;

public class KDVTutariHesaplama {
  public static void main(String[] args) {
    
    double price;
    double KDVRate = 0;
    double KDVAmount = 0;
    double priceWithKDV = 0;

    Scanner input = new Scanner(System.in);

    System.out.print("Fiyatı giriniz: ");
    price = input.nextDouble();

    if(price>0 && price<=1000) {
      KDVRate = 0.18;
      KDVAmount = price * KDVRate;
      priceWithKDV = price + KDVAmount;
    }else if(price>1000){
      KDVRate = 0.08;
      KDVAmount = price * KDVRate;
      priceWithKDV = price + KDVAmount;
    }else{
      System.out.println("Girmiş olduğunuz fiyat geçersizdir.");
    }

    System.out.println("KDV'siz Fiyat: " + price);
    System.out.println("KDV'li Fiyat: " + priceWithKDV);
    System.out.println("KDV tutarı " + KDVAmount);
    
  }
}
