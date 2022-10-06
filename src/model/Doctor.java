package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {

    private String speciality;
    // arraylist para almacenar la citas
    private ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    public Doctor(String name, String email, String speciality) {
        super(name, email);
        this.speciality = speciality;
    }

    // método para agendar citas
    public void  addAvailableAppointment(String date, String time){
        availableAppointments.add(new AvailableAppointment(date, time));
        // Agregamos con .add() la cita en el arrayList
    }
    // método para devolver el array de citas
    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }

    // Clases Estatica anidada para citas disponibles
    public static class AvailableAppointment {
        private  int id;
        private Date date;
        private String time;
        SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");

        public AvailableAppointment(String date, String time) {
            try {
                this.date = format.parse(date);
            } catch (ParseException e) {

            }
            this.time = time;
        }

        public String showAppointment() {
            return "Date: " + date + " - Time: " + time;
        }
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate( String DATE ) {
            return date;
        }
        public String getDate(  ) { // method format "dd/mm/yyyy"
            return format.format(date);
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "\nDate = " + date +
                    ", Time = '" + time;
        }
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "model.Doctor{" +
                super.toString() +
                "speciality='" + speciality +
                ", available Appointments" + availableAppointments +
                '}';
    }

    @Override
    public void showDataUser() {
        System.out.println("Empleado del Hospital: Cruz Roja");
        System.out.println("Departamento: Oncología");
    }
}
