public class MonkeyCounter
{
  public static int[] monkeyCount(final int n){

    int[] output = new int[n];
    for (int i = 0; i<output.length; i++) {
      output[i] = i+1;
    }
    return output;
  }
}