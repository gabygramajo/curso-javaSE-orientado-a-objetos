package otherConcepts;

import model.Doctor;

import java.util.List;

//import java.util.Iterator;

public class ArrayList {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("Anahí Salgado", "anahidoc@email.com","Pediatría");
        Doctor doctor2 = new Doctor("Sergio Donado", "donado@email.com","Cirugía Pediátrica");
        Doctor doctor3 = new Doctor("Mariana Rojas", "mrojas@email.com","Neumología");
        Doctor doctor4 = new Doctor("Luiz Dominguez", "dominguezluiz@email.com","Dermatología");

        List<Doctor> listDoctors = new java.util.ArrayList<Doctor>();
        listDoctors.add(doctor1);
        listDoctors.add(doctor2);
        listDoctors.add(doctor3);
        listDoctors.add(doctor4);


        // Recorrer
        System.out.println("------- forEach -------");

        for (Doctor doctor: listDoctors) {
            System.out.println("Doctor: " + doctor.getName() +
                    " - Especialidad: " + doctor.getSpeciality() );
        }

        System.out.println("------- fori -------");

        for (int i = 0; i < listDoctors.size(); i++) {
            System.out.println("Doctor: " + listDoctors.get(i).getName() +
                    " - Especialidad: " + listDoctors.get(i).getSpeciality() );
        }
    }
}

//    Iterator <Integer> it = map.keySet().iterator();
//
//    while( it.hasNext() ){
//        Integer key = it.next();
//        System.out.println("Clave: " + key + " -> Valor: " + map.get(key));
//    }
