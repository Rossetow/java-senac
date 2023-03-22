public class Kata{

    public static int grow(int[] x){
    int output = x[0];
    for (int i = 1; i<x.length; i++) {
        output= output*x[i];
      }
      return output;
    }
  }