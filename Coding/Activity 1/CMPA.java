package campusprintingaccount;
public class CMPA {
     private String studentName;
    private int credits;

    public CMPA(String studentName, int credits) {
        this.studentName = studentName;
        if (credits <= 0) {
            this.credits = 0;
        } else {
            this.credits = credits;
        }
    }

    public boolean addCredits(int amount) {
        if (amount <= 0) {
            return false;
        }
        this.credits += amount;
        return true;
    }

    public boolean pages(int pages) {
        if (pages <= 0 || pages > this.credits) {
            return false;
        }
        this.credits -= pages;
        return true;
    }
    public int getCreds(){
        return this.credits;
    }
}
