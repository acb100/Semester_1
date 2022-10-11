public class Car {
    private String brand;
    private String make;
    private boolean honk;

    private boolean isRunning = false;
    private boolean hasDriver = false;

    public Car(String brand, String make, boolean honk) {
        setBrand(brand);
        setMake(make);
        setHonk(honk);
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getMake() {
        return make;
    }

    public void setHonk(boolean honk) {
        this.honk = honk;
    }

    public boolean getHonk() {
        return honk;
    }

    public void sound() {
        System.out.println("Honk honk");
    }

    public void drive() {
        System.out.println("You're now driving 150 km/t.");
    }

    public void park() {
        System.out.println("Your car is now parked.");
    }
}
