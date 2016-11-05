package com.antolet.catchup.people;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by luca on 06/11/16.
 */
public class PeopleAdapter extends RecyclerView.Adapter {

    List<Person> list;

    public PeopleAdapter(List<Person> newList) {
        this.list = newList;

    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
