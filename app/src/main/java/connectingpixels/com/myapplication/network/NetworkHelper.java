package connectingpixels.com.myapplication.network;

import connectingpixels.com.myapplication.base.ErrorObject;
import connectingpixels.com.myapplication.bridge.EventPublisher;
import connectingpixels.com.myapplication.network.request.RequestBuilder;
import connectingpixels.com.myapplication.network.response.MainResponse;
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
        ((RequestBuilder)ClientGenerator.getInstance().createService(RequestBuilder.class)).getList("Ah").enqueue(new CustomResponse<MainResponse>() {
            @Override
            public void onSuccess(MainResponse mainResponse) {

            }

            @Override
            public void onError(ErrorObject t) {

            }
        });
    }
}
