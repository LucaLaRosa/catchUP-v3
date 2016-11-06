package com.antolet.catchup.people;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.antolet.catchup.R;
import com.antolet.catchup.contacts.ContactInfo;
import com.antolet.catchup.contacts.ContactViewHolder;

import java.util.List;


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

        return new PersonViewHolder(person_card);
    }

    @Override
    public void onBindViewHolder(PersonViewHolder personHolder, int position) {
        PersonImpl person = list.get(position);
        personHolder.vName.setText(person.getName());
        personHolder.vSex.setText("Sesso: " + person.getSex());
        personHolder.vImageView.setImageResource(person.getResourceId());
    }


    @Override
    public int getItemCount() {
        return list.size();
    }
}
