import java.util.Scanner;

public class MineSweeper {
	
	Scanner input = new Scanner(System.in);
    int rowMax, colMax;
    int row, col;
    int mineNum;
    String[][] gameMap;
    String[][] mineMap;
    boolean check = true;
    int count;

    public MineSweeper(int row, int col) {
        this.rowMax = row;
        this.colMax = col;
        this.mineNum = ((col * row) / 4);
        this.gameMap = new String[col][row];
        this.mineMap = new String[col][row];
    }

    public void createMap() {
        for (int i = 0; i < this.rowMax; i++) {
            for (int j = 0; j < this.colMax; j++) {
                gameMap[i][j] = "-";
                mineMap[i][j] = "-";
                System.out.print(gameMap[i][j] + " ");
            }
            System.out.println("");
        }

        for (int i = 0; i < mineNum; i++) {
            int a = (int) (Math.random() * this.rowMax);
            int b = (int) (Math.random() * this.colMax);
            if (mineMap[a][b].equals("*")) {
                i--; 
            }
            mineMap[a][b] = "*";
        }
    }

    public void scanMine() { 
        check = false;
        System.out.println("===============");
        System.out.print("Satır Giriniz: ");
        row = input.nextInt();
        System.out.print("Sütun Giriniz: ");
        col = input.nextInt();

        while (!check) {
            if (0 <= row && 0 <= col && row < this.rowMax && col < this.colMax) {
                check = true;
            } else {
                System.out.println("Seçmiş olduğunuz nokta haritada bulunmamaktadır. Tekrar satır ve sütun giriniz.");
                System.out.print("Satır Giriniz : ");
                row = input.nextInt();
                System.out.print("Sütun Giriniz : ");
                col = input.nextInt();
            }
        }
    }

    public void mineCount() { 
        count = 0;
        for (int i = (row - 1); i <= (row + 1); i++) {
            for (int j = (col - 1); j <= (col + 1); j++) {

                if ((i < 0 || j < 0 || i >= this.rowMax || j >= this.colMax)) {
                    continue;
                } else {
                    if (mineMap[i][j].equals("*")) {
                        count++;
                    }
                }
            }
        }

        gameMap[row][col] = String.valueOf(count); 
        mineMap[row][col] = String.valueOf(count); 
        for (int i = 0; i < this.rowMax; i++) {
            for (int j = 0; j < this.colMax; j++) {
                System.out.print(gameMap[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public void writeMineMap() { 
        for (int i = 0; i < this.rowMax; i++) {
            for (int j = 0; j < this.colMax; j++) {
                System.out.print(mineMap[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public boolean finishCheck() {
        for (int i = 0; i < this.rowMax; i++) {
            for (int j = 0; j < this.colMax; j++) {
                if (mineMap[i][j].equals("-")) {
                    return false;
                }
            }
        }
        return true;
    }

    public void run() {
    	
        createMap();

        while (check) {
            scanMine();
            if (mineMap[row][col].equals("*")) {
                System.out.println("Game Over!");
                writeMineMap();
                check = false;
            } else {
                mineCount();
                if (finishCheck()) {
                    System.out.println("Oyunu Kazandınız!");
                    writeMineMap();
                    check = false;
                }
            }
        }
    }
}
