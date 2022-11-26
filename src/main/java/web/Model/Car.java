package web.Model;

public class Car {
    private String brand;
    private String model;
    private int mileage;

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", mileage=" + mileage +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getMileage() {
        return mileage;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public Car(String brand, String model, int mileage) {
        this.brand = brand;
        this.model = model;
        this.mileage = mileage;
    }
}
