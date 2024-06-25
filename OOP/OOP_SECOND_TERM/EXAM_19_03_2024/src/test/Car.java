package test;

public class Car {
    private String model;
    private String brnad;
    private double price;
    private String year;
    private int id;

    public Car(String model,String brnad,double price,String year,int id) {
        this.model = model;
        this.brnad = brnad;
        this.price = price;
        this.year = year;
        this.id = id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel(){
        return model;
    }

    public void setBrnad(String brnad) {
        this.brnad = brnad;
    }

    public String getBrand(){
        return model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice(){
         return price;

    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getYear(){
        return year;
    }

    public void setId(int id){
        this.id = id;
    }

    @Override
    public String toString() {
        return "Model is:" + model + ";" + "brnad:" + brnad + ";" + "price:" + price + ";"  + "Year:" + year + ";" + "ID:" + id;
    }
}
