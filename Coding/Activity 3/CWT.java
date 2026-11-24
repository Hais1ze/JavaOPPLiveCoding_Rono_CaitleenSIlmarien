package campuswallettransfer;
public class CWT {
    public class CampusWallet {
    private String owner;
    private int balance;

    public CampusWallet(String owner, int balance) {
        this.owner = owner;

        if (balance < 0) {
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }

    public CampusWallet(String owner) {
        this(owner, 0);
    }

    public boolean deposit(int amount) {
        if (amount <= 0) {
            return false;
        }

        balance += amount;
        return true;
    }

    public boolean transfer(CampusWallet recipient, int amount) {
        if (recipient == null || recipient == this || amount <= 0 || balance < amount) {
            return false;
        }

        balance -= amount;
        recipient.balance += amount;
        return true;
    }

    public int Balance() {
        return balance;
    }
    }
}
