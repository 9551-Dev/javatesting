package nffodev.idk.net;

public class AnwserCorrect extends Anwser {
    public boolean value = true;
    public AnwserCorrect(String text) {
        this.text = text;
    }

    public boolean isCorrect() {
        return this.value;
    }
}