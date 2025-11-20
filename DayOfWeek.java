public class DayOfWeek {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Please provide date in the format: day month year");
            return;
        }

        try {
            int day = Integer.parseInt(args[0]);
            int month = Integer.parseInt(args[1]);
            int year = Integer.parseInt(args[2]);

            if (month < 3) {
                month += 12;
                year -= 1;
            }

            int k = year % 100;
            int j = year / 100;
            int dayOfWeek = (day + ((13 * (month + 1)) / 5) + k + (k / 4) + (j / 4) + (5 * j)) % 7;

            String[] days = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
            System.out.println("The day of the week is: " + days[dayOfWeek]);
        } catch (NumberFormatException e) {
            System.out.println("Please enter valid integers for day, month, and year.");
        }
    }
}
