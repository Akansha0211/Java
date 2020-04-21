package AutoboxingUnboxing.BankingApplication;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;
    public Customer(String name, double initialAmount){
        this.name = name;
        this.transactions = new ArrayList<Double>();
    }
    public String getName(){
        return  name;
    }
    public ArrayList<Double> getTransactions(){
        return transactions;
    }

}
