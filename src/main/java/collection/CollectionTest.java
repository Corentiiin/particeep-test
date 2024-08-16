package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * You should complete the function in this class
 * <p>
 * Feel free to define any method and / or class you want
 */
class CollectionTest {


  /**
   * operation : x -> ((x * 2) + 3) ^ 5
   */
  public static List<Double> compute1(List<Integer> input) {
    List<Double> res = new ArrayList<>();

    input.forEach(x -> res.add(Double.valueOf(Math.pow((x * 2) + 3, 5))));

    return res;
  }

  /**
   * operation : abc -> AbcAbc
   */
  public static List<String> compute2(List<String> input) {

      List<String> res = new ArrayList<>();

      for (String string : input) {
        if (string.length() == 0) {
          res.add("");
        }
        else {
          String firstChar = string.substring(0, 1).toUpperCase();
        
          if (string.length() == 1) {
            res.add(firstChar + firstChar);
          }
          else {
            String subString = string.substring(1);
            res.add(firstChar + subString + firstChar + subString);
          }
        }
    }

    return res;
  }
}
