/**
  * https://www.hackerrank.com/challenges/java-interface?h_r=next-challenge&h_v=zen
  */
import java.util.*;


interface AdvancedArithmetic{
  public abstract int divisorSum(int n);
}

class MyCalculator implements AdvancedArithmetic{
  public int divisorSum(int n){
    int dsum = 0;
    if (n <= 1){
      return 1;
    }
    for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                dsum += i;
            }
    }
    return dsum + n + 1; // number and 1 are always divisors
  }
}

class Solution{

  public static void main(String []args){
      MyCalculator my_calculator = new MyCalculator();
      System.out.print("I implemented: ");
      ImplementedInterfaceNames(my_calculator);
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      System.out.print(my_calculator.divisorSum(n) + "\n");

  }
  /*
   *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
   */
  static void ImplementedInterfaceNames(Object o)
  {

      Class[] theInterfaces = o.getClass().getInterfaces();
      for (int i = 0; i < theInterfaces.length; i++)
      {
          String interfaceName = theInterfaces[i].getName();
          System.out.println(interfaceName);
      }
  }
}
