public class Main {
    public static void main(String[] args) {
        BankAccount daniel = new BankAccount(1111112222,400,"Daniel Dimitrov");
        daniel.deposit(69);
        System.out.println("Current cash is: "+daniel.getCashInAccount());
        daniel.deposit(100);
        System.out.println("Current cash is: "+daniel.getCashInAccount());
        daniel.withdraw(400);
        System.out.println("Current cash is: "+daniel.getCashInAccount());
        System.out.println(daniel);
    }
}