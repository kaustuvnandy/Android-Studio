package e.kaustuv.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    EditText txt1,txt2;
    Button butn;
    double res=0.0,a,b;
    TextView s;
    int opcode=4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1 = findViewById(R.id.number1);
        txt2 = findViewById(R.id.number2);
        s = findViewById(R.id.result);
        butn = findViewById(R.id.mode);
    }

    public void onMode(View view){
        String k="Mode\n\n";
        String l="";
        if(opcode==1)
        {
            opcode=2;
            l="Subtraction";
            butn.setText(k+l);
        }
        else if(opcode==2){
            opcode=3;
            l="Multiplication";
            butn.setText(k+l);
        }
        else if(opcode==3){
            opcode=4;
            l="Division";
            butn.setText(k+l);
        }
        else if(opcode==4){
            opcode=1;
            l="Addition";
            butn.setText(k+l);
        }


    }

    public void onCalculate(View view){

        a=Integer.parseInt(txt1.getText().toString());
        b=Integer.parseInt(txt2.getText().toString());

        if(opcode==1)
            res=a+b;
        else if(opcode==2)
            res=a-b;
        else if(opcode==3)
            res=a*b;
        else
            res=a/b;
        String z="";
        z=z+res;
        s.setText(z);
    }
}
