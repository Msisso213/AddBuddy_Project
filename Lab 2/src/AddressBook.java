import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    private ArrayList<BuddyInfo> myBuddies;

    public AddressBook() {
        myBuddies = new ArrayList<>();
    }

    public void addBuddyInfo(BuddyInfo aBuddy) {
        if(aBuddy != null){
            myBuddies.add(aBuddy);
        }
    }

    public BuddyInfo removeBuddy(int index) {
        if(index >= 0 && index < myBuddies.size()) {
            return myBuddies.remove(index);
        }
            return null;
    }

    public BuddyInfo removeBuddy1(int index) {
        if(index >= 0 && index < myBuddies.size()) {
            return myBuddies.remove(index);
        }
        return null;
    }
    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Homer", "123 street", "0123456789");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddyInfo(buddy);
        addressBook.removeBuddy(0);
        addressBook.addBuddyInfo(buddy);
    }
}

