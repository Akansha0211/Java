package AutoboxingUnboxing.BankingApplication;

import java.util.ArrayList;

public class Bank {
    private String name; // Bank name
    private ArrayList<Branch> branches; // ArrayList for branches

    public Bank(String name){
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

//    public boolean addBranch(String branchName){
//        if(findBranch()== null){
//            this.branches.add(new Branch(branchName));
//            return true;
//        }
//        return false;
//    }

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
