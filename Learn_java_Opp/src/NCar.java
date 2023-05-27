public class NCar {
    private String model;
    private Enginee engine; // Association

    public NCar(String model, Enginee engine) {
        this.model = model;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public Enginee getEngine() {
        return engine;
    }

    public static void main(String[] args) {
        // Create an engine
        Enginee engine = new Enginee("V8");

        // Create a car with the engine
        Car car = new Car("Ferrari", engine);

        // Access car and engine information
        System.out.println("Car Model: " + car.getModel());
        System.out.println("Engine Type: " + car.getEngine().getType());
    }
}
