import java.util.Arrays;

public class Duplicate {

  public static void duplicate(int [] array){
    int count = 1; 
    for (int i = 0; i < array.length; i++) {
      for (int j = i + 1; j < array.length; j++) {
        if(array[i] == array[j]){
          if((array[j] % 2) == 0){
            System.out.println(array[j]);
          }   
        }
      }
    }
  }

  public static void main(String[] args){

    int [] array = {7, 7, 7, 6, 2, 1, 3};
    duplicate(array);
  }
  
}
