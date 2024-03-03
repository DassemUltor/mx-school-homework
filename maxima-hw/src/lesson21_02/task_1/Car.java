package lesson21_02.task_1;

public final class Car extends MotorTransport {

    private String carBrand;
    private String carModel;

    public Car(CarBuilder builder) {
        super(builder);
        this.carBrand = builder.carBrand;
        this.carModel = builder.carModel;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    @Override
    public void service() {
        System.out.println("Обслужен автомобиль: " + carBrand + " " + carModel);
        super.service();
        startEngine();
    }

    private void startEngine() {
        System.out.println("Engine is starting");
    }

    static class CarBuilder extends MotorTransportBuilder {
        protected String carBrand;
        protected String carModel;


        public CarBuilder carBrand(String carBrand) {
            this.carBrand = carBrand;
            return this;
        }

        public CarBuilder carModel(String carModel) {
            this.carModel = carModel;
            return this;
        }

        @Override
        public CarBuilder maxSpeed(Integer maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        @Override
        public CarBuilder typeEngine(String typeEngine) {
            this.typeEngine = typeEngine;
            return this;
        }

        @Override
        public CarBuilder wheelCount(Integer wheelCount) {
            this.wheelCount = wheelCount;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
