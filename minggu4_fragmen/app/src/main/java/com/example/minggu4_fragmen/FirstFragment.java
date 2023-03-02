package com.example.minggu4_fragmen;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
//import androidx.fragment.app.Fragment;
import android.app.FragmentManager;
import android.app.Fragment;
import android.app.FragmentTransaction;
public class FirstFragment extends Fragment {
    View view;
    Button firstButton;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                              Bundle savedInstanceState){
        //infilate the layout for tgis fragment
        view = inflater.inflate(R.layout.fragment_first, container,false);
        //get the reference of button
        firstButton = view.findViewById(R.id.firstButton);
        //perform set onclicklistener on secondButton
        firstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //display a message
                Toast.makeText(getActivity(), "First Fragment", Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }
}
