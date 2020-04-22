package AutoboxingUnboxing.BankingApplication;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialAmount){
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransaction(initialAmount);
    }
    public String getName(){
        return  name;
    }
    public ArrayList<Double> getTransactions(){
        return transactions;
    }

    /**
     * Thsi method will add a transaction in the Customer class
     * @param amount which is to be added...
     */
    public void addTransaction(double amount){
        this.transactions.add(amount);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", transactions=" + transactions +
                '}';
    }
}
