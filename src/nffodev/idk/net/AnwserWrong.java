package nffodev.idk.net;

public class AnwserWrong extends Anwser {
    public AnwserWrong(String text) {
        this.text = text;
        this.value = false;
    }
    public boolean isCorrect() {
        return this.value;
    }
}