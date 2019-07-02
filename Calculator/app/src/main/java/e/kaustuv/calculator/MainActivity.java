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
    int opcode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void onPlus(View view){
        opcode=1;
    }
    public void onMinus(View view){
        opcode=2;
    }
    public void onMultiply(View view){
        opcode=3;
    }
    public void onDivide(View view){
        opcode=4;
    }
    public void onCalculate(View view){
        txt1=findViewById(R.id.number1);
        txt2=findViewById(R.id.number2);
        s=findViewById(R.id.result);
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
