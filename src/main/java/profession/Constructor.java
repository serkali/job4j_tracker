package profession;

public class Constructor extends Engineer {
    private String company;
    private String objectshema;

    public Constructor(String name, String surname, int age,
                       String birthplace, String specialty, String tool,
                       String constructionObject) {
        super(name, surname, age, birthplace, specialty, tool, constructionObject);
        this.company = company;
        this.objectshema = objectshema;
    }

    public String getObjectshema() {
        return objectshema;
    }

    public void setObjectshema(String objectshema) {
        this.objectshema = objectshema;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}

