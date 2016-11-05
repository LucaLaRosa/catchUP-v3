package com.antolet.catchup.contacts;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.antolet.catchup.R;

/**
 * Created by luca on 05/11/16.
 */

public class ContactViewHolder extends RecyclerView.ViewHolder {
    protected TextView vTitle;
    protected TextView vDistance;
    protected TextView vInfo;
    protected ImageView vImageView;


    public ContactViewHolder(View itemView) {
        super(itemView);

        vTitle =(TextView)itemView.findViewById(R.id.title);
        vDistance =(TextView)itemView.findViewById(R.id.distance);
        vInfo =(TextView)itemView.findViewById(R.id.info);
        vImageView =(ImageView) itemView.findViewById(R.id.thumbnail);


    }
}