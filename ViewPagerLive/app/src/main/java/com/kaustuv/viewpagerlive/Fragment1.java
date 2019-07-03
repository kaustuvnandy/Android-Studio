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

public class Fragment1 extends Fragment {
    public  Fragment1(){

    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.layout_fragment1, container, false);
        Button button = view.findViewById(R.id.buttonOne);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Fragment One Clicked", Toast.LENGTH_SHORT).show();

            }
        });
        Log.i("frag","frag1 created");
        return view;
    }


    @Override
    public void onStop() {
        super.onStop();
        Log.i("frag","frag1 Stopped");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("frag","frag1 destroyed");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i("frag","frag1 destroyedView");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i("frag","frag1 detached");
    }
}
