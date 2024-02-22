package lesson17_02;

public abstract class WheeledTransport implements Transport {
    private Integer wheelCount;
    private Integer maxSpeed;


    public WheeledTransport(Integer wheelCount, Integer maxSpeed) {
        this.wheelCount = wheelCount;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void service() {
        System.out.println("Обслужено колёс: " + wheelCount);
        System.out.println("Максимальная скорость ТС: " + maxSpeed + " км/ч");
    }


    public Integer getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(Integer wheelCount) {
        this.wheelCount = wheelCount;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
