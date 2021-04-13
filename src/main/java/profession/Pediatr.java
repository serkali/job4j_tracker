package profession;

public class Pediatr extends Doctor{
    private String businesHours;
    private int numberOfChildren;

    public int getNumberOfChildren() {
        return numberOfChildren;
    }

    public void setNumberOfChildren(int numberOfChildren) {
        this.numberOfChildren = numberOfChildren;
    }

    public String getBusinesHours() {
        return businesHours;
    }

    public void setBusinesHours(String businesHours) {
        this.businesHours = businesHours;
    }
    public Pediatr diagnos(Pacient pacient){
        return diagnos(pacient);
    }

    }



