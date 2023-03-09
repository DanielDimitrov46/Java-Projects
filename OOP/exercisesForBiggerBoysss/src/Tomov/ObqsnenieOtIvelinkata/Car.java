package Tomov.ObqsnenieOtIvelinkata;

public class Car {
    private  String model;
    private int hp;
    private String brand;
    private String color;

    public Car(){

    }
    public Car(String model, int hp, String brand, String color){
        this.setModel(model);
        this.setHp(hp);//this.hp = hp;
        this.setBrand(brand);
        this.setColor(color);
    }

    public void setModel(String model){
        if(model.length() != 1){
            this.model = model;
        }
    }

    public String getModel(){
        return model;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Brand: " + getBrand() + " Model: " + this.model + " hp: " + getHp();
    }
}

