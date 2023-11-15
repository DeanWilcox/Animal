import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
       String name = "Dean";
       int age = 29;
       boolean isMacUser = true;

       isMacUser = true;

       if(isMacUser){
           System.out.println("Hi, Mac user");
       }
       



       PrintName(name);
       System.out.println("I am " + age);
       // Last place visited
       System.out.println(isMacUser);
       System.out.println("Pennsylvania");
       System.out.println("$2,000,000");
       
       Scanner scanner = new Scanner(System.in);
       System.out.println("Please enter your name: ");
       String userName = scanner.nextLine();
       System.out.println("The user name you enetered is: " + userName);
       

       
       System.out.println("Please enter a temperature: ");
       String temperature = scanner.nextLine();
       System.out.println("The temperature you enetered is: " + Double.parseDouble(temperature));
       scanner.close();



    }

    /**
     * This prints name based on provided input
     * @param name that should be printed
     */  
        public static void PrintName(String name)
    {
        /*
         * Prints to the console
         * this is the second line
         */
        System.out.println(name + " Wilcox");
    }

}