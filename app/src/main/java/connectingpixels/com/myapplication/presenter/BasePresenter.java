package connectingpixels.com.myapplication.presenter;

/**
 * Created by alpesh on 29/10/17.
 */

public class BasePresenter<T extends MVPCallback> implements Presenter<T> {
    private T mMVPView;

    public static class MVPViewNotAttachedException extends RuntimeException {
        public MVPViewNotAttachedException() {
            super("Please call Presenter.attachView(MvpView) before requesting data to the Presenter");
        }
    }

    @Override
    public void attachView(T view) {
        this.mMVPView = view;
    }

    @Override
    public void detachView() {
        this.mMVPView = null;
    }

    public boolean isViewAttached() {
        return this.mMVPView != null;
    }

    public T getMVPView() {
        return this.mMVPView;
    }

    public void checkViewAttached() {
        if (!isViewAttached()) {
            throw new MVPViewNotAttachedException();
        }
    }
}
