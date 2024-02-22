package lesson17_02;

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
    public void service() {
        System.out.println("Обслужен велосипед");
        super.service();
        System.out.println("Обслужено оборудование велосипеда типа: " + typeBicycle);
        pedaling();
    }


    private void pedaling() {
        System.out.println("Bike is running");
    }

}

