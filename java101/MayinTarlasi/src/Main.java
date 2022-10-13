import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz!");
        System.out.println("Harita büyüklüğünü giriniz.");
        System.out.print("Satır : ");
        int row = input.nextInt();
        System.out.print("Sütun : ");
        int col = input.nextInt();

        MineSweeper mine = new MineSweeper(row, col); 
        mine.run();
        input.close();
	}
}
