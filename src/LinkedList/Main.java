package LinkedList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Akansha",54.96);
        Customer anotherCustomer;
        anotherCustomer = customer; // both the reference points to the same objects....
        anotherCustomer.setBalance(32.5);
        System.out.println("Balance for customer "+customer.getName()+" is "+customer.getBalance());


        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);// autoboxing is done here
        items.add(2);
        items.add(3);

        for (int i = 0; i < items.size(); i++) {
            System.out.println(i+ ":"+ items.get(i));
        }
    }
}
