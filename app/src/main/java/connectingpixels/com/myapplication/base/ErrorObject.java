package connectingpixels.com.myapplication.base;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by alpesh on 29/10/17.
 */

public class ErrorObject implements Parcelable {
    public ErrorObject(){

    }

    protected ErrorObject(Parcel in) {
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<ErrorObject> CREATOR = new Creator<ErrorObject>() {
        @Override
        public ErrorObject createFromParcel(Parcel in) {
            return new ErrorObject(in);
        }

        @Override
        public ErrorObject[] newArray(int size) {
            return new ErrorObject[size];
        }
    };
}
