package connectingpixels.com.myapplication.network.request;

import java.util.Observable;

import connectingpixels.com.myapplication.network.response.MainResponse;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by alpesh on 29/10/17.
 */

public interface RequestBuilder {
    @GET("weather?")
    Call<MainResponse> getList(@Query("q") String city);

    /*@POST("users/{userId}/payment/orders")
    Call<BookingCreationResponse> bookingCreation(@Path("userId") String str, @Body BookingCreationRequest bookingCreationRequest, @Header("Authorization") String str2);

    @POST("users/{userId}/payment/modify")
    Call<BookingCreationResponse> bookingUpdation(@Path("userId") String str, @Body BookingCreationRequest bookingCreationRequest, @Header("Authorization") String str2);

    @PUT("users/{userId}/payment/cncl")
    Call<Object> callCancelPaymentApi(@Path("userId") String str, @Header("Authorization") String str2, @Body PaymentModeRequest paymentModeRequest);

    @GET("contactInfo")
    Call<ContactInfo> callContactInfoApi(@Query("type") String str);*/
}
