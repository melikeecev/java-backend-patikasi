import java.util.Scanner;

public class DaireDilimiAlan {
  public static void main(String[] args) {

    final double pi = 3.14;
    double radius, angle, area;

    Scanner input = new Scanner(System.in);
    System.out.print("Daire diliminin yarıçapı: ");
    radius = input.nextDouble();
    System.out.print("Daire diliminin açısı: ");
    angle = input.nextDouble();

    area = (pi * (radius*radius) * angle) / 360;
    System.out.println("Daire diliminin alanı: " + area);
    
  }
}
