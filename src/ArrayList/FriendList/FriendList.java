package ArrayList.FriendList;

import java.util.ArrayList;

public class FriendList implements iFriendList {

    private ArrayList<Contact> friendList;

    public FriendList(ArrayList<Contact> friendList) {
        this.friendList = new ArrayList<>();
    }

    @Override
    public boolean acceptFriendRequest(Contact contact) {
        if (findFriend(contact)>=0){
            System.out.println("Hey your this person s already in your friendList");
            return false;
        }
        friendList.add(contact);
        return true;
    }

    @Override
    public void removeFromFriendList() {

    }

    @Override
    public int findFriend(Contact contact) {
        return this.friendList.indexOf(contact);
    }
}
