package nffodev.idk.net;

public class AnwserWrong extends Anwser {
    public boolean value = false;
    public AnwserWrong(String text) {
        this.text = text;
    }
    public boolean isCorrect() {
        return this.value;
    }
}