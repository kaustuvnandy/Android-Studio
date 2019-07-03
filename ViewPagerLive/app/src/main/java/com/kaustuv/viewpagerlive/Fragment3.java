package com.kaustuv.viewpagerlive;

import android.os.Bundle;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment3 extends Fragment {
    public Fragment3 (){

    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.layout_fragment3, container, false);
        Button button = rootView.findViewById(R.id.buttonThree);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"Fragment Three Clicked", Toast.LENGTH_SHORT).show();
            }
        });
        Log.i("frag","frag3 created");
        return  rootView;
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("frag","frag3 destroyed");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("frag","frag3 stopped");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i("frag","frag3 destroyedView");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i("frag","frag3 detached");
    }
}
