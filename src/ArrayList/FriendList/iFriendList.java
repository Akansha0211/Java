package ArrayList.FriendList;

public interface iFriendList {
    //This method  will add a friend to your friendList...
      boolean acceptFriendRequest(Contact contact);
      //This method will remove a friend from your friendList...
      void removeFromFriendList(int position);
      //This method will search a friend in your friendList ....
      int findFriend(Contact contact);
      boolean findFriend(String contactName);
}
