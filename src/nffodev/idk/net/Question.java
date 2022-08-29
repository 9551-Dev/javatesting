package nffodev.idk.net;

import java.util.ArrayList;
import java.util.Collections;

public class Question {
    public String question;
    public ArrayList<Anwser> anwsers;

    public Question(String question, Anwser[] answers_in) {
        this.question = question;

        ArrayList<Anwser> anwsers = new ArrayList<>();
        Collections.addAll(anwsers,answers_in);

        this.anwsers = anwsers;
    }

    public void randomizeAnwsers() {
        Collections.shuffle(anwsers);
    }

    public void print() {
        System.out.println("Question: " + this.question);
        Integer index = 0;
        for (Anwser anwser : this.anwsers) {
            index++;
            System.out.println(index + ": " + anwser.text);
        }
    }

    public boolean validate(int n) {
        return n <= this.anwsers.size() && n > 0 ;
    }
}