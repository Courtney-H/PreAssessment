package movies;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 *
 * @author Courtney Henson
 */

public class Costing {
    LocalDate date = LocalDate.now();
    DayOfWeek day = date.getDayOfWeek();
    private int total;
    
    public Costing() {
        total = 0;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}


