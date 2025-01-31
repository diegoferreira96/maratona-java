import javax.swing.text.ZoneView;
import java.sql.SQLOutput;
import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        // ZoneId, ZoneDateTime e ZoneOffset
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());
        ZoneId tokioZone = ZoneId.of("Asia/Tokyo");
        System.out.println(tokioZone);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        ZonedDateTime zonedDateTime = now.atZone(tokioZone);
        System.out.println(zonedDateTime);

        Instant nowInstant = Instant.now();
        System.out.println(nowInstant);

        ZonedDateTime zonedDateTime1 = nowInstant.atZone(tokioZone);
        System.out.println(zonedDateTime1);

        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);

        ZoneOffset offsetManaus = ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTime = now.atOffset(offsetManaus);
        System.out.println(offsetDateTime);

        OffsetDateTime offsetDateTime1 = OffsetDateTime.of(now, offsetManaus);
        System.out.println(offsetDateTime1);

        OffsetDateTime offsetDateTime2 = now.atOffset(offsetManaus);
        System.out.println(offsetDateTime2);

        JapaneseDate japoneseDate = JapaneseDate.from(LocalDate.now());
        System.out.println(japoneseDate);

        LocalDate meijiEralocalDate = LocalDate.of(1900, 2, 1);
        JapaneseDate mejiraEra = JapaneseDate.from(meijiEralocalDate);
        System.out.println(mejiraEra);
    }
}
