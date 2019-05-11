import java.util.ArrayList;
import java.util.List;

public class ListLab {
    public static final int LIst_size = 100_000;

    public static void main(String[] args) {

        List<Person> list = new ArrayList<>();
        Person person = new Person("Tomasz", 23);

        Stopwatch stopwatch = new Stopwatch();
        for(int i = 0; i<LIst_size; i++){
            list.add(0,person);
        }

        stopwatch.show(); //różnica czasu

        for(int i =0;i<LIst_size/2;i++){
            list.remove(0);
            list.remove(list.size()-1);
        }
        stopwatch.show();
    }
}
