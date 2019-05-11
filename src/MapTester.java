import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTester {

    public static void main(String[] args) {
        Map<String, String> phones = new HashMap<>();
        phones.put("Tomek", "567-234-367");
        phones.put("Alicja", "234-765-987");
        phones.put("Tomek", "999-999-999");
        phones.put("Barbara", "999-999-999");

        System.out.println(phones);

        Set<String> keys = phones.keySet();
        System.out.println(keys);

        System.out.println(phones.containsKey("Barbara"));

        for ( String key : keys){
            System.out.println("Imię: " + key + ", telefon: " + phones.get(key));
        }

        for( String value : phones.values()){
            System.out.println("telefon: " + value);
        }

        for(Map.Entry entry: phones.entrySet()){

            System.out.println(entry.getKey() + " -> " + entry.getValue());
            entry.setValue("0");

        }

    }

}
