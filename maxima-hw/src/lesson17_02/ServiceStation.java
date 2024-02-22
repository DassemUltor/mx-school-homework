package lesson17_02;

public class ServiceStation {
    public void visitServiceStation(Transport transport) {

        if (transport instanceof Bicycle) {
            Bicycle bicycle = (Bicycle) transport;
            bicycle.service();
        } else if (transport instanceof Car) {
            Car car = (Car) transport;
            car.service();
        } else if (transport instanceof Truck) {
            Truck truck = (Truck) transport;
            truck.service();

        }


    }
}
