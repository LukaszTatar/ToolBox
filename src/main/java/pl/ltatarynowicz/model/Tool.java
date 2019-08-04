package pl.ltatarynowicz.model;

public class Tool {
    long id;
    String name;
    boolean aviability;
    private Type type;

    public Tool(long id, String name, boolean aviability, Type type) {
        this.id = id;
        this.name = name;
        this.aviability = aviability;
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAviability() {
        return aviability;
    }

    public void setAviability(boolean aviability) {
        this.aviability = aviability;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Tool() {
    }
}
