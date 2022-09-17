import java.util.Scanner;

public class ChineseZodiac {
  public static void main(String[] args) {

    int birthYear, reminder;
    String chineseZodiac = "";

    Scanner input = new Scanner(System.in);

    System.out.print("Doğum yılınızı giriniz: ");
    birthYear = input.nextInt();

    reminder = birthYear%12;

    switch(reminder){
      case 0:
        chineseZodiac = "Maymun";
        break;
      case 1:
        chineseZodiac = "Horoz";
        break;
      case 2:
        chineseZodiac = "Köpek";
        break;
      case 3:
        chineseZodiac = "Domuz";
        break;
      case 4:
        chineseZodiac = "Fare";
        break;
      case 5:
        chineseZodiac = "Öküz";
        break;
      case 6:
        chineseZodiac = "Kaplan";
        break;
      case 7:
        chineseZodiac = "Tavşan";
        break;
      case 8:
        chineseZodiac = "Ejderha";
        break;
      case 9:
        chineseZodiac = "Yılan";
        break;
      case 10:
        chineseZodiac = "At";
        break;
      case 11:
        chineseZodiac = "Koyun";
        break;
    }

    System.out.println("Çin Zodyağı Burcunuz: " + chineseZodiac);
  }
}
