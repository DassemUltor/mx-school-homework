package lesson13_02;

public class MotorTransport extends WheeledTransport {

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
    public void service(WheeledTransport transport) {
        super.service(transport);
        System.out.println("Обслужен двигатель типа: " + typeEngine);
    }


}
