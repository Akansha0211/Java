package ArrayList.phoneDirctory;

public class Contact {
    private String name;
    private String mobileNumber;

    public Contact( String name , String mobileNumber){
        this.name = name;
        this.mobileNumber = mobileNumber;
    }

    public String getName(){
        return name;
    }
    public String getMobileNumber(){
        return mobileNumber;
    }

    /**
     * This method will create a Contact object
     * @param name   contact of this name is to be created.
     * @param mobileNumber   contact name with thus mobileNumber.
     * @return    object created (i.e contact created ) from the Constructor of Contact class.
     */
    public static Contact createContact(  String name , String mobileNumber){
        return new Contact(name,mobileNumber);
    }


}
