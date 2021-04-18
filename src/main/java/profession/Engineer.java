package profession;

public class Engineer extends Profession {
    private String specialty;
    private String tool;
    private String constructionObject;

    public Engineer(String name, String surname, int age,
                    String birthplace, String specialty, String tool, String constructionObject) {
        super(name, surname, age, birthplace);
        this.specialty = specialty;
        this.tool = tool;
        this.constructionObject = constructionObject;
    }

    public String getSpecialty() {
        return specialty;
    }

    public String getTool() {
        return tool;
    }

    public String getConstructionObject() {
        return constructionObject;
    }
}
