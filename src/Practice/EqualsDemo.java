package Practice;

public class EqualsDemo {

  int x;

  public EqualsDemo(int x, int y) {
    this.x = x;
    this.y = y;
  }

  int y;

  public static void main(String[] args) {
    System.out.println(new EqualsDemo(1,2).equals(new EqualsDemo(1,2)));
  }

}
