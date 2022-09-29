import java.util.Date;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        Doctor myDoctor = new Doctor("Anahí Salgado", "Pediatría");
        //agendando citas
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");
        //mostrar citas disponibles
//        for (Doctor.AvailableAppointment appointment : myDoctor.getAvailableAppointments() ) {
//            System.out.println(appointment.showAppointment());
//        }

        Patient patient = new Patient("Alejandra", "alejandra@email.com");
        patient.setWeight(54.6);
//        System.out.println(patient.getWeight());
        patient.setHeight(1.65);
//        System.out.println(patient.getHeight());
        patient.setPhoneNumber("12344327");
//        System.out.println(patient.getPhoneNumber());

    }
}
