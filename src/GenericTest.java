//import java.awt.*;
//import java.lang.reflect.Array;
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
//
//public class GenericTest {
//    public static void main(String[] args) {
//
//
//
//    List<String> list = new ArrayList<>();
//    list.add("jeden");
//    list.add("jeden");
//    list.add("trzy");
//    list.add("siedem");
//
//    printList(list);
//
//    List<Integer> list3 = new LinkedList<>();
//
//
//
//
//
////        Pair<String, String> p1 = new OrderedPair<>("jeden", "apple");
////        Pair<String, String> p2 = new OrderedPair<>("dwa", "pear");
////
////
////        boolean same = Util.compare(p1, p2);
////
////        System.out.println(" Czy są jednakowe: " + same);
//    }
//        public static void printList(List<?> list) {
//            for (Object e : list) {
//                System.out.println(e+ " ");
//            }
//            System.out.println();
//
//        }
//
//
//
//       // Pair<String, Box<Integer>> p3 = new OrderedPair<>("Alina", new Box<>());
//
//
//
//
////        Box <Person> box = new Box();
////        box.setObject(new Person("adaś",11));
////
////        Person p = box.getObject();
////
////        System.out.println(p.getName());
//
////        List <Point>list = new ArrayList();
////        list.add(new Point(1,2));
////
////        Point s = list.get(0);
//    }
//}
//
//    class Box<T> {
//        private T object;
//        public T getObject(){
//            return object;
//        }
//
//        public void setObject(T object){
//            this.object = object;
//        }
//
//    }
//
//    interface Pair<K, V>{
//        K getKey();
//        V getValue();
//
//    }
//
//    class OrderedPair<K, V> implements Pair<K, V>{
//
//    private K key;
//    private V value;
//
//        public OrderedPair(K key, V value) {
//            this.key = key;
//            this.value = value;
//        }
//
//        @Override
//        public K getKey() {
//            return key;
//        }
//
//        public void setKey(K key) {
//            this.key = key;
//        }
//
//        @Override
//        public V getValue() {
//            return value;
//        }
//
//        public void setValue(V value) {
//            this.value = value;
//        }
//    }
//
//    class Util{
//        public static <K, V>boolean compare(Pair<K, V> p1, Pair<K, V> p2){
//            return p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue());
//        }
//
//    }
//
//
//
