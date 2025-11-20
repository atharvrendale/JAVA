import java.time.LocalDate;
import java.time.DayOfWeek;


public class CMD_Line_Interface1 {
    public static void main(String[] args) {
        int year =Integer.parseInt(args[0]);
        int month=Integer.parseInt(args[1]);
        int day=Integer.parseInt(args[2]);

        LocalDate date = LocalDate.of(year,month,day);
        DayOfWeek DOW= date.getDayOfWeek();

        System.out.println("Yur day is: "+DOW);

    }
}