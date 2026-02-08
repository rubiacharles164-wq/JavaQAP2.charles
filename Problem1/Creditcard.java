public class Creditcard {
    private Money balance = 0;
    private Money creditLimit;
    private Person owner;

    public Creditcard(Money creditLimit, Person owner) {
        this.limit = money;
        this.NewCardHolder = owner;
    }

    public getBalance(Money balance) {
        return this.balance;
    }
    public getCreditLimit(Money creditLimit) {
        return this.creditLimit;
    }
    public String GetPersonals(String owner) {
        return this.owner;
    }

    public void Charge(Money amount) {
        if (balance + amount > creditLimit) {
            System.out.println("Charge denied: Exceeds credit limit.");
        } else {
            balance += amount;
            System.out.println("Charge successful. New balance: " + balance);
        }
    }
    public void MakePayment(Money amount) {
        balance -= amount;
        System.out.println("Payment successful. New balance: " + balance);
    }
}