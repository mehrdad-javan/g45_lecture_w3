package se.lexicon;

public class Calculation {

  public static  int findMax(int[] arr){ // {-12,-1,-3,-4,-2}
    int max = arr[0];
    for (int i = 0; i< arr.length; i++){
      if (max < arr[i]){
        max = arr[i];
      }
    }
    return max;
  }


}
