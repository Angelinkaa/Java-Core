public class Person {
    private static int Age;
    private static String FullName;
    String Position;
    String Email;
    String PhoneNumber;
    int Wage;

    public Person(String FullName, String Position, String Email, String PhoneNumber, int Wage, int Age) {
        this.FullName = FullName;
        this.Position = Position;
        this.Email = Email;
        this.PhoneNumber = PhoneNumber;
        this.Age = Age;
        this.Wage = Wage;
    }

    public static void printInfo() {
        if (Age > 40) {
            System.out.println("Сотрудники, возраст которых больше 40 лет: " + FullName);
        }
    }

}
