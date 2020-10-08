package ArrayListImpl;

public class B  extends A{
    public int a =11;
    public void display(){
        System.out.println("Am printing in B");
    }

    public static void main(String[] args) {
        A c = new B();
        c.display();
        System.out.println(c.a);
    }
}
