package class_tasks.lesson13;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

public class DateUtils {
    /*
    * 1. Класс DateUtils, в нём создаём следующие статические методы
2. вывод текущей даты-времени в формате dd.MM.yyyy hh:mm:ss
3. то же, что в п.2, но с указанием таймзоны (метод принимает код зоны)
4. метод принимает LocalDateTime и возвращает LocalDateTime, который на 4 часа 30 минут позже
5. метод, который принимает дату и возвращает boolean: является ли год високосным
    *
    * */

    public static String showDateNow() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy hh:mm:ss"));
    }

    public static String showDateNowWithTimezone(ZoneId zoneId) {
        return LocalDateTime.now(zoneId).format(DateTimeFormatter.ofPattern("dd.MM.yyyy hh:mm:ss"));
    }

    public static LocalDateTime fourAndHalfPast(LocalDateTime localDateTime) {
        return localDateTime.plusHours(4).plusMinutes(30);
    }

    public static boolean leapYear(LocalDate date) {
//        return date.isLeapYear();
        if ((date.getYear() % 4 == 0 && date.getYear() % 100 != 0) || date.getYear() % 400 == 0) {
            return true;
        }
        return false;
    }
}
