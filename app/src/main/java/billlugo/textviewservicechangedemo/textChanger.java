package billlugo.textviewservicechangedemo;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;

import org.greenrobot.eventbus.EventBus;


public class textChanger extends IntentService {

    public textChanger() {
        super("asdf");
        Log.d("textChanger", "started textChanger event");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        EventBus.getDefault().post(new MyEvent(1,"hello"));
    }
}