package nffodev.idk.net;

public abstract class Anwser {
    public boolean value;
    public String text;
    public boolean isCorrect() {
        return this.value;
    }
}
