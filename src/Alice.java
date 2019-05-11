import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Alice {

    public static void main(String[] args) {


        try {
            List<String> list = Files.readAllLines(Paths.get("src/alice30.txt"));
            System.out.println("Ilość lini: " + list.size());
        } catch (IOException e) {

            System.out.println("coś poszło nie tak przy wczytywaniu pliku");
            e.printStackTrace();
        }



        Set<String> set = new TreeSet<>();
        set.add("Tomek");
        set.add("Zbyszek");
        set.add("Ala");

        for(String name : set){
            System.out.println(name);
        }
    }

}
