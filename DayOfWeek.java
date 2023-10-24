enum DayOfWeek {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class DaySelector {
    public static void main(String[] args) {
        DayOfWeek today = DayOfWeek.WEDNESDAY;

        String message;
        switch (today) {
            case MONDAY:
                message = "Start the workweek!";
                break;
            case FRIDAY:
                message = "Almost the weekend!";
                break;
            case SATURDAY:
            case SUNDAY:
                message = "Enjoy the weekend!";
                break;
            default:
                message = "Keep working!";
        }

        System.out.println("Today is " + today + ". " + message);
    }
}
