package e.kaustuv.day3assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Switch switch1;
    RadioGroup radiogroup;
    RadioButton disabled,enabled,t;
    ImageView imageview;
    TextView tv1,tv2;
    CheckBox chkbx;
    ImageButton imagebutton;
    Button refresh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        switch1=findViewById(R.id.switch1);
        switch1.setChecked(true);
        imageview=findViewById(R.id.imageView);

        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    imageview.setVisibility(View.VISIBLE);
                }
                else{
                    imageview.setVisibility(View.INVISIBLE);
                }
            }
        });

        chkbx=findViewById(R.id.checkBox);
        imagebutton=findViewById(R.id.imageButton);
        tv1=findViewById(R.id.tv1);
        tv2=findViewById(R.id.tv2);
        chkbx.setChecked(true);

        chkbx.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    imagebutton.setVisibility(View.VISIBLE);
                else
                    imagebutton.setVisibility(View.INVISIBLE);
            }
        });

        radiogroup=findViewById(R.id.radioGroup);
        enabled=findViewById(R.id.Enabled);
        enabled.setChecked(true);

        refresh=findViewById(R.id.button);
    }

    public void onClickRadioButton(View v) {
        int radioId=radiogroup.getCheckedRadioButtonId();
        t=findViewById(radioId);
        if(t.getText().toString().equals("Enabled"))
            imagebutton.setClickable(true);
        else
            imagebutton.setClickable(false);
    }

    public void onClickRefresh(View v)
    {
        switch1.setChecked(true);
        enabled.setChecked(true);
        chkbx.setChecked(true);
        tv1.setText("");
        tv2.setText("");
    }
    public void onClickImgButton(View view){
        tv1.setText("IMAGE BUTTON");
    }
    public void onClickImgView(View View){
        tv2.setText("IMAGE VIEW");
    }
}
