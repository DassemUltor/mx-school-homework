package lesson10_02;

public class Bicycle extends WheeledTransport {

    private String typeBicycle;

    public Bicycle(Integer wheelCount, Integer maxSpeed, String typeBicycle) {
        super(wheelCount, maxSpeed);
        this.typeBicycle = typeBicycle;
    }

    public String getTypeBicycle() {
        return typeBicycle;
    }

    public void setTypeBicycle(String typeBicycle) {
        this.typeBicycle = typeBicycle;
    }

    @Override
    public void service(WheeledTransport transport) {
        System.out.println("Обслужен велосипед");
        super.service(transport);
        System.out.println("Обслужено оборудование велосипеда типа: " + typeBicycle);
        System.out.println();
    }

}
