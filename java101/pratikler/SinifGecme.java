import java.util.Scanner;

public class SinifGecme {
  public static void main(String[] args) {

    int matematik, fizik, turkce, kimya, muzik, total=0, counter=0;
    double average;

    Scanner input = new Scanner(System.in);

    System.out.print("Matematik notunuz: ");
    matematik = input.nextInt();
    System.out.print("Fizik notunuz: ");
    fizik = input.nextInt();
    System.out.print("Türkçe notunuz: ");
    turkce = input.nextInt();
    System.out.print("Kimya notunuz: ");
    kimya = input.nextInt();
    System.out.print("Müzik notunuz: ");
    muzik = input.nextInt();

    if(matematik>=0 && matematik<=100){
      total = total + matematik;
      counter++;
    }

    if(fizik>=0 && fizik<=100){
      total = total + fizik;
      counter++;
    }

    if(turkce>=0 && turkce<=100){
      total = total + turkce;
      counter++;
    }

    if(kimya>=0 && kimya<=100){
      total = total + kimya;
      counter++;
    }

    if(muzik>=0 && muzik<=100){
      total = total + muzik;
      counter++;
    }

    average = total/counter;

    if(average <= 55){
      System.out.println("Sınıfta kaldınız, seneye tekrar görüşmek üzere");
    }else{
      System.out.println("Tebrikler sınıfı geçtiniz!");
    }
    System.out.println("Ortalamanız: " + average);
  }
}
