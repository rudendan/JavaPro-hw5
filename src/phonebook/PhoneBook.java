package phonebook;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {

    private List<Record> phoneBook = new ArrayList<>();

    public void add(Record record) {
        phoneBook.add(record);

    }

    public Record find(String name) {

        for (Record record:phoneBook) {
            if(record.getName().equals(name))
                return record;
        }
        return null;
    }

    public List<Record> findAll(String name) {

        List<Record> result = new ArrayList<>();
        for (Record record:phoneBook) {
            if(record.getName().equals(name))
                result.add(record);
        }
        return result;
    }
}
