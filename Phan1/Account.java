public class Account {
    private String id;
    private String name;
    private int balance = 0;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount) {
        return balance += amount;
    }

    public int debit(int amount) {
        if (amount <= balance) {
            return balance -=amount;
        } else {
            System.out.println("Exceeded amount balance!!!");
        }
        return balance;
    }

    public int transferTo(Account anotherAccount, int amount) {
        if (amount <= balance) {
            this.balance -= amount;
            return anotherAccount.balance += amount;
        } else {
            System.out.println("Amount exceeded balance!!!");
            return balance;
        }
    }

    @Override
    public String toString() {
        return "Account=[id="+id+",name="+name+",balance="+balance+"]";
    }

    public static void main(String[] args) {
        Account a1 = new Account("A101", "Minh Thanh", 88);
        System.out.println(a1);
        Account a2 = new Account("A102", "Nhu Y");
        System.out.println(a2);

        System.out.println("Id:"+a1.getId());
        System.out.println("Name:"+a1.getName());
        System.out.println("Balance:"+a1.getBalance());

        a1.credit(100);
        System.out.println(a1);
        a1.debit(50);
        System.out.println(a1);
        a1.debit(500);
        System.out.println(a1);

        a1.transferTo(a2, 100);
        System.out.println(a1);
        System.out.println(a2);
    }
}
