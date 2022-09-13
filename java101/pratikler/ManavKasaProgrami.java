import java.util.Scanner;

public class ManavKasaProgrami {
  public static void main(String[] args) {

    // ürün fiyatları
    double armutFiyat = 2.14;
    double elmaFiyat = 3.67;
    double domatesFiyat = 1.11;
    double muzFiyat = 0.95;
    double patlicanFiyat = 5.00;

    double armutKilo, elmaKilo, domatesKilo, muzKilo, patlicanKilo;

    Scanner input = new Scanner(System.in);
    System.out.print("Armut kaç kilo? : ");
    armutKilo = input.nextDouble();
    System.out.print("Elma kaç kilo? : ");
    elmaKilo = input.nextDouble();
    System.out.print("Domates kaç kilo? : ");
    domatesKilo = input.nextDouble();
    System.out.print("Muz kaç kilo? : ");
    muzKilo = input.nextDouble();
    System.out.print("Patlıcan kaç kilo? : ");
    patlicanKilo = input.nextDouble();

    double total = (armutFiyat*armutKilo) + (elmaFiyat*elmaKilo) + (domatesFiyat*domatesKilo) + (muzFiyat*muzKilo) + (patlicanFiyat*patlicanKilo);

    System.out.println("Toplam Tutar: " + total);
    
  }
}
