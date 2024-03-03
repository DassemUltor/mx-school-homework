package lesson21_02.task_1;

public class Bicycle extends WheeledTransport {

    private String typeBicycle;

    public Bicycle(BicycleBuilder builder) {
        super(builder);
        this.typeBicycle = builder.typeBicycle;
    }

    public String getTypeBicycle() {
        return typeBicycle;
    }

    public void setTypeBicycle(String typeBicycle) {
        this.typeBicycle = typeBicycle;
    }

    @Override
    public void service() {
        System.out.println("Обслужен велосипед");
        super.service();
        System.out.println("Обслужено оборудование велосипеда типа: " + typeBicycle);
        pedaling();
    }

    private void pedaling() {
        System.out.println("Bike is running");
    }

    public static class BicycleBuilder extends WheeledBuilder {
        protected String typeBicycle;

        public BicycleBuilder typeBicycle(String typeBicycle) {
            this.typeBicycle = typeBicycle;
            return this;
        }

        @Override
        public BicycleBuilder wheelCount(Integer wheelCount) {
            this.wheelCount = wheelCount;
            return this;
        }

        public BicycleBuilder maxSpeed(Integer maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public Bicycle build() {
            return new Bicycle(this);
        }

    }

}

