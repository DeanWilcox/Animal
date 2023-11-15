public class Instructor extends User {
    
    public Instructor(String name) {
        super(name);
    }
    @Override
    public String toString() {
        return "Instructor Name: " + name;
    }
}