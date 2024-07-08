public class Grader {
    public static void main(String[] args) {
        double marks = -1;

        if (marks >= 93 && marks <= 100) {
            System.out.println("Grade is A");
            System.out.println("Passed exam");
        } else if (marks >= 85 && marks < 93) {
            System.out.println("Grade is B");
            System.out.println("Passed exam");
        } else if (marks >= 80 && marks < 85) {
            System.out.println("Grade is C");
            System.out.println("Passed exam");
        } else if (marks >= 75 && marks < 80) {
            System.out.println("Grade is D");
            System.out.println("Passed exam");
        } else if (marks >= 0 && marks < 75) {
            System.out.println("Grade is E");
            System.out.println("Fail exam");
        } else {
            System.out.println("Unknown value");
        }
    }
}
