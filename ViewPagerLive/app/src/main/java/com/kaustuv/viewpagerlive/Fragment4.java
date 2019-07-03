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

public class Fragment4 extends Fragment {
    public Fragment4(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.layout_fragment4,container,false);
        Button button = view.findViewById(R.id.bt4Id);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Fragment Four Clicked", Toast.LENGTH_SHORT).show();
            }
        });
        Log.i("frag","frag4 created");
        return view;
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("frag","frag4 destroyed");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("frag","frag4 stopped");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i("frag","frag4 destroyedView");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i("frag","frag4 detached");
    }
}