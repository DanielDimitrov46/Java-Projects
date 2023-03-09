package coffeeMachineSoftware;

public class Coins {
    private static Coins[] coins;
    private int amount ;
    private int quantity ;

    public Coins(int amount, int quantity){
        this.setAmount(amount);
        this.setQuantity(quantity);
    }
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public static void input(){
        coins = new Coins [4];
        coins[0] = new Coins(10,30);
        coins[1] = new Coins(20,30);
        coins[2] = new Coins(50,30);
        coins[3] = new Coins(100,30);
    }

    public static void exchange(){

    }
}
