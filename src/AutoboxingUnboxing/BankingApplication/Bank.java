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


}
