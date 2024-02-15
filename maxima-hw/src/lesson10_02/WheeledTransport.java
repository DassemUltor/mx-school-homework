package lesson10_02;

public class WheeledTransport {
    private Integer wheelCount;
    private Integer maxSpeed;


    WheeledTransport(Integer wheelCount, Integer maxSpeed) {
        this.wheelCount = wheelCount;
        this.maxSpeed = maxSpeed;
    }

    public void service(WheeledTransport transport) {
        System.out.println("Обслужено колёс: " + transport.wheelCount);
        System.out.println("Максимальная скорость ТС: " + transport.maxSpeed + " км/ч");
    }

    public Integer getWheelCount() {
        return wheelCount;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setWheelCount(Integer wheelCount) {
        this.wheelCount = wheelCount;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
