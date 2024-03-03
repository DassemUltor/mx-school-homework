package lesson21_02.task_1;

public abstract class MotorTransport extends WheeledTransport {

    private String typeEngine;


    public MotorTransport(MotorTransportBuilder builder) {
        super(builder);
        this.typeEngine = builder.typeEngine;
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

    public static class MotorTransportBuilder extends WheeledBuilder {

        protected String typeEngine;

        public MotorTransportBuilder typeEngine(String typeEngine) {
            this.typeEngine = typeEngine;
            return this;
        }


        @Override
        public MotorTransportBuilder wheelCount(Integer wheelCount) {
            this.wheelCount = wheelCount;
            return this;
        }

        @Override
        public MotorTransportBuilder maxSpeed(Integer maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }


    }


}
