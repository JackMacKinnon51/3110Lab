import java.util.ArrayList;

public class AddressBook {
    private final ArrayList<BuddyInfo> addressbook;

    public AddressBook() {
        this.addressbook = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy){addressbook.add(buddy);
    }

    public void removeBuddy(BuddyInfo x){ addressbook.remove(x);
    }

    public void printBook(){
        for(BuddyInfo x : addressbook){
            System.out.print(x.getName());
        }

    }
    public static void main(String[] args){
        BuddyInfo buddy = new BuddyInfo("Tom","Carleton","613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }
}
