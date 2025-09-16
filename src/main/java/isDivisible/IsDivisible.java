package isDivisible;

//Write a method that returns whether a is divisible by b.
//
//Your method signature should be
//
//public boolean isDivisible(int a, int b)

public class IsDivisible {

  public boolean iDivisible(int a, int b) {
    if(b == 0) {
      return true
    }
    return a % b == 0;
  }
}
