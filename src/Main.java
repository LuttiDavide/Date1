import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime odt = OffsetDateTime.parse("2002-03-01T13:00:00Z");

        DateTimeFormatter fullFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.ITALY);

        DateTimeFormatter mediumFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(Locale.ITALY);

        DateTimeFormatter shortFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(Locale.ITALY);

        System.out.println("FULL : " + odt.format(fullFormat));
        System.out.println("MEDIUM : " + odt.format(mediumFormat));
        System.out.println("SHORT : " + odt.format(shortFormat));
    }
}