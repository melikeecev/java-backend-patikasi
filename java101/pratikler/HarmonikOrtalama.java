public class HarmonikOrtalama {

  public static void main(String[] args){
    int[] numbers = {1, 2, 3, 4, 5};

    double sum = 0;
    for(double i=1; i<=numbers.length; i++){
      sum = sum + (1/i);
    }
    System.out.println("Harmonik Ortalama: " + sum);
  }
}
