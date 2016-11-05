package com.antolet.catchup;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MessageFragment extends android.support.v4.app.Fragment implements View.OnClickListener {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.message_fragment, container, false);
        (rootView.findViewById(R.id.btn_exit)).setOnClickListener(this);
        return rootView;
    }



    public void onClick(View v) {
        //Toast.makeText(getActivity(), "sasaprovasasa", Toast.LENGTH_SHORT).show();


        getActivity().getSupportFragmentManager().beginTransaction().remove(this).commit();
    }

}
