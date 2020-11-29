package ArrayListImpl;

public class Example {

    public static void main(String[] args) {
        Example i = new Example();
       // i.foo(null);
    }
    public  void foo(Object o) {
        System.out.println("Object argument");
    }
    public  void foo(String s) {
        System.out.println("String argument");
    }

    public static void foo(Address i){
        System.out.println("StringBuffer impl");
    }
}
