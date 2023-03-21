import firstTask.Calculator;
import firstTask.Ints;
import firstTask.IntsCalculator;
import secondTask.BinOps;

public class Main {
  public static void main(String[] args) {

    // 1st task
    Calculator calc = new Calculator();
    System.out.println(
      calc.newFormula()
        .addOperand(5)
        .addOperand(15)
        .calculate(Calculator.Operation.MULT)
        .result()
    );


    Ints intsCalc = new IntsCalculator();
    System.out.println(intsCalc.sum(2, 2));
    System.out.println(intsCalc.sum(10, 22));
    System.out.println(intsCalc.pow(2, 10));
    // 1st task

    //2nd task
    BinOps bins = new BinOps();
    System.out.println(bins.mult("1100100", "110010"));
    System.out.println(bins.sum("100011", "1100"));
    //2nd task
  }
}
