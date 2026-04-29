package lecture.lambda.section3;

public class Account {

    private String ownerName;
    private int balance;

    public Account(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "Account{" +
                "ownerName='" + ownerName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
