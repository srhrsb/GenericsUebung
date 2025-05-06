public class Main {
    public static void main(String[] args) {

       Box stringBox = new Box<Double, Integer>(3.0, 5);
       System.out.println( stringBox.getValue() );

        Box intBox = new Box<Integer, Double>(5, 7.0);
        System.out.println( intBox.getValue() );

        Box doubleBox = new Box<Double, Character>(5.0, 'H');
        System.out.println( doubleBox.getValue() );

    }
}