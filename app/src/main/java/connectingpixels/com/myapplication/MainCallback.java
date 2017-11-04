package connectingpixels.com.myapplication;

import connectingpixels.com.myapplication.base.ErrorObject;
import connectingpixels.com.myapplication.presenter.MVPCallback;

/**
 * Created by alpesh on 29/10/17.
 */

public interface MainCallback extends MVPCallback {
    void setResponse(String response);

    void setError(ErrorObject error);
}
