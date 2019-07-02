package e.kaustuv.day4liveassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String REGEX_STORE="RegexStore";
    private SharedPreferences sharedPreferences;
    private Context mContext;
    EditText Name,Email,PhoneNo,Age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;
    }

    public void onSubmitPressed(View view)
    {
        Name=findViewById(R.id.main_name_et);
        Email=findViewById(R.id.main_email_et);
        PhoneNo=findViewById(R.id.main_phone_et);
        Age=findViewById(R.id.main_age_et);

        sharedPreferences = mContext.getSharedPreferences(REGEX_STORE, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();   //editor object to access the file

        editor.putString("name",Name.getText().toString());
        editor.putString("email",Email.getText().toString());
        editor.putString("phone",PhoneNo.getText().toString());
        String ageAsString = Age.getText().toString();
        if(!ageAsString.equalsIgnoreCase(""))
            editor.putInt("age",Integer.parseInt(Age.getText().toString()));
        editor.apply();

        Intent intent=new Intent(this, DisplayActivity.class);
        startActivity(intent);
    }
}
