package pl.globallogic.exercises;

public class ex5LeapyearCalcul {
    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600)); // Output: false
        System.out.println(isLeapYear(1600));  // Output: true
        System.out.println(isLeapYear(2017));  // Output: false
        System.out.println(isLeapYear(2000));  // Output: true
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }

        return false;
    }
}
