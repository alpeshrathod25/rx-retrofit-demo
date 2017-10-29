package connectingpixels.com.myapplication.network.request;

import java.util.Observable;

import connectingpixels.com.myapplication.network.response.MainResponse;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by alpesh on 29/10/17.
 */

public interface RequestBuilder {
    @GET("weather?")
    Call<MainResponse> getList(@Query("q") String city);
}
