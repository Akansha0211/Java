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
        if(findBranch(branchName)== null){
            this.branches.add(new Branch(branchName));
            return true;
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
            if (this.branches.get(i).getName()==branchName){
                return this.branches.get(i);
            }
        }
        return null;
    }


}
