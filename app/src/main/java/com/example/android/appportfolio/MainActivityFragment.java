package com.example.android.appportfolio;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        Button btn1 = (Button) rootView.findViewById(R.id.app_1);
        btn1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                Toast.makeText(getActivity(), "This button will launch my popular movies app!" , Toast.LENGTH_SHORT ).show();
            }
        });

        Button btn2 = (Button) rootView.findViewById(R.id.app_2);
        btn2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getActivity(), "This button will launch my scores app!", Toast.LENGTH_SHORT).show();
            }
        });

        Button btn3 = (Button) rootView.findViewById(R.id.app_3);
        btn3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getActivity(), "This button will launch my library app!", Toast.LENGTH_SHORT).show();
            }
        });

        Button btn4 = (Button) rootView.findViewById(R.id.app_4);
        btn4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getActivity(), "This button will launch my build it bigger app!", Toast.LENGTH_SHORT).show();
            }
        });

        Button btn5 = (Button) rootView.findViewById(R.id.app_5);
        btn5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getActivity(), "This button will launch my xyz reader app!", Toast.LENGTH_SHORT).show();
            }
        });

        Button btn6 = (Button) rootView.findViewById(R.id.app_6);
        btn6.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getActivity(), "This button will launch my own app!", Toast.LENGTH_SHORT).show();
            }
        });


        return rootView;
    }
}
