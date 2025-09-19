import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    private List<BuddyInfo> buddyInfos;

    public AddressBook() {
        this.buddyInfos = new ArrayList<BuddyInfo>();
    }

    public void addBuddyInfo(BuddyInfo buddyInfo) {
        buddyInfos.add(buddyInfo);
    }

    public void removeBuddyInfo(BuddyInfo buddyInfo) {
        buddyInfos.remove(buddyInfo);
    }
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddyInfo(new BuddyInfo("Homer", "123 street", "0123456789"));
        addressBook.addBuddyInfo(new BuddyInfo("UUU", "123 street", "0123456789"));
        System.out.println(addressBook.buddyInfos.size());
        addressBook.removeBuddyInfo(addressBook.buddyInfos.get(0));
        System.out.println(addressBook.buddyInfos.size());
        System.out.println("Address book");
    }
}
