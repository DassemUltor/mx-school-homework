package lesson21_02.task_1;

public abstract class WheeledTransport implements Transport {
    private Integer wheelCount;
    private Integer maxSpeed;


    public WheeledTransport(WheeledBuilder builder) {
        this.wheelCount = builder.wheelCount;
        this.maxSpeed = builder.maxSpeed;
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

    public static class WheeledBuilder {
        protected Integer wheelCount;
        protected Integer maxSpeed;


        public WheeledBuilder wheelCount(Integer wheelCount) {
            this.wheelCount = wheelCount;
            return this;
        }

        public WheeledBuilder maxSpeed(Integer maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }


    }
}
