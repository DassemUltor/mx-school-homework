package lesson13_02;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        WheeledTransport bicycle = null;
        MotorTransport car = null;
        MotorTransport truck = null;


        Scanner console = new Scanner(System.in);
        System.out.println("Выберите тип нового ТС для добаления: \n" +
                "1. Велосипед \n" +
                "2. Легковой автомобиль \n" +
                "3. Грузовой автомобиль");

        int command = console.nextInt();


        switch (command) {
            case 1:
                bicycle = new Bicycle(2, 60, "mountain");
                visitServiceStation(bicycle);
                break;
            case 2:
                car = new Car(4, 240, "petrol", "Audi", "A6");
                visitServiceStation(car);
                break;
            case 3:
                truck = new Truck(10, 180, "diesel", 28000);
                visitServiceStation(truck);
                break;
            default:
                System.out.println("Неверный ввод");
                break;
        }


    }

    public static void visitServiceStation(WheeledTransport transport) {

        transport.service(transport);

        if (transport instanceof Bicycle) {
            Bicycle bicycle = (Bicycle) transport;
            bicycle.pedaling();
        } else if (transport instanceof Car) {
            Car car = (Car) transport;
            car.startEngine();
        } else if (transport instanceof Truck) {
            Truck truck = (Truck) transport;
            truck.startCompressor();
        }


    }
}
