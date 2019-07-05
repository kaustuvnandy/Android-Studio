package com.kaustuv.intentserviceslive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.EventLog;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.textView);
        EventBus.getDefault().register(this);
    }
    public void onButtonPressed(View view){
        Intent intent = new Intent(this,MyIntentService.class);
        //intent.putExtra("sleepTime",2000);
        Bundle b=new Bundle();
        b.putInt("sleepTime",2000);
        intent.putExtra("bundle",b);
        startService(intent);
    }
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMsgReceived(Pojo pojo){

        Toast.makeText(this,pojo.getName()+" Current Thread "+Thread.currentThread().getName(),Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

}

