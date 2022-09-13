import java.util.Scanner;

public class Login {
  public static void main(String[] args) {

    String userName, password, newPassword;
    int select;

    Scanner input = new Scanner(System.in);

    System.out.print("Kullanıcı Adınız: ");
    userName = input.nextLine();

    System.out.print("Şifreniz: ");
    password = input.nextLine();

    if(userName.equals("patika") && password.equals("java123")){
      System.out.println("Giriş Yaptınız!");
    }else{
      System.out.println("Bilgileriniz Yanlış!");
      System.out.println("Şifrenizi sıfırlamak ister misiniz?\n1-Evet\n2-Hayır");
      select = input.nextInt();
      switch(select){
        case 1:
          Scanner scanner = new Scanner(System.in);
          System.out.print("Lütfen yeni şifrenizi girin: ");
          newPassword = scanner.nextLine();
          
          if(newPassword.equals("java123")){
            System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
          }else{
            System.out.println("Şifre oluşturuldu");
          }
          break;
        case 2:  
          break;
      }
        
    }
  }
}
