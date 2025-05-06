public class Box<T extends Number, U > {

    private T value;
    private U value2;

    public Box( T value, U value2) {
        this.value = value;
        this.value2 = value2;
    }

    public T getValue(){
        return value;
    }
    public U getValue2(){
        return value2;
    }

}
