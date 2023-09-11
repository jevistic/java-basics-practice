public interface DoIt {
    void doSomething(int i, double x);
    int doSomethingElse(String s);

    //a new functionality
    default void didItWork(){
        System.out.println("This is default method of DoIt interface");
    }
}