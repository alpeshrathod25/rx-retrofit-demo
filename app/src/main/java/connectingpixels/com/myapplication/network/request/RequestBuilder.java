package connectingpixels.com.myapplication.network.request;

import java.util.Observable;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by alpesh on 29/10/17.
 */

public interface RequestBuilder {
    @GET("weather?")
    Call<Response> getList(@Query("q") String city);
}
