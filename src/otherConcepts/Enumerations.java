package otherConcepts;

public enum Enumerations {
    MONDAY("Lunes", 1),
    TUESDAY("Martes", 2),
    WEDNESDAY("Miercoles", 3),
    THURSDAY("Jueves", 4),
    FRIDAY("Viernes", 5),
    SATURDAY("Sabado", 6),
    SUNDAY("Domingo", 7);

    private final String day; // Debe ser constante para que no pueda ser modificada de otra clase.
    private  final int indexOfTheDay;

    private Enumerations(String dayInSpanish, int index) { // Constructor
        day = dayInSpanish;
        indexOfTheDay = index;
    }
    String getDayInSpanish(){
        return day;
    }
    int getIndexOfTheDay() {
        return indexOfTheDay;
    }
}
