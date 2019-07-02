package e.kaustuv.day4liveassignment2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import io.realm.Realm;
import io.realm.RealmResults;

import android.os.Bundle;
import android.widget.LinearLayout;

public class DisplayActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        mRecyclerView = findViewById(R.id.personRecycler);
        Realm realm = Realm.getDefaultInstance();
        RealmResults<Person> personRealmResults = realm.where(Person.class).findAll();
        MyAdapter myAdapter = new MyAdapter(personRealmResults,this);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayout.HORIZONTAL,false));
        mRecyclerView.setAdapter(myAdapter);
    }
}