package nffodev.idk.net;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Question> questions = new ArrayList<>();

        questions.add(new Question("a", new Anwser[] {new AnwserCorrect("a"), new AnwserWrong("b")}));
        questions.add(new Question("b", new Anwser[] {new AnwserCorrect("b"), new AnwserWrong("a")}));

        int correctCount = 0;
        for (Question question : questions) {
            question.randomizeAnwsers();
            boolean validated = false;
            while (!validated) {
                question.print();
                try {
                    int input = Integer.parseInt(scanner.nextLine());
                    if (question.validate(input)) {
                        validated = true;
                        if ((question.anwsers.get(input-1)).isCorrect()) {
                            correctCount++;
                        }
                    } else {
                        System.out.println("Invalid anwser");
                    }
                } catch (Exception e) {
                    System.out.println("Invalid anwser");
                }
            }
        }

        System.out.println("Correct anwsers: " + correctCount+"/"+questions.size());
    }
}