package LinkedList;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Akansha",54.96);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(32.5);
        System.out.println("Balance for customer "+customer.getName()+" is "+customer.getBalance());
    }
}
