package connectingpixels.com.myapplication.network;

import connectingpixels.com.myapplication.network.request.RequestBuilder;
import retrofit2.Response;

/**
 * Created by alpesh on 29/10/17.
 */

public class NetworkHelper {

    private static NetworkHelper sNetworkHelper;

    public static NetworkHelper getInstance(){
        if (sNetworkHelper==null)
            sNetworkHelper= new NetworkHelper();
        return sNetworkHelper;
    }

    public void callApi(){
        ((RequestBuilder)ClientGenerator.getInstance().createService(RequestBuilder.class)).getList("Ah").enqueue(new CustomResponse<Response>() {
            @Override
            public void onSuccess(Response response) {

            }

            @Override
            public void onError(Response response) {

            }
        });
    }
}
