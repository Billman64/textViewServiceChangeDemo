package billlugo.textviewservicechangedemo;

/**
 * Created by User on 6/26/2017.
 */

public class MyEvent {

    public int requestCode;

    public MyEvent(int requestCode, String message) {
        this.requestCode = requestCode;
        this.message = message;
    }

    public String message;

    public int getRequestCode() {
        return requestCode;
    }

    public void setRequestCode(int requestCode) {
        this.requestCode = requestCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public MyEvent() {

    }
}
