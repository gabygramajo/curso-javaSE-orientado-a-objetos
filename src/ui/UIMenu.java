package ui;
import model.Patient;
import model.User;
import model.Doctor;

import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu {

    public static final String[] MONTHS = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

    public static User userLogged;
    public static Patient patientLogged;
    public static Doctor doctorLogged;

    public static void showMenu(){
        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opción deseada");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("Doctor");
                    authUser(1);
                    response = 0;
                    break;
                case 2:
                    System.out.println("Patient");
                    authUser(2);
                    response = 0;
                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        }while (response != 0);
    }

    public static void authUser(int userType) {
        // userType == 1 -> Doctor
        // userType == 2 -> Patient
        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Alejandro Martínez", "alejandro@mail.com", "Pediatría"));
        doctors.add(new Doctor("Karen Sosa", "kare@mail.com", "Pediatría"));
        doctors.add(new Doctor("Rocío Gómez", "rocio@mail.com", "Pediatría"));

        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Anahí Salgado", "anahi@mail.com"));
        patients.add(new Patient("Roberto Rodríguez", "roberto@mail.com"));
        patients.add(new Patient("Carlos Sánchez", "carlos@mail.com"));

        boolean emailCorrect = false;

        do {
            System.out.println("Insert your email: [a@a.com]");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();

            if (userType == 1) {
                for (Doctor doc :
                        doctors) {
                    if (doc.getEmail().equals(email)) {
                        emailCorrect = true;
                        // Obtener el usuario logeado
                        doctorLogged = doc;
                        // showDoctorMenu
                        System.out.println("Logged " + doc.getName());
                        UIDoctorMenu.showDoctorMenu();
                        break;
                    }
                    System.out.println("Incorrect!");
                }
            }

            if (userType == 2) {
                for (Patient patient :
                        patients) {
                    if (patient.getEmail().equals(email)) {
                        emailCorrect = true;
                        // Obtener el usuario logeado
                        patientLogged = patient;
                        UIPatientManu.showPatientMenu();
                        break;
                    }
                }
            }

        }while (!emailCorrect);
    }

    static void showPatientMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("::Book an appointment");
                    for (int i = 0; i < 3; i++) {
                        System.out.println((i+1) + ". " + MONTHS[i]);
                    }
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        }while (response != 0);
    }
}
