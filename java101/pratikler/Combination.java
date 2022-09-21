import java.util.Scanner;

public class Combination {
  public static void main(String[] args) {

    int n, r;
    int rFactorial = 1;
    int nFactorial=1;
    int nrFactorial = 1;
    int combination;

    Scanner input = new Scanner(System.in);

    System.out.print("n: ");
    n = input.nextInt();

    System.out.print("r: ");
    r = input.nextInt();

    for(int i = 1; i<=n; i++){
      nFactorial = nFactorial*i;
    }
    
    for(int i = 1; i<=r; i++){
      rFactorial = rFactorial*i;
    }

    for(int i = 1; i<=(n-r); i++){
      nrFactorial = nrFactorial*i;
    }

    combination = nFactorial / (rFactorial*nrFactorial);
    

    System.out.println("C("+n+","+r+") = " + combination);
    
  }
}
