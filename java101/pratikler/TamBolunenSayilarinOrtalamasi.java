import java.util.Scanner;

public class TamBolunenSayilarinOrtalamasi {
  public static void main(String[] args) {

    int k, sum=0, avg=0;
    int j=1;
    Scanner input = new Scanner(System.in);

    System.out.print("Sayı giriniz: ");
    k = input.nextInt();

    for(int i=1; i<=k; i++){
      if((i%3 == 0) && (i%4==0)){
        System.out.print(i+",");
        sum = sum+i;
        j++;
      }
    }
    avg = sum/j;
    System.out.println("Sayıların ortalaması: " + avg);
    
  }
}
