import java.util.Scanner;

public class NotOrtalamasiHesaplama {

    public static void main(String[] args){

        int matematikNotu, fizikNotu, kimyaNotu,turkceNotu, tarihNotu, muzikNotu;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        matematikNotu = input.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizikNotu = input.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimyaNotu = input.nextInt();

        System.out.print("Türkçe Notunuz: ");
        turkceNotu = input.nextInt();

        System.out.print("Tarih Notunuz: ");
        tarihNotu = input.nextInt();

        System.out.print("Müzik Notunuz: ");
        muzikNotu = input.nextInt();

        double toplam = (matematikNotu+fizikNotu+kimyaNotu+turkceNotu+tarihNotu+muzikNotu);
        double ortalama = toplam/6;
        System.out.println("Not ortalamanız: "+ortalama);

        boolean bool = ortalama >= 60;
        System.out.println(bool == true ? "Sınıfı Geçti" : "Sınıfta Kaldı");
        
    }

}
