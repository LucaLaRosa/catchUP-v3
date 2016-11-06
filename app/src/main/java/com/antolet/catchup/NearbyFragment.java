package com.antolet.catchup;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.antolet.catchup.people.PeopleAdapter;
import com.antolet.catchup.people.Person;
import com.antolet.catchup.people.PersonImpl;

import java.util.LinkedList;
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
        list = new LinkedList<>();
        list.add(new PersonImpl("Luca", "M", R.drawable.person1));
        list.add(new PersonImpl("Giulia", "F", R.drawable.person2));
        list.add(new PersonImpl("Veronica", "F", R.drawable.person3));
        list.add(new PersonImpl("Antonio", "M", R.drawable.person4));
        list.add(new PersonImpl("Andrea", "M", R.drawable.person5));
        list.add(new PersonImpl("Carlo", "M", R.drawable.person6));
        list.add(new PersonImpl("Miriana", "F", R.drawable.person7));
        list.add(new PersonImpl("Marco", "M", R.drawable.person8));
        list.add(new PersonImpl("Guido", "M", R.drawable.person9));
        list.add(new PersonImpl("Chiara", "F", R.drawable.person10));

    }

}
