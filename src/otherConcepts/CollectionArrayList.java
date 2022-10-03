package otherConcepts;

import model.Doctor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
//La clase ArrayList es una matriz de tamaño variable , que se puede encontrar en el java.utilpaquete.

public class CollectionArrayList {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("Sergio Donado", "donado@email.com","Cirugía Pediátrica");
        Doctor doctor2 = new Doctor("Anahí Salgado", "anahidoc@email.com","Pediatría");
        Doctor doctor3 = new Doctor("Mariana Rojas", "mrojas@email.com","Neumología");
        Doctor doctor4 = new Doctor("Luiz Dominguez", "dominguezluiz@email.com","Dermatología");

        ArrayList<Doctor> listDoctors = new java.util.ArrayList<>();

        // add objects
        listDoctors.add(doctor1);
        listDoctors.add(doctor2);
        listDoctors.add(doctor3);
        listDoctors.add(doctor4);

        System.out.println( listDoctors.size() );
        //out-> 4

        //Access an Item
        System.out.println( listDoctors.get(2).getName() );
        //out-> Mariana Rojas

        //Change an Item
        Doctor doctor5 = new Doctor("Lucas Montoya", "lmontoya@email.com", "Neumología");
        listDoctors.set(2, doctor5);
        System.out.println( listDoctors.get(2).getName() );
        //-> Lucas Montoya

        //Remove an Item
        listDoctors.remove(2);
        System.out.println( listDoctors.size() );
        //-> 3
        // remove all: listDoctors.clear();

        // Recorrer
        System.out.println("------- forEach -------");

        for (Doctor doctor: listDoctors) {
            System.out.println("Doctor: " + doctor.getName() +
                    " - Especialidad: " + doctor.getSpeciality() );
        }

        // sort
        Collections.sort(listDoctors, new Comparator<Doctor>() {
            @Override
            public int compare(Doctor doc1, Doctor doc2) {

                return doc1.getName().compareTo(doc2.getName());
            }
        });

        System.out.println("Ordenado: ");
        System.out.println("------- fori -------");

        for (int i = 0; i < listDoctors.size(); i++) {
            System.out.println("Doctor: " + listDoctors.get(i).getName() +
                    " - Especialidad: " + listDoctors.get(i).getSpeciality() );
        }
    }
}
