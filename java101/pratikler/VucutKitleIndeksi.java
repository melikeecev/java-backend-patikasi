import java.util.Scanner;

public class VucutKitleIndeksi {
  public static void main(String[] args) {

    double height, weight, bmi;

    Scanner input = new Scanner(System.in);

    System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
    height = input.nextDouble();
    System.out.print("Lütfen kilonuzu giriniz: ");
    weight = input.nextDouble();

    bmi = weight / (height*height);
    System.out.println("Vücut Kitle İndeksiniz: " + bmi);
    
  }
}
