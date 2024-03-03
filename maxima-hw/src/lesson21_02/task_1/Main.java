package lesson21_02.task_1;


import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {


        WheeledTransport bicycle = new Bicycle.BicycleBuilder()
                .wheelCount(2)
                .typeBicycle("Rock")
                .maxSpeed(45)
                .build();

        MotorTransport car = new Car.CarBuilder()
                .carBrand("Tesla").
                carModel("Model X")
                .typeEngine("Petrol")
                .maxSpeed(320)
                .wheelCount(4)
                .build();

        MotorTransport truck = new Truck.TruckBuilder()
                .typeEngine("Diesel")
                .maxSpeed(180)
                .wheelCount(10)
                .loadCapacity(27_000)
                .build();


        ServiceStation st = new ServiceStation();

        List<Transport> list = new ArrayList<>();
        list.add(bicycle);

        list.add(car);
        list.add(truck);


        for (Transport transport : list) {
            st.visitServiceStation(transport);
            System.out.println();
        }


    }


}
