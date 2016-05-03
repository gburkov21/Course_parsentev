package gburkov;

public class Calculator {
  double result = 0;
  
  public void add (double first, double second) {
    result = first + second;
    System.out.println(result);
  }
   
  public void substruct (double first, double second) {
    result = first - second;
    System.out.println(result);
  }

  public void div (double first, double second) {
    result = first / second;
    System.out.println(result);
  }

  public void multiple (double first, double second) {
    result = first * second;
    System.out.println(result);
  }
}