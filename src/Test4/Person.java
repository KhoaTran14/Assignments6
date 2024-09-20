package Test4;
import java.util.Date;
import java.util.Scanner;

public abstract class Person implements IPerson {
    String id;
    String name;
    Date dateOfBirth;

    public Person(String id, String fullName, Date dateOfBirth) {
        this.id = id;
        this.name = fullName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public abstract void addPerson();

    @Override
    public abstract void updatePerson(String id);

    @Override
    public abstract void displayInfo();
}
