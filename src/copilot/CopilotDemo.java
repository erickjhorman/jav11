package copilot;

import java.time.LocalDate;

public class CopilotDemo {
    public static void main(String[] args) {
        //Get age between two dates
        LocalDate date1 = LocalDate.of(1990, 1, 1);
        LocalDate date2 = LocalDate.of(2019, 1, 1);
        int age = date2.getYear() - date1.getYear();
        System.out.println("Age: " + age);
    }
}
