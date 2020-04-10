public class GenericClass<T> {
    private T t; //Declaring variable t,using T as type.

    // Set method,does not return any value.
    public void set(T t) {
        this.t = t;
    }
    // method returns value of type T.
    public T get() {
        return t;
    }

    public static void main(String[] args) {
        // instance of String type
        GenericClass<String> sInstances = new GenericClass<>();
        sInstances.set("Moniccah Madingwane");
        System.out.println(sInstances.get());


        // instance of Integer type
        GenericClass<Integer> iInstances = new GenericClass<>();
        iInstances.set(25);
        System.out.println(iInstances.get());

    }
}