import java.util.ArrayList;

public class Main {

    
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(new Cat().GetSound());
        System.out.println(new Dog().GetSound());
        System.out.println(new Cow().GetSound());

        User user = new User("Dean");
        System.out.println(user);
        Instructor instructor = new Instructor("Dean");
        System.out.println(instructor);

        var userList = new ArrayList<User>();
        userList.add(instructor);

        PrintUsers(userList);

        B b = new B("Apple", "Carrot", "Lettuce", "Tomato");
        System.out.println(b.Present());
    }

    public static void PrintUsers(ArrayList<User> users) {

        for(var user : users) {
            System.out.println(user);
        }

    }

}