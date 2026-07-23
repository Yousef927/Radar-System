package interfaces.implementations;

import classes.Radar;
import classes.Violation;
import enums.SeatbeltStatus;
import interfaces.Rule;

public class SeatbeltRule implements Rule {

    public Violation check(Radar radar) {
        if(radar.getSeatbeltStatus().equals(SeatbeltStatus.NOTFASTENED)) {
            return new Violation("Seatbelt not fastened" , 100);
        }
        return null;
    }
}
