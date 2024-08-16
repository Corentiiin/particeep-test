package basic;

import io.vavr.control.Option;

/**
 * For this basic test, you should not use any library. e.g. you should not use Math.pow for power method
 */
public class BasicTest {

  /**
   * return i ^ n for positive Integer, None otherwise
   * alse return None in case of errors
   */
  public static Option<Integer> power(Integer i, Integer n) {
    
    // Check for a valid arguments.
    if (i == null || n == null) {
      return Option.none();
    }

    // Check if arguments are positve Integer.
    if (i < 0 || n < 0) {
      return Option.none();
    }

    Integer res = 1;
    for (int j = 0; j < n; j++) {
      res = res * i;
    }

    // In case of Integer overflow.
    if (i != 0 && res == 0)
      return Option.none();

    return Option.of(res);
  }
}
