package com.antolet.catchup.people;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.antolet.catchup.R;

/**
 * Created by luca on 06/11/16.
 */

public class PersonViewHolder extends RecyclerView.ViewHolder {

    public ImageView vImage;
    public TextView vName;
    public TextView vSex;
    public ImageView vImageView;

    public PersonViewHolder(View itemView) {
        super(itemView);


        vName =(TextView)itemView.findViewById(R.id.name);
        vImage =(ImageView)itemView.findViewById(R.id.image);
        vSex =(TextView)itemView.findViewById(R.id.sex);
        vImageView =(ImageView) itemView.findViewById(R.id.thumbnail);

    }



}
