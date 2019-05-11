public class ArrayGenerics {

    public static void main(String[] args) {
        String [] names = {"Ala" , "Ola", "Ela"};
        Integer [] numbers = {2,5,6,7};
        Boolean [] answers = {false, false, true, true};

    }

    public static <T> void print(T[] array){
        System.out.println("\n Klasa: " + array.getClass());
        for (T element : array) {
            System.out.println("Element: " + element);
        }
    }
}
