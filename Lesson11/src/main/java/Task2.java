import java.util.Set;

public class Task2 {

    public static void main(String[] args) {
        IPhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Bresskaya", "910-250-99-21");
        phoneBook.add("Sber", "900");
        phoneBook.add("Arzhanovskaya", "911-111-11-11");
        phoneBook.add("Shafeev", "955-555-55-55");
        phoneBook.add("Bresskaya", "980-000-00-00");
        phoneBook.add("Bresskii", "919-999-99-99");

        Set<String> allSurnames = phoneBook.getAllSurnames();
        for (String surname : allSurnames) {
            Set<String> phones = phoneBook.get(surname);
            System.out.printf("%s: %s%n", surname, phones);
        }
    }


}
