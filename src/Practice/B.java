package Practice;

public class B extends A{
  public void action(){
    System.out.println("In class:B");
  }

  public static void main(String[] args) {
    A a = new B();
    a.action();
  }
}
