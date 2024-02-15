package lesson10_02;

public class Car extends MotorTransport {

    private String carBrand;
    private String carModel;

    public Car(Integer wheelCount, Integer maxSpeed, String typeEngine, String carBrand, String carModel) {
        super(wheelCount, maxSpeed, typeEngine);
        this.carBrand = carBrand;
        this.carModel = carModel;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }


    @Override
    public void service(WheeledTransport transport) {
        System.out.println("Обслужен автомобиль: " + carBrand + " " + carModel);
        super.service(transport);
        System.out.println();
    }
}
