package Day04_practice.Sycnhronzation;

import java.time.LocalDate;

public class AppointmentCenter {
    private LocalDate day=LocalDate.now();

    public synchronized LocalDate getAppointmentDate(){
        synchronized (this) {
            day = day.plusDays(1);
        }
                return day;

    }

}
