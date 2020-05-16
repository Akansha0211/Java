package ArrayList.FriendList;

import java.util.ArrayList;

public class FriendList implements iFriendList {

    private ArrayList<Contact> friendList;

    public FriendList(ArrayList<Contact> friendList) {
        this.friendList = new ArrayList<>();
    }

    @Override
    public boolean acceptFriendRequest() {
        return false;
    }

    @Override
    public void removeFromFriendList() {

    }

    @Override
    public void modifyMyProfile() {

    }

    @Override
    public void viewFriendList() {

    }

    @Override
    public boolean findFriendInList() {
        return false;
    }
}
