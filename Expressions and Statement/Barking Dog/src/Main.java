//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        shouldWakeUp (true, 1); // dog barks at 1am; true
        shouldWakeUp (false, 2); // dog doesn't bark; false
        shouldWakeUp (true, 8); // dog barks at 8am; false
        shouldWakeUp (true, -1); // dog barks, but invalid time; false
    }
    // method to tell if we need to wake up if the dog bars at night
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        // if the hourOfDay is less than 0 or more than 23, return false
        if (hourOfDay < 0 || hourOfDay > 23) {

            System.out.println(false);
            return false;
        }
        // if the dog is barking before 8am or after 10pm, return true (we should wake up)
        System.out.println(barking && (hourOfDay < 8 || hourOfDay > 22));
        return barking && (hourOfDay < 8 || hourOfDay > 22);
    }
}