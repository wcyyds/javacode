package Thread;

public class Request {
    private String name;

    public Request(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String toString() {
        // TODO Auto-generated method stub
        return name;
    }
}