package nffodev.idk.net;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Question> questions = new ArrayList<>();

        questions.add(new Question("Which of the following ingredients is not normally used to brew beer?", new Anwser[] {
                new AnwserWrong("Hops"),
                new AnwserWrong("Yeast"),
                new AnwserWrong("Malt"),
                new AnwserCorrect("Vinegar")
        }));

        questions.add(new Question("Which location is further east?", new Anwser[] {
                new AnwserWrong("New York, USA"),
                new AnwserCorrect("Santiago, Chile")
        }));

        questions.add(new Question("Substances that have a definite size and shape, and vibrating particles that are close together are:", new Anwser[] {
                new AnwserWrong("Liquids"),
                new AnwserWrong("Gases"),
                new AnwserCorrect("Solids")
        }));

        questions.add(new Question("What is the most densely populated U.S. state?", new Anwser[] {
                new AnwserCorrect("Connecticut"),
                new AnwserWrong("New Jersey"),
                new AnwserWrong("Rhode Island"),
                new AnwserWrong("Maryland")
        }));

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
            System.out.println();
        }

        System.out.println("Correct anwsers: " + correctCount+"/"+questions.size());
    }
}