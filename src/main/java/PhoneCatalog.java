
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PhoneCatalog {

    private final Map<String, List<Long>> phoneBook;

    public PhoneCatalog() {
        this.phoneBook = new HashMap<String, List<Long>>();
    }

    public void add(String firstName, String phoneNumber) {

        Long phoneNum = Long.parseLong(phoneNumber);

        if (phoneBook.containsKey(firstName)) {
            phoneBook.get(firstName).add(phoneNum);
        } else {
            List<Long> phoneList = new ArrayList<Long>();
            phoneList.add(phoneNum);
            phoneBook.put(firstName, phoneList);
        }
    }

    public void get(String firstName) {
        if (phoneBook.containsKey(firstName)) {
            System.out.print(firstName + ": ");
            System.out.println(phoneBook.get(firstName));
        }
    }
}