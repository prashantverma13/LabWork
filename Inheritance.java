import java.util.Random;
 class Change {
    public static void main(String[] args) {
        Account ac1 = new Account(2000, "Smith");
        Account ac2 = new Account(3000, "Kathy");

        //deposite 2000 in Smith's A/c
        ac1.deposite(2000);
        //withdraw 2000 from Kathy's A/c
        ac2.withdraw(2000);
        //Printing balnce
        System.out.println("Smith has : " + ac1.getBalance());
        System.out.println("Kathy has : " + ac2.getBalance());
    }
}


class Account extends Person{

    Account(double balance,String name){
        super(name);
        this.balance = balance;
    }

    void AccNum(){
        //genrating 6 digit account number
        Random n = new Random();
        int num = n.nextInt(999999);
        accNum = Integer.parseInt(String.format("%6d", num));
    }

    int accNum;
    double balance;
    Person accHolder;

    void deposite(double amt){
        balance += amt;
    }
    void withdraw(double amt){
        balance -= amt;
    }

    double getBalance(){
        return balance;
    }
}

class Person{

    Person(String name,Float age){
        this.name = name;
        this.age = age;
    }
    Person(String name){
        this.name = name;
    }
    private String name;
    private Float age = null;

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }

    void setAge(Float age){
        this.age = age;
    }
    Float getage(){
        return age;
    }
}