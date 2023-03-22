public class FindOutlier { 
  static int find(int[] integers) {
      int evenCount = 0;
      int oddCount = 0;
      int output = 0;
      for (int number : integers) {
          if (number % 2 == 0) {
              if (++evenCount > 1){
                  output = output('e',integers);
                break;
              }
          } else {
              if (++oddCount > 1){
                  output = output('o', integers);
                  break;
              }
          }
      }
      return output;
  }

  public static int output(char type, int[] integers)
  {
      switch (type) {
          case 'e':  
              for (int odd : integers) {
                  if(odd % 2 !=0){   
                      return odd;   
                  }   
              }    
              break;   
          case 'o' :  
              for (int even : integers){
                  if(even %2 ==0){    
                      return even;  
                  }    
              }  
              break;  
      }
      return 0;
  }
}