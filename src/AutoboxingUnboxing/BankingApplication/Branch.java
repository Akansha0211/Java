package AutoboxingUnboxing.BankingApplication;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers; // Customer Array List
    public Branch(String name){
        this.name = name;
        this.customers = new ArrayList<Customer>(); // initializing CustomerArray List
    }
    public String getName(){
        return name;
    }
    public ArrayList<Customer> getCustomers(){
        return customers;
    }

    /**
     * This method will add customer to the customer Array List if a customer with that particular name is not found
     * @param customerName which is searched for in findCustomer() method if not found than only a customer with that name is added to the CustomerList
     * @param initialAmount
     * @return true if we can add a customer i.e when it is not already present otherwise false...
     */
    public boolean addCustomers(String customerName, double initialAmount){
        if (findCustomer(customerName)== null) {
            this.customers.add(new Customer(customerName,initialAmount));
            return true;
        }
        return false;
    }

    /**
     * This method will find whether a customer with particular name is present in the customer Array list of Branch or not
     * @param customerName Customer with this particular name in the Array List is to be searched for
     * @return Customer
     */
    public Customer findCustomer(String customerName){
        for (int i = 0; i < customers.size(); i++) {
            if (this.customers.get(i).getName()== customerName){
                return this.customers.get(i);
            }
        }
        return null;
    }

}
