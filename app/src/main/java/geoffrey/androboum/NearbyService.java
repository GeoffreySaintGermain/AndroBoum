package geoffrey.androboum;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.nearby.Nearby;
import com.google.android.gms.nearby.connection.AdvertisingOptions;
import com.google.android.gms.nearby.connection.DiscoveryOptions;

public class NearbyService extends Service  {
    private GoogleApiClient mGoogleApiClient;
    final String SERVICE_ID = "123";

    public NearbyService() {
        mGoogleApiClient = new GoogleApiClient.Builder(this).build();
        if(mGoogleApiClient.isConnected()){
            onConnect();
        }
    }

    private void onConnect(){





    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

}
