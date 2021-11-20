public class Main {

    public static void main(String[] args) {
        Person[] person = new Person[5];
        person[0] = new Person("Ivanov Ivan", "Engineer", "ii@mailbox.com", "89231235412", 30000, 30);
        person[1] = new Person("Ivanova Anna", "Engineer", "ia@mailbox.com", "89231231258", 40000, 25);
        person[2] = new Person("Bresskaya Angelina", "Engineer", "ba@mailbox.com", "89231237592", 50000, 24);
        person[3] = new Person("Sidorov Ivan", "Cleaner", "si@mailbox.com", "89231561258", 20000, 34);
        person[4] = new Person("Smith John", "Manager", "sj@mailbox.com", "89231231568", 100000, 44);
        Person.printInfo();

    }


}
