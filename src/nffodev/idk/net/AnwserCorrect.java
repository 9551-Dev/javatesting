package nffodev.idk.net;

public class AnwserCorrect extends Anwser {
    public AnwserCorrect(String text) {
        this.text = text;
        this.value = true;
    }

    public boolean isCorrect() {
        return this.value;
    }
}