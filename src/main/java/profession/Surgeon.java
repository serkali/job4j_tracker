package profession;

public class Surgeon extends Doctor{
    private int numberOfOperations;
    private String assistant;

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
