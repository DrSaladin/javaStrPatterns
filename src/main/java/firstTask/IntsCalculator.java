package firstTask;

public class IntsCalculator implements Ints {
  protected final Calculator target;

  public IntsCalculator() {
    this.target = new Calculator();
  }

  @Override
  public int sum(int arg0, int arg1) {
    return arrangeCalculation(arg0, arg1, Calculator.Operation.SUM);
  }

  private int arrangeCalculation(int arg0, int arg1, Calculator.Operation operator) {
    Calculator.Formula formula = this.target.newFormula();
    formula.a = (double) arg0;
    formula.b = (double) arg1;
    return formula.calculate(operator).result.intValue();
  }

  @Override
  public int mult(int arg0, int arg1) {
    return arrangeCalculation(arg0, arg1, Calculator.Operation.MULT);
  }

  @Override
  public int pow(int arg0, int arg1) {
    return arrangeCalculation(arg0, arg1, Calculator.Operation.POW);
  }
}
