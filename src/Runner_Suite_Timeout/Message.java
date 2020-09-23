package Runner_Suite_Timeout;

public class Message {

    String msg;

    public Message(String msg) {
        this.msg = msg;
    }

    public String getMessage() {
        return msg;
    }

    public String getMessageWithPrefix() {
        return "Hi "+msg;
    }

    public void waitInfinite() {
//        while(true);
    }
}
