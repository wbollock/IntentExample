package wbollock.com.intentexample;


import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;

public class BuckysIntentService extends IntentService{

    private static final String TAG ="wbollock.com.intentexample";

    public BuckysIntentService() {
        super("BuckysIntentService");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        //this is what the service will actually do
        Log.i(TAG, "The service has now started");
    }

}

