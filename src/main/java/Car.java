import java.util.Objects;

public class Car {
    public static String abc="abc";
    private String make;
    private String model;
    private int age;

    public Car(String make, String model, int age) {
        this.make=make;
        this.model=model;
        this.age=age;
    }

    public String getMake(){
        return make;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return age == car.age &&
                make.equals(car.make) &&
                model.equals(car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, model, age);
    }

    public void honk() {
        if ("Dewoo".equals(this.make)) return;
        System.out.println("honk!");
    }
    public static void main(String[] args) {
        Car car1=new Car("Dewoo", "Matiz", 15);
        System.out.println(car1.toString());
        car1.honk();
        System.out.println("Car make: "+ car1.getMake()+ " Car model: "+car1.getModel());
        System.out.println(abc);
    }
}
