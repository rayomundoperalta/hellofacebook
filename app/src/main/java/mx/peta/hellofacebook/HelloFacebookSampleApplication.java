package mx.peta.hellofacebook;

/**
 * Created by rayo on 11/15/16.
 */

import android.app.Application;

import com.facebook.AccessToken;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;

public class HelloFacebookSampleApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FacebookSdk.sdkInitialize(getApplicationContext());
        AppEventsLogger.activateApp(this);
        AccessToken accessToken = AccessToken.getCurrentAccessToken();
    }
}
