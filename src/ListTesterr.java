import java.util.LinkedList;
import java.util.List;

public class ListTesterr {
    public static void main(String[] args) {

        List<String> person = new LinkedList<>();

        for (int i = 0; person.size() < 100_000; i++) {
            person.add(i, "fdfd");
            //  System.out.println(person.get(i));
        }
        person.add(0, "ktoś");
        //System.out.println(person.get(0));

        System.out.println(person);

//        for (int i = 100_000; person.size() < 1; i--) {
//            if (i % 2 == 0) {
//                person.remove(i);
//              //  System.out.println(person);
//            }
//        }
    }
}
