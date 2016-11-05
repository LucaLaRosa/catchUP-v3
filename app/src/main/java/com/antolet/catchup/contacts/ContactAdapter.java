package com.antolet.catchup.contacts;

/**
 * Created by luca on 05/11/16.
 */

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.antolet.catchup.R;

import java.util.List;

import static com.google.android.gms.wearable.DataMap.TAG;

/**
 * Created by luca on 06/08/16.
 */

public class ContactAdapter extends RecyclerView.Adapter<ContactViewHolder> {

    private List<ContactInfo> contactList;

    public ContactAdapter(List<ContactInfo> contactList){
        this.contactList = contactList;

    }

    @Override
    public ContactViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.d(TAG, "onCreateViewHolder: ");
        View itemView = LayoutInflater.
                from(parent.getContext()).
                inflate(R.layout.cardlist, parent, false);

        return new ContactViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ContactViewHolder holder, int position) {
        ContactInfo contactInfo = contactList.get(position);
        holder.vTitle.setText(contactInfo.getTitle());
        holder.vDistance.setText("distance" + String.valueOf(contactInfo.getDistance()) + " km from you");
        holder.vInfo.setText(contactInfo.getInfo());
        holder.vImageView.setImageResource(pickDrawable(contactInfo.getTitle()));

    }

    @Override
    public int getItemCount() {
        return contactList.size();

    }

    //TODO: bruttissimo, fatto solo per prova. Bisogna farlo con una Map<String,int>
    private int pickDrawable(String title) {

        switch (title) {
            case "punto blu": return R.drawable.r0;
            case "punto rosso": return R.drawable.r1;
            case "punto verde": return R.drawable.r2;
            case "punto giallo": return R.drawable.r3;
            case "punto viola": return R.drawable.r4;
            case "punto nero": return R.drawable.r5;
            default: return R.drawable.r0;

        }


    }


}