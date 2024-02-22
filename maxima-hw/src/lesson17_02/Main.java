package lesson17_02;


import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        Transport bicycle = new Bicycle(2, 45, "Rock");
        Transport bicycle2 = new Bicycle(2, 70, "Highway");

        Transport car1 = new Car(4, 180, "Petrol", "Toyota", "Corolla");
        Transport car2 = new Car(4, 240, "Diesel", "Audi", "A6");

        Transport truck1 = new Truck(10, 180, "Diesel", 27_000);
        Transport truck2 = new Truck(10, 160, "Diesel", 40_000);

        ServiceStation st = new ServiceStation();

        List<Transport> list = new ArrayList<>();
        list.add(bicycle);
        list.add(bicycle2);
        list.add(car1);
        list.add(car2);
        list.add(truck1);
        list.add(truck2);

        for (Transport transport : list) {
            st.visitServiceStation(transport);
            System.out.println();
        }


    }


}
