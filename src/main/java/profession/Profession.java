package profession;

public class Profession {
    private String name;
    private String surname;
    private int age;
    private String birthplace;

    public Profession(String name, String surname, int age, String birthplace) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.birthplace = birthplace;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getBirthplace() {
        return birthplace;
    }
}
