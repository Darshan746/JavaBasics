import java.util.*;

public class Int12  implements Int1,Int2 {
  String name ;
  Integer age;

  public Int12(String name, Integer age) {
    this.name = name;
    this.age = age;
  }

  public static void main(String[] args) {

    List<String> str = new ArrayList<>();
    str.add("one");
    str.add("two");

    Iterator it = str.iterator();
    while(it.hasNext()){
      Int12 one = new Int12("ram",23);
      Int12 two = new Int12("ram",23);

      System.out.println(it.next());

  }

  }

  @Override
  public  String add() {
    return  "";
  }
}
