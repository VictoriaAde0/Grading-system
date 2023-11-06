import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        while (true){

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter student's score: \n");
            int score = scanner.nextInt();
            char studentScore;

            if (score <= 100) {
                switch (score / 10) {
                    case 10:
                    case 9:
                        studentScore = 'A';
                        break;
                    case 8:
                        studentScore = 'B';
                        break;
                    case 7:
                        studentScore = 'C';
                        break;
                    case 6:
                        studentScore = 'D';
                        break;
                    default:
                        studentScore = 'F';
                }
            } else {
                studentScore = 'X';


            }

            System.out.println("Student's score: " + studentScore);

        }
    }
}