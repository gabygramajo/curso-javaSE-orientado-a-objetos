package otherConcepts;

import java.util.HashSet;
// Un HashSet es una colección de elementos donde cada elemento es único y se encuentra en el paquete java.util

public class CollectionSet {
    public static void main(String[] args) {

        HashSet<String> cars = new HashSet<>();

        // Agregar objetos con add()
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW"); // duplicado
        cars.add("Mazda");
        System.out.println( cars );
        //out-> [Volvo, Mazda, Ford, BMW]

        // chequear su existe un valor con .contains()
        System.out.println( cars.contains("Mazda") );
        //out-> true
        System.out.println( cars.contains("Fiat") );
        //out-> false

        // remover un valor con .remove()
        cars.remove("Volvo");
        System.out.println( cars );
        //out-> [Mazda, Ford, BMW]
        // remove all: cars.clear();


        // Tamaño:
        System.out.println( cars.size() );
        //out-> 3

        // Recorrer un HashSet con ForEach
        for (String car : cars ) {
            System.out.println( car );
        }
        /*out->
            Mazda
            Ford
            BMW
         */
    }
}
