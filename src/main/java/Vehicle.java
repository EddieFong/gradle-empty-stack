
class Vehicle{
    String name;
    String brand;

    public Vehicle(String name, String brand){
        this.name = name;
        this.brand = brand;
    }

    public void speedUp(int speed){
        System.out.print("Name: " + this.name + ", Brand: " + this.brand);
        System.out.println(" - Speed up to " + speed);
    }
}

class Car extends Vehicle{

    public Car(String name, String brand) {
        super(name, brand);
    }

    @Override
    public void speedUp(int speed) {
        if (speed > 200){
            System.out.println(this.name + ": Fail to speed up");
        } else {
            super.speedUp(speed);
        }
    }


}