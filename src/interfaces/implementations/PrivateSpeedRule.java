package interfaces.implementations;

import classes.Radar;
import classes.Violation;
import enums.CarType;
import interfaces.Rule;

public class PrivateSpeedRule implements Rule {

    public Violation check(Radar radar) {
        if(radar.getCarType() == CarType.PRIVATE) {
            if (radar.getSpeed() > 80) {
                return new Violation("speed of " + radar.getSpeed() + " exceeded max allowed 80" ,   250);
            }
        }
        return null;
    }

}
