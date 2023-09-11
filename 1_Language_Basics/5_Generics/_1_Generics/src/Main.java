public class Main {
    public static void main(String[] args) {
        System.out.println("Generics!");

        //Instantiating generic type
        //Here Integer is type argument not the parameter
        Box<Integer> integerBox = new Box<Integer>();

        //<> This is called diamond. Here compiler will infer the arguments from context
//        Box<Integer> integerBox = new Box<Integer>();


        OrderedPair<String, Integer> p1 = new OrderedPair<String, Integer>("Even", 8);
        OrderedPair<String, String>  p2 = new OrderedPair<String, String>("hello", "world");


        //The diamond
        OrderedPair<String, Integer> p3 = new OrderedPair<>("Even", 8);
        OrderedPair<String, String>  p4 = new OrderedPair<>("hello", "world");

        System.out.println(p1.getKey());
        System.out.println(p2.getValue());


        //Raw Types
        Box<Integer> intBox = new Box<>();  //parameterized
        Box rawBox1 = new Box();  //raw type


        // assigning a parameterized type to its raw type is allowed
        Box rawBox2 = intBox;


        // if you assign a raw type to a parameterized type, you get a warning:
        Box<Integer> intBox1 = rawBox1;


        //You also get a warning if you use a raw type to invoke generic methods defined in the corresponding generic type
        rawBox2.set(6);
        System.out.println(rawBox2.get());


        //Generic methods example
        Pair<Integer, String> p5 = new Pair<>(1, "apple");
        Pair<Integer, String> p6 = new Pair<>(2, "pear");
        boolean same = Util.<Integer, String>compare(p5, p6);  //comapre is generic method in Util class
//        boolean same = Util.compare(p5, p6);  //compiler will infer the type that is needed
        System.out.println("equal: "+same);


        //generic methods example 2
        Integer[] intArray = { 3, 7, 2, 8, 5 };
        Double[] doubleArray = { 3.14, 2.71, 1.618, 2.0 };
        String[] stringArray = { "apple", "banana", "orange", "pear" };

        System.out.println("Maximum Integer: " + findMax(intArray));
        System.out.println("Maximum Double: " + findMax(doubleArray));
        System.out.println("Maximum String: " + findMax(stringArray));

    }

    public static <T extends Comparable<T>> T findMax(T[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }

        T max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(max) > 0) {
                max = arr[i];
            }
        }
        return max;
    }

}



//non-generic class
//class Box {
//    private Object object;
//
//    public void set(Object object) { this.object = object; }
//    public Object get() { return object; }
//}


//generic class
//It takes type T as type parameter and can be used for multiple types
class Box<T> {
    // T stands for "Type"
    private T t;

    public void set(T t) { this.t = t; }
    public T get() { return t; }
}



//Multiple parameters

class OrderedPair<K, V>{

    private K key;
    private V value;

    public OrderedPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey()	{ return key; }
    public V getValue() { return value; }
}