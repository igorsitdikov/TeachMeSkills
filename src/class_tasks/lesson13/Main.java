package class_tasks.lesson13;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(DateUtils.showDateNow());
        System.out.println(DateUtils.showDateNowWithTimezone(ZoneId.of("Z")));
        System.out.println(DateUtils.showDateNowWithTimezone(ZoneId.of("UTC-3")));
        System.out.println(DateUtils.fourAndHalfPast(LocalDateTime.now()));
        System.out.println(DateUtils.leapYear(LocalDate.now()));
        System.out.println(DateUtils.leapYear(LocalDate.of(2000, 10, 1)));
        System.out.println(DateUtils.leapYear(LocalDate.of(2100, 10, 1)));

        /*1. Создаём функциональный интерфейс, метод которого принимает LocalDate и возвращает число
2. Пишем метод, который принимает лямбду (интерфейс из п.1) и LocalDate, и возвращает число, возвращаемое функциональным интерфейсом
3. Пишем метод, в котором вызываем метод из п.2 три раза: с лямбдой дата -> номер месяца; дата -> кол-во дней в этом месяце; дата -> кол-во дней в году после данного дня, не включая
4. Пишем метод, который принимает произвольное число дат и возвращает список (List) дат, отсортированных по номеру месяца (по убыванию). в процессе использовать Comparator в виде лямбды*/

        tripleNumber(LocalDate.of(2020, 12, 30));

        List<LocalDate> list = sortDates(
                LocalDate.of(2021, 2, 3),
                LocalDate.of(1328, 9, 7),
                LocalDate.of(1945, 5, 13),
                LocalDate.of(1918, 7, 11),
                LocalDate.of(2140, 1, 4),
                LocalDate.of(1418, 8, 10),
                LocalDate.of(1999, 11, 5),
                LocalDate.of(1917, 6, 12),
                LocalDate.of(2005, 3, 15),
                LocalDate.of(1231, 10, 6),
                LocalDate.of(1935, 4, 14),
                LocalDate.of(2100, 12, 8),
                LocalDate.of(1983, 2, 9));
        list.forEach(el -> System.out.println(el));

    }

    static Integer number(LocalDate localDate, Smth<LocalDate> predicate) {
        return predicate.number(localDate);
    }

    static void tripleNumber(LocalDate localDate) {
        System.out.println(number(localDate, n -> n.getMonth().getValue()));
        System.out.println(number(localDate, n -> n.getMonth().maxLength()));
        System.out.println(number(localDate, n -> n.lengthOfYear() - n.getDayOfYear()));
    }

    static List<LocalDate> sortDates(LocalDate... dates) {
        List<LocalDate> sorted = new ArrayList<>();
        Collections.addAll(sorted, dates);
        sorted.sort((o1, o2) -> o2.getMonth().getValue() - o1.getMonth().getValue());
        return sorted;
    }
}
