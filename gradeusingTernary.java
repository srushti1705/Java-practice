public class gradeusingTernary {
    public static void main(String[] args) {
        int marks = 45;

        String grade = (marks >= 90) ? "A" :
                       (80 >= marks && marks <= 89) ? "B" :
                       (70 >= marks && marks <= 79) ? "C" : "F";

        System.out.println("Grade: " + grade);
    }
}
