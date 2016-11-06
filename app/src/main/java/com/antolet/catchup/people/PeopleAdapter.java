package com.antolet.catchup.people;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.antolet.catchup.R;

import java.util.List;
import java.util.Random;


/**
 * Created by luca on 06/11/16.
 */
public class PeopleAdapter extends RecyclerView.Adapter {

    List<PersonImpl> list;

    public PeopleAdapter(List<PersonImpl> newList) {
        this.list = newList;

    }

    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.d("peopleAdapter", "onCreateViewHolder: ");
        View person_card = LayoutInflater.
                from(parent.getContext()).
                inflate(R.layout.person_card, parent, false);

        return (new PersonViewHolder(person_card));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Log.d("peopleAdapter", "onBindViewHolder: " + holder.toString());
        Log.d("peopleAdapter", "onBindViewHolder: ");
        PersonViewHolder personHolder = (PersonViewHolder) holder;
        Log.d("DOPO IL CAST", "onBindViewHolder: " + personHolder.toString());
        PersonImpl person = list.get(position);
        personHolder.vName.setText(person.getName());
        personHolder.vSex.setText("Sesso: " + person.getSex());
        personHolder.vImage.setImageResource(person.getResourceId());
        personHolder.vInfo.setText("At " + String.valueOf(getRandomNumber()) + "m from you");
    }

    private int getRandomNumber() {
        Random ran = new Random();
        int r = ran.nextInt(100);
        return r;
    }


    @Override
    public int getItemCount() {
        return list.size();
    }
}
