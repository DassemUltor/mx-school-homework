package lesson10_02;

public class Main {

    public static void main(String[] args) {


        WheeledTransport bicycle = new Bicycle(2, 60, "mountain");
        MotorTransport car = new Car(4, 240, "petrol", "Audi", "A6");
        MotorTransport truck = new Truck(10, 180, "diesel", 28000);


        visitServiceStation(bicycle);
        visitServiceStation(car);
        visitServiceStation(truck);
    }

    public static void visitServiceStation(WheeledTransport transport) {
        transport.service(transport);
    }
}
