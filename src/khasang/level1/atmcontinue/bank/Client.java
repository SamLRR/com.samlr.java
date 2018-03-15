package khasang.level1.atmcontinue.bank;

public class Client {
    private String firstName;
    private String surName;

    public Client() {
    }

    public Client(String firstName, String surName) {
        this.firstName = firstName;
        this.surName = surName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        if (!firstName.equals(client.firstName)) return false;
        return surName.equals(client.surName);
    }

    @Override
    public int hashCode() {
        int result = firstName.hashCode();
        result = 31 * result + surName.hashCode();
        return result;
    }

    // делайте всегда геттеры и сеттеры даже если не используете
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    @Override // добавлен
    public String toString() {
        return firstName + " " + surName;
    }
}
