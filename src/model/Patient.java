package model;

import java.util.ArrayList;
import java.util.Date;


public class Patient extends User {
    private String birthday;
    private String blood;
    private double weight;
    private double height;

    public ArrayList<AppointmentDoctor> getAppointmentDoctors() {
        return appointmentDoctors;
    }

    public void addAppointmentDoctors(Doctor doctor, Date date, String time) {
        AppointmentDoctor appointmentDoctor = new AppointmentDoctor(this, doctor);
        appointmentDoctor.schedule(date, time);
        appointmentDoctors.add(appointmentDoctor);
    }

    // Tipos de citas agendadas del paciente
    private ArrayList<AppointmentDoctor> appointmentDoctors = new ArrayList<>();

    public Patient(String name, String email) {
        super(name, email);
    }

    @Override
    public String toString() {

        return "model.Patient{" +
                "birthday='" + birthday + '\'' +
                ", blood='" + blood + '\'' +
                ", weight=" + getWeight() +
                ", height=" + getHeight() +
                super.toString() +
                '}';
    }

    @Override
    public void showDataUser() {
        System.out.println("Paciente");
        System.out.println("Historial completo desde nacimiento");
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public String getWeight() {
        return this.weight + " Kg.";
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return this.height + " Mts.";
    }

    public void setHeight(double height) {
        this.height = height;
    }
}

