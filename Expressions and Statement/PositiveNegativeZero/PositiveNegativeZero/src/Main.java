public class Main {
    public static void main(String[] args) {
        checkNumber(1); // "positive"
        checkNumber(-5); // "negative"
        checkNumber(0); // "zero"
    }
    public static void checkNumber (int number) {
        // nested ternary operator
        System.out.println((number > 0) ? "positive" : ((number < 0) ? "negative" : "zero"));
    }
}
