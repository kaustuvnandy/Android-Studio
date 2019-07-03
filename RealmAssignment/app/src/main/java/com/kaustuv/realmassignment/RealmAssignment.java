package com.kaustuv.realmassignment;

import android.app.Application;

import io.realm.Realm;

public class RealmAssignment extends Application {

    @Override
    public void onCreate(){
        super.onCreate();
        Realm.init(this);
    }
}
