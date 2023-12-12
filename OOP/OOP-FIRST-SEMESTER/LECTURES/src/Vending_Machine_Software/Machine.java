package Vending_Machine_Software;

public class Machine {
    private Coffee selectedCoffee;
    private double enteredMoney;
    private int numberOfCups;
    private int numberOfSticks;
    private double sugarQuantity;

    public Machine(Coffee selectedCoffee, double enteredMoney, int numberOfCups, int numberOfSticks, double sugarQuantity) {
        this.selectedCoffee = selectedCoffee;
        this.enteredMoney = enteredMoney;
        this.numberOfCups = numberOfCups;
        this.numberOfSticks = numberOfSticks;
        this.sugarQuantity = sugarQuantity;
    }

    public Coffee getSelectedCoffee() {
        return selectedCoffee;
    }

    public void setSelectedCoffee(Coffee selectedCoffee) {
        this.selectedCoffee = selectedCoffee;
    }

    public double getEnteredMoney() {
        return enteredMoney;
    }

    public void setEnteredMoney(double enteredMoney) {
        this.enteredMoney = enteredMoney;
    }

    public int getNumberOfCups() {
        return numberOfCups;
    }

    public void setNumberOfCups(int numberOfCups) {
        this.numberOfCups = numberOfCups;
    }

    public int getNumberOfSticks() {
        return numberOfSticks;
    }

    public void setNumberOfSticks(int numberOfSticks) {
        this.numberOfSticks = numberOfSticks;
    }

    public double getSugarQuantity() {
        return sugarQuantity;
    }

    public void setSugarQuantity(double sugarQuantity) {
        this.sugarQuantity = sugarQuantity;
    }
}
