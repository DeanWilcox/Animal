import java.util.Scanner;

/**
* Week2MondayMain
*/
public class week2mondaymain {
 
    public static void main(String[] args) {
        int i = 42;
        System.out.println(i);
        int copyi = i;
        System.out.println(copyi);
        copyi = 21;
        System.out.println(i);
        System.out.println(copyi);
 
        Circle circle = new Circle();
        circle.radius = 10;
        System.out.println(circle.radius);
        Circle circle2 = new Circle();
        System.out.println(circle2.radius);
        circle2.radius = 10;
        System.out.println(circle.radius);
       System.out.println(circle2.radius);

        int number1 = 5;
        int number2 = 5;

        System.out.println("should equal true" + (number1 == number2));

        String name = "Melissa";
        String secondName = "Melissa";

        String printText = "name to second name comparison".concat(secondName);
        
        System.out.println("name to second name" + name.compareTo(secondName));

        String poem = """
                The sky is blue today,
                how beautiful
                """;
        String student_name = "Dean Wilcox"; //original name
        student_name = "Dean Alan Wilcox"; //change the name
        System.out.println("My name is " + student_name);
        Double GPA = 3.5; //original gpa
        GPA = 0.0; //change the gpa
        System.out.println("My GPA is " + GPA);
        Boolean veteran_status = true; //use boolean for T/F questions
        System.out.println("Are you a veteran? " + veteran_status);
        int lucky_number = 14; // use int for whole numbers
        System.out.println("My lucky number is " + lucky_number);

        Scanner scanner = new Scanner(System.in); //create new scanner
        System.out.println("Please enter a number: "); 
        double userInput = Double.parseDouble(scanner.nextLine());
        if(userInput > 0){
            System.out.println("Square root of the input is " + Math.sqrt(userInput));
         } else {
            System.out.println("Error: Number is not positive");
        }
        scanner.close(); //close the scanner

        



    }

    public static void RockPaperScissorGame() {
    Scanner scanner = new Scanner(System.in);
         //1 = scissors, 2 = rock, 3 = paper
        System.out.println("Please enter a number 0 - 2: ");
        int userInput = scanner.nextInt();
        int computerInput = (int) (Math.random() * 3) + 1;
        
        if (userInput == 1 && computerInput == 2) {
            System.out.println("Computer won. Rock beats scissors");
        }
 
        if (userInput == 1 && computerInput == 3) {
            System.out.println("User won. Scissors beats paper");
        }
 
        if (userInput == 2 && computerInput == 3) {
            System.out.println("Computer won. Paper beats rock");
        }
 
        if (userInput == 2 && computerInput == 1) {
            System.out.println("User won. Rock beats scissors");
        }
 
        if (userInput == 3 && computerInput == 1) {
            System.out.println("Computer won. Scissors beats paper");
        }
 
        if (userInput == 3 && computerInput == 2) {
            System.out.println("User won. Paper beats rock");
        }
 
        if ((userInput == 1 && computerInput == 1) ||
        (userInput == 2 && computerInput == 2) ||
                (userInput == 3 && computerInput == 3)) {
            System.out.println("Nobody won. There is a tie");
        }
        scanner.close();

        //RockPaperScissorGame();
        System.out.println("Count of Vowels " + CountOfVowels(student_name));
          
        // int power = 1;
        //for (int i = 5; i <= 7; i++) {
        //    System.out.println(i + " " + power);
       //     power = 2 * power;
        //}


}


    public static int CountOfVowels(String word) {
        char[] letters = word.toCharArray();
        int count = 0;
 
        for (int i = 0; i < letters.length; i++) {
            char letter = letters[i];
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                count++;
            }
        }
 
        return count;
    }
        
}

