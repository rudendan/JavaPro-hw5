package phonebook;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add(new Record("Denys", "380639999999"));
        phoneBook.add(new Record("Max", "380963358877"));
        phoneBook.add(new Record("Denys", "380634777388"));
        phoneBook.add(new Record("Phillip", "38565480189"));

        Record find = phoneBook.find("Denys");
        if(find != null)
            System.out.println(find.getName() + " " + find.getNumber() );

        System.out.println();

        List<Record> findAll = phoneBook.findAll("Denys");
        for (Record record:findAll) {
            System.out.println(record.getName() + " " + record.getNumber());
        }
    }
}