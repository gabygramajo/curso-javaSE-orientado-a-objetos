package otherConcepts;
import java.util.ArrayList;
import  java.util.Iterator;
import java.lang.Integer;

public class UseIterator {
    // Un Iterator es un objeto que se puede usar para recorrer colecciones, como ArrayList y HashSet . Se llama "iterador" porque "iterar" es el término técnico para bucle.
    // El método iterator() se puede utilizar para obtener un Iterator para cualquier colección
    public static void main(String[] args) {

        // Make a collection
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // Get the iterator
        Iterator<String> it = cars.iterator();

        System.out.println(it);
        // -> java.util.ArrayList$Itr@75b84c92

        // Print items
        System.out.println( it.next() ); //-> Volvo
        System.out.println( it.next() ); //-> BMW
        System.out.println( it.next() ); //-> Ford
        System.out.println( it.next() ); //-> Mazda
        //System.out.println( it.next() ); //-> Error NoSuchElementException

        //To loop through a collection:
        // hashNext() : devuelve un valor boolean indicando si el iterador tiene un siguiente elemento. Devuelve true si la iteración tiene más elemento.
        // next() : devuelve el siguiente elemento del iteradr.

        it = cars.iterator(); // Reasignado para poder empezar del inicio
        while ( it.hasNext() ) {
            System.out.println("Car: " + it.next() );
        }

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(8);
        numbers.add(4);
        numbers.add(3);
        numbers.add(9);
        numbers.add(1);
        numbers.add(2);
        numbers.add(6);

        // remover usando foreach
//        for (int i = 0; i < numbers.size() ; i++) {
//            if ( numbers.get(i) % 2 == 0 ) {
//                numbers.remove(i);
//            }
//        }
//        System.out.println(numbers);
        // -> [4, 3, 9, 1,  6] ineficiente

        // remover usando un iterador
        Iterator<Integer> it2 = numbers.iterator();

        while ( it2.hasNext() ) {
            Integer num = it2.next();
            if ( num % 2 == 0 ) {
                it2.remove();
            }
        }
        System.out.println( numbers );
        //-> [3, 9, 1] eficiente.
    }
}
