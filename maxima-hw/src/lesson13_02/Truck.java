package lesson13_02;

public final class Truck extends MotorTransport {

    private Integer loadCapacity;

    public Truck(Integer wheelCount, Integer maxSpeed, String typeEngine, Integer loadCapacity) {
        super(wheelCount, maxSpeed, typeEngine);
        this.loadCapacity = loadCapacity;
    }

    public Integer getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(Integer loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void service(WheeledTransport transport) {
        System.out.println("Обслужен грузовик");
        super.service(transport);
        System.out.println("Обслужен трак с грузоподъемностью: " + loadCapacity + " кг");
    }

    public final void startCompressor() {
        System.out.println("Compressor is starting");
    }
}
