class Contact {
    private String number;
    private String name;
    private String surname;

    Contact() {};

    Contact (String number, String name, String surname) {
        this.number = number;
        this.name = name;
        this.surname = surname;
    }

    void setNumber(String number) {
        this.number = number;
    }

    void setName(String name) {
        this.name = name;
    }

    void setSurname(String surname) {
        this.surname = surname;
    }

    String getNumber() {
        return number;
    }

    String getName() {
        return name;
    }

    String getSurname() {
        return surname;
    }

    // просмотр контакта
    void viewContact(){
        System.out.println(this.name + " " + this.surname + " " + this.number);
    }
}
