
import classes.Radar;
import enums.CarType;
import enums.SeatbeltStatus;


public class Main {
    public static void main(String[] args) {

        Radar radar = new Radar("ABC123" , CarType.PRIVATE , 82 , SeatbeltStatus.NOTFASTENED);

        radar.checkViolations();



    }
}