import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * Java Learning Journey
 * Stage: Date and Time API
 * Author: Bernard Nana Kwarteng
 *
 * This project demonstrates:
 * - LocalDate
 * - LocalTime
 * - DateTimeFormatter
 * - Date comparisons
 * - Date calculations with ChronoUnit
 * - Conditional statements
 *
 * Learning Goal:
 * Learn how to store, format, compare, and calculate
 * dates and times using Java's modern Date and Time API.
 */
public class EventScheduler {

    public static void main(String[] args) {

        // Store event information
        String eventName = "CodeQuest 4.0";

        LocalDate eventDate =
                LocalDate.of(2027, 5, 13);

        LocalTime startingTime =
                LocalTime.of(9, 1);

        // Get the current date from the computer
        LocalDate currentDate =
                LocalDate.now();

        // Create date and time formatters
        DateTimeFormatter dateFormatter =
                DateTimeFormatter.ofPattern(
                        "dd MMMM yyyy"
                );

        DateTimeFormatter timeFormatter =
                DateTimeFormatter.ofPattern(
                        "hh:mm a"
                );

        // Format the dates and time
        String formattedCurrentDate =
                currentDate.format(dateFormatter);

        String formattedEventDate =
                eventDate.format(dateFormatter);

        String formattedStartingTime =
                startingTime.format(timeFormatter);

        // Calculate the number of days between the dates
        long daysBetween =
                ChronoUnit.DAYS.between(
                        currentDate,
                        eventDate
                );

        // Determine the event status
        String eventStatus;
        String daysInformation;

        if (eventDate.isAfter(currentDate)) {

            eventStatus = "The event is upcoming.";

            daysInformation =
                    "Days Remaining: " + daysBetween;

        } else if (eventDate.isEqual(currentDate)) {

            eventStatus = "The event is happening today.";

            daysInformation = "Days Remaining: 0";

        } else {

            eventStatus = "The event has already passed.";

            long daysSinceEvent =
                    ChronoUnit.DAYS.between(
                            eventDate,
                            currentDate
                    );

            daysInformation =
                    "Days Since Event: " + daysSinceEvent;
        }

        // Display event summary
        System.out.println("================================");
        System.out.println("CODEQUEST EVENT SCHEDULER");
        System.out.println("================================");
        System.out.println();

        System.out.println("Event: " + eventName);
        System.out.println(
                "Current Date: " + formattedCurrentDate
        );
        System.out.println(
                "Event Date: " + formattedEventDate
        );
        System.out.println(
                "Starting Time: " + formattedStartingTime
        );
        System.out.println(daysInformation);
        System.out.println("Status: " + eventStatus);

        System.out.println();
        System.out.println("================================");
    }
}