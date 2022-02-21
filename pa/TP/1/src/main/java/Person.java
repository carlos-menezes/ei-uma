public class Person {
    private final String name;
    private int age;
    private double balance;
    private double moneyOwed;
    private int kids;

    public Person(String name, int age, double balance, int kids, double moneyOwed) {
        this.name = name;
        this.age = age;
        this.balance = balance;
        this.kids = kids;
        this.moneyOwed = moneyOwed;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.balance = 0;
        this.moneyOwed = 0;
        this.kids = 0;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double getBalance() {
        return this.balance;
    }

    public int getKids() {
        return this.kids;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setKids(int kids) {
        this.kids = kids;
    }

    public void deposit(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Deposit quantity must be a positive quantity");
        }
        double currentBalance = this.getBalance();
        this.setBalance(currentBalance + n);
    }

    public void withdraw(int n) throws InsufficientBalanceException, IllegalArgumentException {
        if (n > this.getBalance()) {
            throw new InsufficientBalanceException();
        }

        if (n < 1) {
            throw new IllegalArgumentException("Withdraw quantity must be a positive quantity");
        }

        double currentBalance = this.getBalance();
        this.setBalance(currentBalance - n);
    }

    public double getMoneyOwed() {
        return moneyOwed;
    }

    public void setMoneyOwed(double moneyOwed) {
        this.moneyOwed = moneyOwed;
    }

    public boolean canGetCredit() {
        int sureness = 0;
        if (this.getAge() >= 18) {
            sureness += 25;
        }

        if (this.getMoneyOwed() == 0) {
            sureness += 45;
        }

        if (this.getKids() < 3) {
            sureness += 30;
        }

        return sureness >= 60;
    }
}
