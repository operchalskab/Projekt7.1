import java.util.*;

public class ListTester {
    public static void main(String[] args) {

        List<String> person = new LinkedList<>();

        for( int i =0; person.size()<100_000; i++) {
            person.add(i,"fdfd");
          //  System.out.println(person.get(i));
        }
        person.add(0,"ktoś");
        //System.out.println(person.get(0));

        System.out.println(person);

        for(int i = 100_000; person.size()<1; i-- ){
            person.remove(person.size());
    }


//        List<String> myListtt = new LinkedList<>();
//        myListtt = new LinkedList<>(Arrays.asList("a", "b", "c", "a"));
//
//
//        List<String> myListt = new LinkedList<>();
//        myListt.add("pierwszy");
//        myListt.add("drugi");
//
//        myListt.add(0,"zerowy");
//        myListt.remove("drugi");
//
//        System.out.println(myListt);
//
//        List<Integer> myList = new ArrayList<>();
//
//        myList = Arrays.asList(1,2,4,545,5454,454);
//
//
//
//
//        for(int i =0; i< myList.size();i++ ){
//            System.out.println(myList.get(i));
//        }
//
//        for (Integer element : myList){
//            System.out.println(element);
//        }
//
//        Iterator<Integer> iterator = myList.listIterator();
//
//        while (iterator.hasNext()){
//
//            Integer e = iterator.next();
//            if(e % 2 == 0)
//            System.out.println("P: " + e);
//        }


        //myList.add(123);
        //myList.add(4);

       // List <> myList = new ArrayList<>();
       // myList.add(1);
       // myList.add(new Object());
       // myList.add("siedem");

       // System.out.println(myList.get(0));
       // System.out.println(myList.get(1));
       // System.out.println(myList.get(2));

       // System.out.println((int)myList.get(0) + (String)myList.get(2));
        //myList.clear();
        //System.out.println(myList.size());
    }
}
