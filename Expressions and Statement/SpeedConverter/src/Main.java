public class Main {
    public static void main(String[] args) {
        printConversion(1.5); // 1 mi/h
        printConversion(10.25); // 6 mi/h
        printConversion(-5.6); // Invalid Value
        printConversion(25.42); // 16 mi/h
        printConversion(75.114); // 47 mi/h
    }
    public static long toMilesPerHour (double kilometersPerHour) {
//        if (kilometersPerHour < 0) {
//            return -1; // to indicate an invalid value
//        }
        // if kilometersPerHour is positive, divide it by 1.609 to convert it to milesPerHour
        return Math.round(kilometersPerHour / 1.609);
    }
    public static void printConversion (double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
            return;
        }
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
    }
}
