package com.kaustuv.realmassignment;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.RecyclerView;

import io.realm.Realm;
import io.realm.RealmResults;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private RealmResults<Person> mPersonRealmResults;
    private Context mconext;

    public MyAdapter(RealmResults<Person> person, Context context)
    {
        mPersonRealmResults=person;
        mconext=context;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item,parent,false);
        return new MyViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder,int position){
        Person person=mPersonRealmResults.get(position);
        holder.name.setText(person.getName());
        holder.dept.setText(person.getDept());
        holder.phone.setText(person.getPhone());
        holder.roll.setText(person.getRoll());
        holder.gender.setText(person.getGender());
        if(position%4==0)
            holder.relativeLayout.setBackgroundColor(Color.RED);note
        if(position%4==1)
            holder.relativeLayout.setBackgroundColor(Color.GREEN);
        if(position%4==2)
            holder.relativeLayout.setBackgroundColor(Color.YELLOW);
        if(position%4==3)
            holder.relativeLayout.setBackgroundColor(Color.BLUE);

    }
    @Override
    public int getItemCount(){return mPersonRealmResults.size();}
    public class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView name,roll,phone,dept,gender;
        private RelativeLayout relativeLayout;
        public MyViewHolder(@NonNull View itemView){
            super(itemView);

            name=itemView.findViewById(R.id.name_tv);
            dept=itemView.findViewById(R.id.dept_tv);
            phone=itemView.findViewById(R.id.phone_tv);
            roll=itemView.findViewById(R.id.roll_tv);
            gender=itemView.findViewById(R.id.gender_tv);
            relativeLayout=itemView.findViewById(R.id.category_image);
        }
    }





}
