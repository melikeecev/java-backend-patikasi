import java.util.Scanner;

public class UcgeninAlani {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int firstSide, secondSide, thirdSide, perimeter;
    double area;
    
    System.out.print("1. kenarın uzunluğu: ");
    firstSide = input.nextInt();
    System.out.print("2. kenarın uzunluğu: ");
    secondSide = input.nextInt();
    System.out.print("3. kenarın uzunluğu: ");
    thirdSide = input.nextInt();

    perimeter = firstSide + secondSide + thirdSide;
    double halfPerimeter = perimeter/2;

    area = Math.sqrt((halfPerimeter*(halfPerimeter - firstSide)*(halfPerimeter - secondSide)* (halfPerimeter - thirdSide)));
    System.out.println("Üçgenin alanı: " + area);
    
  }
}
