package com.antolet.catchup.achievements;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.antolet.catchup.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by luca on 05/11/16.
 */

public class AchievementsAdapter extends RecyclerView.Adapter<AchievementViewHolder> {

    private final String TAG = "AchievementAdapter";

    private Context context;

    private List<AchievementImpl> achievementList;

    public AchievementsAdapter(Context context) {
        Log.d(TAG, "AchievementsAdapter: ");
        initializeAchievements();
        this.context = context;

    }

    private void initializeAchievements() {
        Log.d(TAG, "initializeAchievements: ");
        this.achievementList = new ArrayList<>();
        this.achievementList.add(new AchievementImpl("cerchio più grande", R.drawable.one));
        this.achievementList.add(new AchievementImpl("lista amici più lunga", R.drawable.two));
        this.achievementList.add(new AchievementImpl("bonus 3", R.drawable.three));
        this.achievementList.add(new AchievementImpl("bonus 4", R.drawable.four));
        this.achievementList.add(new AchievementImpl("bonus 5", R.drawable.five));
        this.achievementList.add(new AchievementImpl("bonus 6", R.drawable.one));
        this.achievementList.add(new AchievementImpl("bonus 7", R.drawable.two));
        this.achievementList.add(new AchievementImpl("bonus 8", R.drawable.three));
        this.achievementList.add(new AchievementImpl("bonus 9", R.drawable.four));
        this.achievementList.add(new AchievementImpl("bonus 10", R.drawable.five));
        this.achievementList.add(new AchievementImpl("bonus 11", R.drawable.one));
        this.achievementList.add(new AchievementImpl("bonus 12", R.drawable.two));

    }


    @Override
    public AchievementViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Log.d(TAG, "onCreateViewHolder: ");

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.achievement, null);

        return (new AchievementViewHolder(layoutView));

    }

    @Override
    public void onBindViewHolder(AchievementViewHolder holder, int position) {

        Log.d(TAG, "onBindViewHolder: ");

        holder.vTitle.setText(achievementList.get(position).getName());
        holder.vImage.setImageResource(achievementList.get(position).getImage());


    }

    @Override
    public int getItemCount() {

        Log.d(TAG, "getItemCount: ");
        return achievementList.size();

    }

}