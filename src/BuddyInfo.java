public class BuddyInfo {

    private String name;
    private String address;
    private String phonenumber;

    public BuddyInfo(String name, String address, String phonenumber) {
        this.name = name;
        this.address = address;
        this.phonenumber = phonenumber;
    }

    public String getName() {
        return name;
    }


    public String getAddress() {
        return address;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public static void main(String[] args) {
        BuddyInfo Buddy1 = new BuddyInfo("Homer","chez toi", "712");

        System.out.println("Hello " + Buddy1.getName());

    }
}

