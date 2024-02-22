package lesson17_02;

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
    public void service() {
        System.out.println("Обслужен грузовик");
        super.service();
        System.out.println("Обслужен трак с грузоподъемностью: " + loadCapacity + " кг");
        startCompressor();
    }

    private void startCompressor() {
        System.out.println("Compressor is starting");
    }
}
