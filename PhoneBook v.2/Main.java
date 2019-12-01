public class Main {
    public static void main(String[] args) {
        PhoneBook bookPhone = new PhoneBook();

        Contact Ann = new Contact("89670085444", "Anna", "");
        Contact Sasha = new Contact("+79686840794", "Sasha", "Ivanov");
        Contact Ann2000 = new Contact("86755854465", "", "Semenova");
        Contact Maria1987 = new Contact("89766543123", "Anna", "Skvorcova");


        bookPhone.addContact(Ann);
        bookPhone.addContact(Sasha);
        bookPhone.addContact(Maria1987);
        bookPhone.addContact(Ann2000);
        bookPhone.viewBook();

        bookPhone.deleteContact(Sasha);
        bookPhone.viewBook();

        System.out.println("Результат поиска:");
        bookPhone.searchContact(null, "Anna", null);
    }
}