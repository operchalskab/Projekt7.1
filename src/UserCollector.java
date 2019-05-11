import java.util.HashMap;
import java.util.Map;

public class UserCollector {
    public static void main(String[] args) {
        Map<Integer, User> users = new HashMap<>();

        users.put(1, new User("Piot","fdfdf",1));
        users.put(2, new User("fdfd","gfgf",10));

        for(User user: users.values())
        System.out.println(users);

        System.out.println(users.get(1));
    }


}
