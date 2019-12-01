import java.util.ArrayList;

class PhoneBook {
    private ArrayList<Contact> book = new ArrayList();

    // добавление контакта в список
    void addContact(Contact a) {
        book.add(a);
    }

    // удаление контакта
    void deleteContact(Contact a) {
        book.remove(a);
    }

    // поиск контакта по телефону/ имени/ фамилии
    // в качестве результата выведет список контактов, удовлетворяющих поиску
    void searchContact (String number, String name, String surname) {
        ArrayList<Contact> result = new ArrayList();
        for (int i = 0; i < this.book.size(); i++) {
            Contact nowContact = book.get(i);
            if (nowContact.getName().equals(name) ||
                    nowContact.getNumber().equals(number) ||
                    nowContact.getSurname().equals(surname)) {
                result.add(nowContact);
            }
        }

        for (int i = 0; i < result.size(); i++) {
            result.get(i).viewContact();
        }
    }

    // вывод книги на экран
    void viewBook() {
        System.out.println("Ваша записная книжка на данный момент:");
        for(int i = 0; i < book.size(); i++){
            book.get(i).viewContact();
        }
        System.out.println("\n");
    }


}
