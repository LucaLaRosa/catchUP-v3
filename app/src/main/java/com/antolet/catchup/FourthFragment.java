package com.antolet.catchup;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.antolet.catchup.achievements.AchievementsAdapter;

import static android.content.ContentValues.TAG;

/**
 * Created by luca on 05/11/16.
 */

public class FourthFragment extends android.support.v4.app.Fragment {

    //achievements
    RecyclerView recList;
    AchievementsAdapter adapter;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate: ");
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView: ");

        View view = inflater.inflate(R.layout.fragment_fourth, container, false);

        //set the layout manager
        recList = (RecyclerView) view.findViewById(R.id.achievementRecycler);
        recList.setHasFixedSize(true);
        RecyclerView.LayoutManager staggeredManager = new StaggeredGridLayoutManager(3, 1);
        recList.setLayoutManager(staggeredManager);

        //set the adapter
        adapter = new AchievementsAdapter(this.getContext());
        recList.setAdapter(adapter);

        Log.d(TAG, "onCreateView: conto elementi adapter " +
                recList.getAdapter().getItemCount());

        return view;
    }
}