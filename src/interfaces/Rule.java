package interfaces;

import classes.Radar;
import classes.Violation;

public interface Rule {

    Violation check(Radar radar);
}
