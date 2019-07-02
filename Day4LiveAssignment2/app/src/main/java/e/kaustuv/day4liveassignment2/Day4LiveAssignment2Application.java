// The class which extends Application

package e.kaustuv.day4liveassignment2;

import android.app.Application;

import io.realm.Realm;

public class Day4LiveAssignment2Application extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
    }
}
