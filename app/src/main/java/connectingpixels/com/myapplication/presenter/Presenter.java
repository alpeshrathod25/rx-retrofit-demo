package connectingpixels.com.myapplication.presenter;

/**
 * Created by alpesh on 29/10/17.
 */

public interface Presenter<V extends MVPCallback> {
    void attachView(V view);
    void detachView();
}
