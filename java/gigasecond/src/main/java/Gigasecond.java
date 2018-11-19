import java.time.LocalDate;
import java.time.LocalDateTime;

import java.util.Calendar;

class Gigasecond {

    Gigasecond(LocalDate birthDate) {

        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    Gigasecond(LocalDateTime birthDateTime) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    LocalDateTime getDate() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.SECOND, 1000000000);
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

}
