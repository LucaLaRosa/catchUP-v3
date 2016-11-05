package com.antolet.catchup;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.antolet.catchup.contacts.ContactAdapter;
import com.antolet.catchup.contacts.ContactInfo;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by luca on 05/11/16.
 */

public class ThirdFragment extends android.support.v4.app.Fragment {

    //arriva da un datasource
    private List<ContactInfo> list;

    RecyclerView recList;
    ContactAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_third, container, false);

        //set the layout manager
        recList = (RecyclerView) view.findViewById(R.id.cardList);
        recList.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(getContext());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recList.setLayoutManager(llm);

        //set the adapter
        initializeList();
        adapter = new ContactAdapter(list);
        recList.setAdapter(adapter);

        return view;
    }

    private void initializeList() {
        list = new LinkedList<>();
        list.add(new ContactInfo("punto AAA", 14, "tutto molto buono"));
        list.add(new ContactInfo("punto verde", 99, "tutto molto cattivo"));
        list.add(new ContactInfo("punto blu", 4, "tutto molto buonino"));
        list.add(new ContactInfo("punto giallo", 1, "tutto molto accattivante"));
        list.add(new ContactInfo("punto cacca", 144, "tutto molto schifo"));
        list.add(new ContactInfo("punto viola", 124, "tutto molto franco"));
        list.add(new ContactInfo("punto nero", 149, "tutto molto antolet"));

    }

}