package e.kaustuv.day3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButton1press(View view)
    {
        FragmentManager fm = getSupportFragmentManager();
        //fm.beginTransaction();
        FragmentTransaction ft=fm.beginTransaction();
        ft.add(R.id.empty_container,new FirstFragment());
        ft.addToBackStack(null);   //
        ft.commit();
    }
    public void onButton2press(View view)
    {
    FragmentManager fm=getSupportFragmentManager();
    FragmentTransaction ft=fm.beginTransaction();
    Fragment fragment= new SecondFragment();
    ft.replace(R.id.empty_container,fragment);
    ft.addToBackStack(null);
    ft.commit();
    }
    public void onButton3press(View view)
    {
        FragmentManager fm=getSupportFragmentManager();
        Fragment fragment=fm.findFragmentById(R.id.empty_container);
        FragmentTransaction ft=fm.beginTransaction();
        ft.remove(fragment);
        ft.addToBackStack(null);
        ft.commit();
    }
    public void onButton4press(View view)
    {
        FragmentManager fm=getSupportFragmentManager();
        fm.popBackStack();
    }
}
