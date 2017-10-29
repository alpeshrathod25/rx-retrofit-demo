package connectingpixels.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements MainCallback {

    MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainPresenter = new MainPresenter();
        if (!mainPresenter.isViewAttached())
            mainPresenter.attachView(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        if (!mainPresenter.isViewAttached())
            mainPresenter.attachView(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (mainPresenter != null)
            mainPresenter.detachView();
    }

    @Override
    public void hideProgressbar() {

    }

    @Override
    public void showProgressbar() {

    }

    @Override
    public void setResponse(String response) {

    }

    @Override
    public void setError(String error) {

    }
}
