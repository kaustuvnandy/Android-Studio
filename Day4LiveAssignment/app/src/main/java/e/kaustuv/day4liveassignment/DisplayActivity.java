package e.kaustuv.day4liveassignment;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DisplayActivity extends AppCompatActivity {
    private TextView name,email,phone,age;
    private SharedPreferences sharedPreferences;
    private Context context;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        context=this;
        sharedPreferences=context.getSharedPreferences(MainActivity.REGEX_STORE ,Context.MODE_PRIVATE);
        name=findViewById(R.id.display_name_tv);
        email=findViewById(R.id.display_email_tv);
        phone=findViewById(R.id.display_phone_tv);
        age=findViewById(R.id.display_age_tv);

        name.setText("Your name is " + sharedPreferences.getString("name","null"));
        email.setText("Your email is "+ sharedPreferences.getString("email","null"));
        phone.setText("Your phone number is "+sharedPreferences.getString("phone","null"));
        age.setText("Your age is "+sharedPreferences.getInt("age",0));
    }
}
