package campuswallettransfer;
public class CampusWalletTransfer {
public static void main(String[] args) {
         CWT cwt = new CWT();

        CWT.CampusWallet Aly = cwt.new CampusWallet("Aly", 100);
        CWT.CampusWallet Ben = cwt.new CampusWallet("Ben");

        System.out.println("Aly: " + Aly.Balance() + ", Ben: " + Ben.Balance());

        System.out.println("Transfer 35: " + Aly.transfer(Ben, 35));
        System.out.println("Aly: " + Aly.Balance() + ", Ben: " + Ben.Balance());

        System.out.println("Transfer 70: " + Aly.transfer(Ben, 70));
        System.out.println("Aly: " + Aly.Balance() + ", Ben: " + Ben.Balance());

        System.out.println("Transfer 10 to own wallet: " + Aly.transfer(Aly, 10));
        System.out.println("Aly: " + Aly.Balance() + ", Ben: " + Ben.Balance());

        System.out.println("Ben deposits 15: " + Ben.deposit(15));
        System.out.println("Aly: " + Aly.Balance() + ", Ben: " + Ben.Balance());

        System.out.println("Transfer 65: " + Aly.transfer(Ben, 65));
        System.out.println("Aly: " + Aly.Balance() + ", Ben: " + Ben.Balance());

        System.out.println("Transfer 0: " + Aly.transfer(Ben, 0));
        System.out.println("Transfer to null: " + Aly.transfer(null, 10));
    }
    
}
