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
    public TextView vInfo;

    public PersonViewHolder(View itemView) {
        super(itemView);

        this.vName =(TextView)itemView.findViewById(R.id.name);
        this.vImage =(ImageView)itemView.findViewById(R.id.image);
        this.vSex =(TextView)itemView.findViewById(R.id.sex);
        this.vInfo =(TextView) itemView.findViewById(R.id.info);

    }



}
