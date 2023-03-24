import java.util.Arrays;
import java.util.Collections;

public class ZywOo {
    public static int sumOfDifferences(int[] arr) {
      int output = 0;
      
    if(arr.length<2)
      return output;

      Arrays.sort(arr);
 
      // Reversing the array
      for(int i = 0; i < arr.length / 2; i++) {
        // Swapping the elements
        int j = arr[i];
        arr[i] = arr[arr.length - i - 1];
        arr[arr.length - i - 1] = j;
    }    
    for (int i = 0; i <= arr.length-2; i++) {
      output += arr[i]-arr[i+1];
    }
    return output;
   }
  
}