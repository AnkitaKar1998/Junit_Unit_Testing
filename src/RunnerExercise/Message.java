package RunnerExercise;

public class Message {

    String msg;

    Message(String msg) {
        this.msg = msg;
    }

    public String getMessage() {
        return msg;
    }

    public String getMessageWithPrefix() {
        return "Hi "+msg;
    }
}
