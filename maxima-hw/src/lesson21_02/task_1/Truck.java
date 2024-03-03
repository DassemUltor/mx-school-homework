package lesson21_02.task_1;

public final class Truck extends MotorTransport {

    private Integer loadCapacity;

    public Truck(TruckBuilder builder) {
        super(builder);
        this.loadCapacity = builder.loadCapacity;
    }

    public Integer getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(Integer loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void service() {
        System.out.println("Обслужен грузовик");
        super.service();
        System.out.println("Обслужен трак с грузоподъемностью: " + loadCapacity + " кг");
        startCompressor();
    }

    private void startCompressor() {
        System.out.println("Compressor is starting");
    }

    public static class TruckBuilder extends MotorTransportBuilder {

        protected Integer loadCapacity;

        @Override
        public TruckBuilder typeEngine(String typeEngine) {
            this.typeEngine = typeEngine;
            return this;
        }

        @Override
        public TruckBuilder wheelCount(Integer wheelCount) {
            this.wheelCount = wheelCount;
            return this;
        }

        @Override
        public TruckBuilder maxSpeed(Integer maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public TruckBuilder loadCapacity(Integer loadCapacity) {
            this.loadCapacity = loadCapacity;
            return this;
        }

        public Truck build() {
            return new Truck(this);
        }
    }
}
