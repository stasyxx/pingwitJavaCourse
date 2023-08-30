package lesson_24.homework.task_1;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/*
Task 1
Есть каталог отелей, необходимо найти отель с максимальным рейтингом
 */
public class HotelCatalogue {
    public static void main(String[] args) {
        List<Hotel> hotels = List.of(
                new Hotel("Star", 3),
                new Hotel("Moon", 5),
                new Hotel("Shine", 1)
        );

        Optional<Hotel> result = hotels.stream()
                .max(Comparator.comparing(Hotel::rate));
        System.out.println(result);//Optional - просто обертка. Лучше значение печатай. Использую, например, ifPresent

    }
}
