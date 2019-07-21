import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UserComparator {
  public static void main(String[] args) {
    List<User1> users = new ArrayList<>();
    users.add(new User1(1, "ram"));
    users.add(new User1(2, "Dam"));
    users.add(new User1(3, "ham"));

    Collections.sort(users, new Comparator<User1>() {
      @Override public int compare(User1 o1, User1 o2) {
        return o2.getId() - o1.getId();
      }
    });

    for (User1 u : users) {
      System.out.println(u.getId());

    }
  }
}
