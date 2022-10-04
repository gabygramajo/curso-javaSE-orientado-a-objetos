import model.Doctor;
import model.Patient;
import model.User;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Doctor myDoctor = new Doctor("Anahí Salgado", "anahidoc@email.com","Pediatría");
        //agendando citas
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");
        //mostrar citas disponibles
//        for (model.Doctor.AvailableAppointment appointment : myDoctor.getAvailableAppointments() ) {
//            System.out.println(appointment.showAppointment());
//        }

        Patient patient = new Patient("Alejandra", "alejandra@email.com");
        patient.setWeight(54.6);
//        System.out.println(patient.getWeight());
        patient.setHeight(1.65);
//        System.out.println(patient.getHeight());
        patient.setPhoneNumber("12344327");
//        System.out.println(patient.getPhoneNumber());
        System.out.println(myDoctor);

        User userDoc = new Doctor("Lautaro", "lt@email.com", "Oncologia");
        User userPat = new Patient("Rocardo", "Ricardo@email.com");

        userDoc.showDataUser();
        userPat.showDataUser();

        User userAnonymous = new User("Undefined","Undefined") {
            @Override
            public void showDataUser() {
                System.out.println("Soy una persona anónima 8)...");
            }
        };
        userAnonymous.showDataUser();
    }
}
