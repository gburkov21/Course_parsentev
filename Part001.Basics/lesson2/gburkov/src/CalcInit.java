package gburkov;

public class CalcInit {
  public static void main (String[] args) {

     Calculator calc = new Calculator();
        calc.add (1,2);
        System.out.println(calc.result);
        calc.substruct (4,3);
        System.out.println(calc.result);
        calc.div (10,2);
        System.out.println(calc.result);
        calc.multiple (5,4);
        System.out.println(calc.result);
  }
}