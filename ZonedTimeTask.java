import java.time.*;

public class ZonedTimeTask {
    public static void main(String[] args) {
        ZonedDateTime india = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime usa = ZonedDateTime.now(ZoneId.of("America/New_York"));

        System.out.println(india);
        System.out.println(usa);
    }
}
