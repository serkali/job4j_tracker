package profession;

public class Surgeon extends Doctor{
    private int numberOfOperations;
    private String assistant;

    public Surgeon(String name, String surname, int age, String birthplace, String specialty, String tool, String medicalInstitution, int numberOfOperations, String assistant) {
        super(name, surname, age, birthplace, specialty, tool, medicalInstitution);
        this.numberOfOperations = numberOfOperations;
        this.assistant = assistant;
    }

    public int getNumberOfOperations() {
        return numberOfOperations;
    }

    public void setNumberOfOperations(int numberOfOperations) {
        this.numberOfOperations = numberOfOperations;
    }

    public String getAssistant() {
        return assistant;
    }

    public void setAssistant(String assistant) {
        this.assistant = assistant;
    }
}
