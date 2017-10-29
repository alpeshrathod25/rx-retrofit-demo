package connectingpixels.com.myapplication.bridge;

import connectingpixels.com.myapplication.MainEvent;

/**
 * Created by alpesh on 29/10/17.
 */

public class EventPublisher {

    private static EventPublisher mInstance;

    public static EventPublisher getInstance() {
        if (mInstance == null) {
            mInstance = new EventPublisher();
        }
        return mInstance;
    }

    public final void setResult(String error,String result){
        MainEvent event=new MainEvent();
        event.error=error;
        event.result=result;
        RxBus.getInstance().send(event);
    }
}
