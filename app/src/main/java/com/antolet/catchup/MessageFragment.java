package com.antolet.catchup;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class MessageFragment extends android.support.v4.app.Fragment implements View.OnClickListener {

   // private RelativeLayout layoutMessage;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.message_fragment, container, false);

        (rootView.findViewById(R.id.btn_exit)).setOnClickListener(this);
        (rootView.findViewById(R.id.btn_send)).setOnClickListener(this);
        return rootView;


    }


    EditText mEdit;
    public void onClick(View v) {
        //Toast.makeText(getActivity(), "sasaprovasasa", Toast.LENGTH_SHORT).show();
        switch (v.getId()) {

            case R.id.btn_exit:
                getActivity().getSupportFragmentManager().beginTransaction().remove(this).commit();
                break;

            case R.id.btn_send:
                mEdit   = (EditText) getActivity().findViewById(R.id.contenutoMessaggio);
               // Toast.makeText(getActivity(),  mEdit.getText(), Toast.LENGTH_SHORT).show();

                TextView lastMsg= (TextView) getActivity().findViewById(R.id.last_msg);
                lastMsg.setText(mEdit.getText());
                lastMsg.setVisibility(View.VISIBLE);
                mEdit.setText("");


               /* layoutMessage.addView(lastMsg);
                ViewGroup.LayoutParams lparams = new ViewGroup.LayoutParams(
                        ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT


                );
                TextView tv=new TextView(getContext());
                tv.setLayoutParams(lparams);

                RelativeLayout layoutMessage = (RelativeLayout) getActivity().findViewById(R.id.relativeLayout);
                layoutMessage.addView(tv);
                break;
                */


            default:
                break;
        }


    }

}
