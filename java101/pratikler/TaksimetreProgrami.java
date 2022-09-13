import java.util.Scanner;

public class TaksimetreProgrami {
  public static void main(String[] args) {

    double distance, paidPrice;
    double pricePerKilometre = 2.20;
    double openingFee = 10.0;
    double minimumPrice = 20.0;
      
    Scanner input = new Scanner(System.in);
    System.out.print("Gidilen mesafeyi giriniz: ");
    distance = input.nextDouble();

    paidPrice = openingFee + (distance*pricePerKilometre);

    boolean bool = paidPrice <= 20;
    System.out.println(bool == true ? "Ödenecek Tutar: " + minimumPrice : "Ödenecek Tutar: " + paidPrice);
  }
}
