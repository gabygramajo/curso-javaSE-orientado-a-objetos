package model;
import java.util.Date;

public class AppointmentNorse implements ISchedulable {
    private int id;
    private Patient patient;
    private Nurse nurse;
    private Date date;
    private String time;

    @Override
    public void schedule(Date date, String time) {

    }
}
