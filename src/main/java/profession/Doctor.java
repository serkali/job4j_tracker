package profession;

public class Doctor extends Profession{
    private String specialty;
    private String tool;
    private String medicalInstitution;

    public Doctor(String name, String surname, int age, String birthplace, String specialty, String tool, String medicalInstitution) {
        super(name, surname, age, birthplace);
        this.specialty = specialty;
        this.tool = tool;
        this.medicalInstitution = medicalInstitution;
    }

    public String getSpecialty() {
        return specialty;
    }

    public String getTool() {
        return tool;
    }

    public String getMedicalInstitution() {
        return medicalInstitution;
    }

}
