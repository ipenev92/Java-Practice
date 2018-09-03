class Car {
    private String name;
    private int cylinders;
    private int doors;
    private int wheels;
    private String engine;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.doors = 5;
        this.wheels = 5;
        this.engine = "car engine";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return name + "'s Engine started";
    }

    public String accelerate(int speed) {
        return name + "'s Current speed: " + speed;
    }

    public String brake() {
        return getClass().getName()+  "'s Stopped";
    }
}

class Mitsubishi extends Car {
    public Mitsubishi() {
        super("Outlander", 5);
    }

    @Override
    public String startEngine() {
        return super.startEngine();
    }

    @Override
    public String accelerate(int speed) {
        return super.accelerate(speed);
    }

    @Override
    public String brake() {
        return super.brake();
    }
}

class Ferrari extends Car {
    public Ferrari() {
        super("Enzo", 4);
    }

    @Override
    public String startEngine() {
        return super.startEngine();
    }

    @Override
    public String accelerate(int speed) {
        return super.accelerate(speed);
    }

    @Override
    public String brake() {
        return super.brake();
    }
}

class Toyota extends Car {
    private boolean hasPintura;

    public Toyota() {
        super("Yaris", 8);
    }

    @Override
    public String startEngine() {
        return super.startEngine();
    }

    @Override
    public String accelerate(int speed) {
        return super.accelerate(speed);
    }

    @Override
    public String brake() {
        return super.brake();
    }
}


public class Main {
    public static void main(String[] args) {
        for (int i=1; i<11; i++) {
            Car car = randomCar();
            System.out.println("Car #" + i + " " + car.getName() + " and it has " + car.getCylinders() + "cylinders" + "\n" +
                    car.startEngine() + "\n" +
                    car.brake());
            System.out.println(" ");
        }
    }

    public static Car randomCar() {
        int randomNumber = (int) (Math.random() * 3) + 1;
        System.out.println(randomNumber);

        switch (randomNumber) {
            case 1:
                return new Mitsubishi();
            case 2:
                return new Ferrari();
            case 3:
                return new Toyota();
            default:
                return null;
        }
    }
}
