public class Date {
    public static void main(String[] args){
        String firstLine = "Hello, Again!";
                System.out.println("The value of the first line is: " + firstLine);

                // Time variables
                int hour = 12;
                int minute = 58;

                // Prints the time output
                System.out.print("The current time is: ");
                System.out.print(hour);
                System.out.print(":");
                System.out.print(minute);
                System.out.print(". ");

                // Shows the number of minutes since midnight
                System.out.print("\nNumber of minutes since midnight: ");
                System.out.println(hour * 60 + minute);

                // Shows the percentage of the hour that has passed
                System.out.print("Percent of the hour that has passed: ");
                System.out.print(minute * 100 / 60 + ". ");

        // Day, date, month, year variables
        String day = "Friday";
        int date = 26;
        String month = "August";
        int year = 2022;

        // Prints the date
        System.out.print("\nDate of the day is: " + day + " " + date + " " + month + " " + year + ".");

    }
}