package classes;

import enums.CarType;
import enums.SeatbeltStatus;
import interfaces.Rule;
import interfaces.implementations.PrivateSpeedRule;
import interfaces.implementations.SeatbeltRule;
import interfaces.implementations.TruckSpeedRule;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Radar {

    private String plateNumber;
    private Date date;
    private CarType carType;
    private float speed;
    private SeatbeltStatus seatbeltStatus;
    private List<Rule> rules;
    private List<Fine> fines;


    public Radar(String plateNumber,
                 CarType carType,
                 float speed,
                 SeatbeltStatus seatbeltStatus)
    {
        this.plateNumber = plateNumber;
        this.date = new Date();
        this.carType = carType;
        this.speed = speed;
        this.seatbeltStatus = seatbeltStatus;
        this.rules = new ArrayList<>();
        rules.add(new PrivateSpeedRule());
        rules.add(new SeatbeltRule());
        rules.add(new TruckSpeedRule());
        this.fines = new ArrayList<>();
    }

    public void checkViolations() {
        List<Violation> violations = new ArrayList<>();
        for(Rule rule : rules) {
            Violation violation = rule.check(this);
            if (violation != null) {
                violations.add(violation);
            }
        }
        if (!violations.isEmpty()) {
            Fine fine = new Fine( this.plateNumber , violations);
            fines.add(fine);
            System.out.println(fine);

        } else {
            System.out.println("no violations detected");
        }

    }


    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public SeatbeltStatus getSeatbeltStatus() {
        return seatbeltStatus;
    }

    public void setSeatbeltStatus(SeatbeltStatus seatbeltStatus) {
        this.seatbeltStatus = seatbeltStatus;
    }

    public List<Fine> getFines() {
        return fines;
    }

    public void setFines(List<Fine> fines) {
        this.fines = fines;
    }

    public List<Rule> getRules() {
        return rules;
    }

    public void setRules(List<Rule> rules) {
        this.rules = rules;
    }



    @Override
    public String toString() {
        return "Radar{" +
                "plateNumber='" + plateNumber + '\'' +
                ", date=" + date +
                ", carType=" + carType +
                ", speed=" + speed +
                ", seatbeltStatus=" + seatbeltStatus +
                ", rules=" + rules +
                ", fines=" + fines +
                '}';
    }
}
