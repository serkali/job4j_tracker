package profession;

public class Builder extends Engineer{
    private String buildingType;
    private int building;

    public Builder(String name, String surname, int age, String birthplace, String specialty, String tool, String constructionObject, String buildingType, int building) {
        super(name, surname, age, birthplace, specialty, tool, constructionObject);
        this.buildingType = buildingType;
        this.building = building;
    }

    public String getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(String buildingType) {
        this.buildingType = buildingType;
    }

    public int getBuilding() {
        return building;
    }

    public void setBuilding(int building) {
        this.building = building;
    }
}
