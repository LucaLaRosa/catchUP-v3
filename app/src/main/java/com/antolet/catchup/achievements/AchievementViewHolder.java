package com.antolet.catchup.achievements;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.antolet.catchup.R;

import static android.content.ContentValues.TAG;

/**
 * Created by luca on 05/11/16.
 */

class AchievementViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView vTitle;
    public ImageView vImage;

    public AchievementViewHolder(View itemView) {
        super(itemView);

        itemView.setOnClickListener(this);
        vTitle = (TextView) itemView.findViewById(R.id.textView);
        vImage = (ImageView) itemView.findViewById(R.id.imageView);


    }

    @Override
    public void onClick(View v) {
        Log.d(TAG, "onClick: cliccato bonus " + vTitle.getText());





    }

}



