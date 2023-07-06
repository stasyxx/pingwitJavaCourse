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
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
//+
  public class WorldTimeAnother {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите время в формате HH:mm: ");
            String timeInput = scanner.next();
            System.out.print("Введите тайм-зону (например, Europe/Warsaw): ");
            String timeZoneInput = scanner.next();


            LocalTime time = LocalTime.parse(timeInput);


            ZoneId userTimeZone = ZoneId.of(timeZoneInput);
            ZonedDateTime cityTime = LocalDateTime.of(LocalDate.now(), time).atZone(userTimeZone);


            System.out.println("Мировое время:");
            System.out.println("Анкара: " + cityTime.withZoneSameInstant(ZoneId.of("Europe/Istanbul")));
            System.out.println("Лондон: " + cityTime.withZoneSameInstant(ZoneId.of("Europe/London")));


            scanner.close();
        }
    }
