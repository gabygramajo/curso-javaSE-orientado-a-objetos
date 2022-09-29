import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    static int id = 0; // Autoincrement
    private String name;
    private String email;
    private String speciality;

    Doctor() {

    }
    Doctor(String name, String speciality) {
        id++; // Se incrementa por cada intancia
        this.name = name;
        this.speciality = speciality;
    }

    public void showName() {
        System.out.println(name);
    }
    public void showId() {
        System.out.println("ID Doctor: " + id);
    }

    // arraylist para almacenar la citas
    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    // método para agendar citas
    public void  addAvailableAppointment(Date date, String time){
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

        public AvailableAppointment(Date date, String time) {
            this.date = date;
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

        public Date getDate() {
            return date;
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
    }
}
