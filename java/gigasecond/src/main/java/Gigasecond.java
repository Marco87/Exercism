import java.time.LocalDate;
import java.time.LocalDateTime;

import java.util.Calendar;

class Gigasecond {

    private LocalDateTime birthDateTime;

    Gigasecond(LocalDate birthDate) {
        this.birthDateTime = birthDate.atTime(0, 0, 0);
    }

    Gigasecond(LocalDateTime birthDateTime) {
        this.birthDateTime = birthDateTime;
    }

    LocalDateTime getDate() {
        return birthDateTime.plusSeconds(1000000000);
    }
}
