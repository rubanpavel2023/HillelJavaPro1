package phonebook;

import java.util.ArrayList;
import java.util.List;

public class Phonebook {

    static class Record {
        private String Name;
        private String NumberTel;

        public Record(String name, String numberTel) {
            this.Name = name;
            this.NumberTel = numberTel;
        }

        public String getName() {
            return Name;
        }

        public String getNumberTel() {
            return NumberTel;
        }
    }

    private List<Record> PhoneContacts;

    public Phonebook() {
        this.PhoneContacts = new ArrayList<>();
    }

    public void addContact(Record contact) {
        PhoneContacts.add(contact);
    }

    public void findAndPrintRecords(String name) {
        List<Record> foundRecords = new ArrayList<>();
        for (Record record : this.PhoneContacts) {
            if (record.getName().equals(name)) {
                foundRecords.add(record);
            }
        }
        if (!foundRecords.isEmpty()) {
            for (Record record : foundRecords) {
                System.out.println("Name: " + record.getName() + ", Phone: " + record.getNumberTel());
            }
        } else {
            System.out.println("contact not found");
        }
    }

    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        phonebook.addContact(new Record("Pavel", "0681111111"));
        phonebook.addContact(new Record("Igor", "0672222222"));
        phonebook.addContact(new Record("Igor", "0983333333"));
        phonebook.addContact(new Record("Dmitry", "0634444444"));
        phonebook.addContact(new Record("Dmitry", "0635555555"));
        phonebook.addContact(new Record("Elena", "0636666666"));

       phonebook.findAndPrintRecords("Dmitry");
    }

}


