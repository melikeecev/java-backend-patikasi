import java.util.Scanner;

public class UcakBileti {
  public static void main(String[] args) {

    int age, travelType;
    double distance, normalPrice, ageDiscount=0, tTypeDiscount, ageDiscountedPrice, totalAmount=0;
    double farePerDistance = 0.10;

    Scanner input = new Scanner(System.in);
    System.out.print("Mesafeyi km türünden giriniz: ");
    distance = input.nextDouble();
    System.out.print("Yaşınızı giriniz: ");
    age = input.nextInt();
    System.out.print("Yolculuk tipini giriniz (1=>Tek Yön, 2=>Gidiş Dönüş): ");
    travelType = input.nextInt();

    normalPrice = distance*farePerDistance;

    if((distance>0) && (age>0) && (travelType==1 || travelType==2) ){
      if(age<12){
        ageDiscount  = normalPrice*0.50;
      }else if(age>=12 && age<=24){
        ageDiscount  = normalPrice*0.10;
      }else if(age>65){
        ageDiscount = normalPrice*0.30;
      }else{
        ageDiscount = 0;
      }
      
      ageDiscountedPrice = normalPrice - ageDiscount;

      if(travelType == 2){
        tTypeDiscount = ageDiscountedPrice*0.20;
        totalAmount = (ageDiscountedPrice-tTypeDiscount)*2;
      }else{
        totalAmount = ageDiscountedPrice;
      }
      
    }else{
      System.out.println("Hatalı veri girdiniz!");
    }
    
    System.out.println("Toplam Tutar= "+totalAmount);
    
  }
}
