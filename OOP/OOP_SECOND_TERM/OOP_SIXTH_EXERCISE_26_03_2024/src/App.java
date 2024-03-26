public class App {
    public static void main(String[] args) {
        Buyable[] buyableArray = new Buyable[2];
        buyableArray[0] = new Product(234,"Bate pesho",3);
        buyableArray[1] = new BetterProduct(234,"Bate gosho",3);
        for (int i = 0; i < buyableArray.length; i++) {
            Buyable buyable = buyableArray[i];
            System.out.println(buyable.getName());
        }
    }
}