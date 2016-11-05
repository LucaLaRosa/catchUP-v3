package com.antolet.catchup;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.antolet.catchup.contacts.ContactAdapter;
import com.antolet.catchup.people.PeopleAdapter;
import com.antolet.catchup.people.Person;

import java.util.List;

/**
 * Created by luca on 06/11/16.
 */

public class NearbyFragment extends Fragment {

    private List<Person> list;

    RecyclerView peopleRecycler;
    PeopleAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_nearby, container, false);

        //set the layout manager
        peopleRecycler = (RecyclerView) view.findViewById(R.id.personRecycler);
        peopleRecycler.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(getContext());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        peopleRecycler.setLayoutManager(llm);

        //set the adapter
        initializeList();
        adapter = new PeopleAdapter(list);
        peopleRecycler.setAdapter(adapter);

        return view;
    }

    private void initializeList() {

    }

}
