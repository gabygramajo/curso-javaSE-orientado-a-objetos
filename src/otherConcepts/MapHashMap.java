package otherConcepts;
import java.util.HashMap;

public class MapHashMap {
    // HashMap almacena elementos en pares " clave / valor ", y puede acceder a ellos mediante un índice de otro tipo.
    //Un objeto se utiliza como clave (índice) para otro objeto (valor). Puede almacenar diferentes tipos: String claves y Integer valores, o del mismo tipo, como: String claves y String valores:
    public static void main(String[] args) {

        HashMap<String, String> capitalCities = new HashMap<>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany","Berlin");
        capitalCities.put("Norway","Oslo");
        capitalCities.put("USA","Washinton DC");

        System.out.println( capitalCities );
        //-> {USA=Washinton DC, Norway=Oslo, England=London, Germany=Berlin}

        // Access an Item. use the get() method and refer to its key
        System.out.println( capitalCities.get("Germany") );

        // remove an Item
        capitalCities.remove("England");
        System.out.println( capitalCities );

        // Loop Through a HashMap
        // -> keySet() method if you only want the keys
        for ( String country: capitalCities.keySet() ) {
            System.out.println("Country: " + country);
        }
        // -> values() method if you only want the values
        for ( String city: capitalCities.values() ) {
            System.out.println("City: " + city);
        }
        // Print keys and values
        for ( String country : capitalCities.keySet() ) {
            System.out.println( country + ": " + capitalCities.get(country) );
        }


    }
}
