package Day06;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
public class QQ9_ZoneDateTime {
    public static void main(String[] args) {
      // Baska ülke veya bolgelerin saat dilimine gore zamani alma
        // New york un saat dilimine gore saat ?
        // zoneId Link :https://docs.oracle.com/javase/8/docs/api/java/time/ZoneId.html

        ZonedDateTime zdt=ZonedDateTime.now(ZoneId.of("America/New_York"));
        //String ifade onemli, hatasiz yazilmasi gerek.. yoksa Unknown time-zone ID hatasi verir
        System.out.println("zdt = " + zdt);
        ZonedDateTime zdtLocal=ZonedDateTime.now();////yerelde bulundugunuz yerin zamanini verir

        DateTimeFormatter format=DateTimeFormatter.ofPattern("dd.MM.yyy  HH:mm");

        System.out.println("zdt :"+zdt.format(format));//zdt :05.04.2022  08:32
        System.out.println("zdtLocal :"+zdtLocal.format(format));//zdtLocal :05.04.2022  15:32
    }
}
