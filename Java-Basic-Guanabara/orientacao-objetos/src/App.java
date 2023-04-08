import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
       List<User> users = new ArrayList<>();

       int i = 0;

       while (i < 10) {
        User actual = new User("Name " + i, "LastName " + i);
        users.add(actual);
        i++;
       }

       System.out.println(users.get(8).getFirstName());
       System.out.println(users.get(8).getLastName());

       User user11 = new User("Name 11", "LastName 11");

       users.add(user11);

       System.out.println(users.get(10).getLastName());

       
        
    }
}
