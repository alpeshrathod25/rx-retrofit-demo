package connectingpixels.com.myapplication.network;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by alpesh on 29/10/17.
 */

public abstract class CustomResponse<T> implements Callback<T> {

    public abstract void onSuccess(T t);
    public abstract void onError(T t);

    @Override
    public void onResponse(Call<T> call, Response<T> response) {

    }

    @Override
    public void onFailure(Call<T> call, Throwable t) {

    }
}
