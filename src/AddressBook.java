import java.util.ArrayList;

public class AddressBook {
    private final ArrayList<BuddyInfo> addressbook;

    public AddressBook() {
        this.addressbook = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo x){
        this.addressbook.add(x);
    }

    public void removeBuddy(BuddyInfo x){
        this.addressbook.remove(x);
    }

    public void printBook(){
        for(BuddyInfo x : addressbook){
            System.out.print(x.getName());
        }

    }
    public static void main(String[] args){
        BuddyInfo buddy = new BuddyInfo("Tom","Carleton","613");
        AddressBook adressBook = new AddressBook();
        adressBook.addBuddy(buddy);
        adressBook.removeBuddy(buddy);
    }
}
