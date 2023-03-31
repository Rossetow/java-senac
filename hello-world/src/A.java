public class A { 
    private  static int lastNumber = 0;
    public static int getNumber() {
        lastNumber = (lastNumber==0) ? 1 : lastNumber *2;
        return lastNumber;
    }
   }