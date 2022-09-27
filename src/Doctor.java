public class Doctor {
    static int id = 0; // Autoincrement
    String name;
    String speciality;

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
}
