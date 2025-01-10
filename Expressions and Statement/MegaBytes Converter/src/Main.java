//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500); // "2500 KB = 2 MB and 452 KB"
        printMegaBytesAndKiloBytes(-1024); // "Invalid Value"
        printMegaBytesAndKiloBytes(5000); // "5000 KB = 4 MB and 904 KB"

    }
    // method calculates the megabytes and remaining kilobytes from the kilobytes parameter.
    public static void printMegaBytesAndKiloBytes (int kiloBytes) {
        // If the parameter kiloBytes is less than 0 then print the text "Invalid Value".
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
            return; // ends the program
        }
        // if the parameter kiloBytes is not less then 0,
        int megaBytes = kiloBytes / 1024;
        int remainingKB = kiloBytes % 1024;
        System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKB + " KB");
    }
}