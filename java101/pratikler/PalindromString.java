import java.util.Scanner;

public class PalindromString {

    static String isPalindrome(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        if (str.equals(reverse))
            return "Palindromik Kelimedir";
        else
            return "Palindromik kelime değildir";
    }

    public static void main(String[] args) {

        String word;
        Scanner input = new Scanner(System.in);
        System.out.print("Kelime giriniz: ");
        word = input.nextLine();
      
        System.out.println(isPalindrome(word));
    }
}
