import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class  GooseFilter {
  String[] geese = {"African", "Roman Tufted", "Toulouse", "Pilgrim", "Steinbacher"};
  List<String> geeseList = new ArrayList<>(Arrays.asList(geese));

  public static List<String> filter(String[] arrayFilter) {
    String[] geese = {"African", "Roman Tufted", "Toulouse", "Pilgrim", "Steinbacher"};
    List<String> filter = new ArrayList<>(Arrays.asList(arrayFilter));
      for (int i = 0; i < geese.length; i++) {
        if(filter.contains(geese[i]))
          filter.remove(geese[i]);
      }
      return filter;
  }

}