public class TimeCalc {
    public static void main(String[] args) {
        // Asks the user for a time and minutes to add to that time.
        String time = args[0];
        int minutesToAdd = Integer.parseInt(args[1]);

        // Stores the hours and minutes inputted.
        int hours = Integer.parseInt("" + time.charAt(0) + time.charAt(1));
        int minutes = Integer.parseInt("" + time.charAt(3) + time.charAt(4));

        // Converts the net time into minutes.
        int hoursInMinutes = hours * 60;
        int finalMinutes = minutes + minutesToAdd;
        int finalTimeInMinutes = hoursInMinutes + finalMinutes;

        // Find the resultant hours.
        // It becomes very simple, as Java rounds non-integers down.
        int newHours = (finalTimeInMinutes/60) % 24;

        // Find the resultant minutes.
        int newMinutes = finalMinutes % 60;

        // Fixes outputs.
        String hoursPrint = "";
        String minutesPrint = "";
        if (newHours < 10) {
            hoursPrint = "0" + newHours;
        } else {hoursPrint = "" + newHours;}
        if (newMinutes < 10) {
            minutesPrint = "0" + newMinutes;
        } else {minutesPrint = "" + newMinutes;}

        System.out.println(hoursPrint + ":" + minutesPrint);
    }
}
