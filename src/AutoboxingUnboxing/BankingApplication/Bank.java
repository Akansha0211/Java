package AutoboxingUnboxing.BankingApplication;

import java.util.ArrayList;

public class Bank {
    private String name; // Bank name
    private ArrayList<Branch> branches; // ArrayList for branches

    public Bank(String name){
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    /**
     * This method will add a branch to the ArrayList of Branches (only if branch with that particular name is not found)
     * @param branchName which is to be added to a Array list of branches
     * @return true if you can add a branch to the ArrayList otherwise return false
     */
    public boolean addBranch(String branchName){
        if(findBranch(branchName)== null){     // if a particular branch is not found then only add that branch name tp the list
            this.branches.add(new Branch(branchName)); // adding new branch name ot the ArrayList o branches in the Bank class
            return true;
        }
        return false;
    }


    /**
     * This method will add a Customer to the Branch name if that particular Branch Name is found in the ArrayList of branches in Bank Class
     * i.e Customer can only be added to the existing Branches.
     * @param branchName which is to be added int he Array list
     * @param customerName If Branch Name found than Customer with this name is added to that Branch
     * @param initialAmount this the amount which Customer will have initially in his account.
     * @return   false if Branch Name not found so a Customer cannot be added...
     */
    public boolean addNewCustomerToBranch(String branchName, String customerName, double initialAmount){
       if (findBranch(branchName) != null){
           return findBranch(branchName).addNewCustomers(customerName,initialAmount);
       }
       return false;
    }



    /**
     * This method will find a branch with that particular name
     * @param branchName which is to b found.
     * @return Branch with Branch name....
     */
    public Branch findBranch(String branchName){
        for (int i = 0; i <branches.size() ; i++) {
            if (this.branches.get(i).getName().equals(branchName)){    // Adding a new Customer to the Branch Name  ( for this you need Array List of Branches present in Customer Class)
                return this.branches.get(i);
            }
        }
        return null;
    }

//    public ArrayList<Customer> listAllCustomersInBranch(String branchName, String customerName){
//        Branch branch = findBranch(branchName);
//        if (branch!= null){
//            return branch.getCustomers();
//        }
//        return null;
//    }

    /**
     * Thsi method will give the list of all customers in a branch and their transactions
     * @param branchName from which customers are to be listed
     * @param showTransaction do you want to show transaction or not
     * @return false if branch name is not found in that Bank...
     */
    public boolean listAllCustomerInBranch(String branchName, boolean showTransaction){
        Branch branch = findBranch(branchName);
        if (branch != null){
            System.out.println("Customer details for a branch "+ branch.getName());   // branchName
            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for (int i = 0; i <branchCustomers.size() ; i++) {  // loop till size of ArrayLIts of customers...
                System.out.println("Customer : "+ branchCustomers.get(i).getName() + "[" + i + "]" );
                if (showTransaction){
                    System.out.println("Transactions :");
                    ArrayList<Double> transactions = branchCustomers.get(i).getTransactions();
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("["+(j+1)+ " ]"+ "Amount"+ transactions.get(j));
                    }
                }
            }
        }
        return false;
    }
//    public boolean showTransactions(String branchName , boolean show ){
//        Branch branch = findBranch(branchName);
//        if (branch!= null){
//            ArrayList<Customer> branchCustomers = branch.getCustomers();
//            for (int i = 0; i < branchCustomers.size(); i++) {
//                Customer customer = branchCustomers.get(i);
//                System.out.println("Customer Name :"+ customer.getName());
//                if (show){
//                    ArrayList<Double> transactionOfCustomerOfBranch = branchCustomers.get
//                }
//            }
//        }
//    }



}
