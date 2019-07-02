package e.kaustuv.day4liveassignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import io.realm.Realm;

public class MainActivity extends AppCompatActivity {

    private Context mcontext;
    private EditText name,email,phone,age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mcontext=this;
        name=findViewById(R.id.main_name_et);
        email=findViewById(R.id.main_email_et);
        phone=findViewById(R.id.main_phone_et);
        age=findViewById(R.id.main_age_et);
    }
    public void onSubmitPressed(View view)
    {
        Realm realm = Realm.getDefaultInstance();
        realm.beginTransaction();
        try{
            Person person=realm.createObject(Person.class, System.currentTimeMillis()/1000);
            /*
            Dog d=new Dog();
            realm.copyToRealm(d);
             */
            person.setName(name.getText().toString());
            person.setEmail(email.getText().toString());
            person.setPhone(phone.getText().toString());
            person.setAge(Integer.parseInt(age.getText().toString()));
            realm.commitTransaction();
            Toast.makeText(mcontext,"Success",Toast.LENGTH_LONG).show();
        }
        catch (Exception ex){
            realm.cancelTransaction();
            Toast.makeText(mcontext,"Failure" + ex.getMessage(),Toast.LENGTH_LONG).show();
        }
        realm.close();
    }
    public void onDisplayButtonPressed(View view)
    {
        Intent intent=new Intent(this, DisplayActivity.class);
        startActivity(intent);
    }
}
