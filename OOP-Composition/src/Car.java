public class Car extends Vehicle {
    private int doors;
    private int enginCapacity;

    public Car(String name, int doors, int enginCapacity) {
        super(name);
        this.doors = doors;
        this.enginCapacity = enginCapacity;
    }

}
