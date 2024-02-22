package lesson17_02;

public abstract class MotorTransport extends WheeledTransport {

    private String typeEngine;

    public MotorTransport(Integer wheelCount, Integer maxSpeed, String typeEngine) {
        super(wheelCount, maxSpeed);
        this.typeEngine = typeEngine;
    }

    public String getTypeEngine() {
        return typeEngine;
    }

    public void setTypeEngine(String typeEngine) {
        this.typeEngine = typeEngine;
    }

    @Override
    public void service() {
        super.service();
        checkEngine();
    }

    private void checkEngine() {
        System.out.println("Обслужен двигатель типа: " + typeEngine);
    }


}
