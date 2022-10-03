package otherConcepts;
import java.util.LinkedHashMap;

public class mapLinkedHashMap {
    public static void main(String[] args) {

        LinkedHashMap<String, String> BestSellingCars = new LinkedHashMap<>();

        BestSellingCars.put("Fiat", "Cronos");
        BestSellingCars.put("Peugeot", "208");
        BestSellingCars.put("Toyota", "Hilux");
        BestSellingCars.put("Volkswagen", "Amarok");
        BestSellingCars.put("Chevrolet", "Cruze");
        BestSellingCars.put("Toyota", "Etios");

        System.out.println(BestSellingCars);
        //-> {Fiat=Cronos, Peugeot=208, Toyota=Etios, Volkswagen=Amarok, Chevrolet=Cruze}

        System.out.println( BestSellingCars.keySet() );
        //-> [Fiat, Peugeot, Toyota, Volkswagen, Chevrolet]

        System.out.println(BestSellingCars.values());
        //-> [Cronos, 208, Etios, Amarok, Cruze]

    }
}
