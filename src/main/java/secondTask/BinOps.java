package secondTask;

public class BinOps {
  public String sum(String a, String b) {
    return fromInt(toInt(a) + toInt(b));
  }

  public String mult(String a, String b) {
    return fromInt(toInt(a) * toInt(b));
  }

  private int toInt(String item) {
    return Integer.parseInt(item, 2);
  }

  private String fromInt(int item) {
    return Integer.toBinaryString(item);
  }
}
