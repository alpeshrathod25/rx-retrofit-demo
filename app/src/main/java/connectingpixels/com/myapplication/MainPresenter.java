package connectingpixels.com.myapplication;

import connectingpixels.com.myapplication.bridge.RxBus;
import connectingpixels.com.myapplication.network.NetworkHelper;
import connectingpixels.com.myapplication.presenter.BasePresenter;
import rx.Subscription;
import rx.functions.Action1;

/**
 * Created by alpesh on 29/10/17.
 */

public class MainPresenter extends BasePresenter<MainCallback> {
    Subscription subscription;

    @Override
    public void attachView(MainCallback view) {
        super.attachView(view);
        subscription = RxBus.getInstance().toObservable().subscribe(new Action1<Object>() {
            @Override
            public void call(Object o) {
                if (o instanceof MainEvent && isViewAttached()){
                    MainEvent event= (MainEvent) o;
                    if (event.error==null){
                        getMVPView().setResponse("Success");
                    }else {
                        getMVPView().setResponse("Failure");
                    }
                }
            }
        });
    }

    @Override
    public void detachView() {
        super.detachView();
        RxBus.getInstance().unSubscribe(subscription);
    }

    private void callApi() {
        NetworkHelper networkHelper = NetworkHelper.getInstance();
        networkHelper.callApi();

    }
}
