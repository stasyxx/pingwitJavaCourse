package lesson_14.homework.task_2;
/*
Мировые часы.
Пользователь вводит время с указанием тайм зоны, а программа выдает ему сколько сейчас времени в других городах.
Например, 15.00 Europe/Warsaw:
- Анкара 17.00
- Лондон 14.00
и т.д. Города выберите сами.
 */
import java.time.*;
import java.util.Scanner;
import java.util.Set;
import java.util.TimeZone;
//посмотри у Лизы, много закоментрованного кода
public class WorldTime {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalTime time = LocalTime.now();
        Set<String> availableZones = ZoneId.getAvailableZoneIds();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your local time, please (hours): ");
        int hours = scanner.nextInt();
        System.out.print("Enter your local time, please (minutes): ");
        int minutes = scanner.nextInt();
        System.out.print("Enter your time zone, please (example: Europe/Warsaw): ");
        String LocalTimeZone = scanner.next();

        /*
        ZoneId userTimeZone = ZoneId.of(LocalTimeZone);
        ZonedDateTime userZonedDateTime = ZonedDateTime.of();
        */

        System.out.println("Local time is " + hours + ":" + minutes + ", " + LocalTimeZone);

    }

  /* public static LocalTime getLocalTime() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your local time, please (hours): ");
        int hours = scanner.nextInt();
        System.out.print("Enter your local time, please (minutes): ");
        int minutes = scanner.nextInt();
        LocalTime userTime = LocalTime.of(hours, minutes);
        return userTime;
    }; */
}
