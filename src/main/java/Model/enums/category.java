package Model.enums;

public enum category {
    PLC("Places to visit"),
    SHL("Shoping list"),
    TDL("To do list"),
    OTH("Other");

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    category(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return name;
    }
}
