package ArrayList.FriendList;

import array.Array;

import java.util.ArrayList;

public class Profile {
    private String name;
    private ArrayList<Contact> friendList;

    public Profile(ArrayList<Contact> friendList) {
        this.friendList = new ArrayList<>();
    }
}
