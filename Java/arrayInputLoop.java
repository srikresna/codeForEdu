import java.util.Scanner;

public class arrayInputLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] finalScore = new int[6];

        for (int i = 0; i < finalScore.length; i++) {
            System.out.print("Enter the final score " + i + ": ");
            finalScore[i] = sc.nextInt();
        }
        for (int i = 0; i < finalScore.length; i++) {
            if (finalScore[i] > 70) {
            System.out.println("Student " + i + " Passed");
            } else {
                System.out.println("Student " + i + " Failed");
            }
        }
    }
}
