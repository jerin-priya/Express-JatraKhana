package com.example.myapplication;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Address_Fragment extends Fragment {

//    TrainAddress trainAddress = new TrainAddress();
//
//    String name = trainAddress.name;
//    String date = trainAddress.date;
//    String choseClass = trainAddress.choseClass;
//    String bogi = trainAddress.bogi;
//    String seat = trainAddress.seat;
//
    TextView trainname;
    TextView traindate;
    TextView trainclass;
    TextView trainbogi;
    TextView trainseat;

    public Address_Fragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_address_, container, false);

        trainname = view.findViewById(R.id.txtTrainName);
        traindate = view.findViewById(R.id.txtDate);
        trainclass = view.findViewById(R.id.txtClass);
        trainbogi = view.findViewById(R.id.txtBogi);
        trainseat = view.findViewById(R.id.txtSeat);

        trainname.setText("Kalni");
        traindate.setText("12-12-2022");
        trainclass.setText("AC Cabin");
        trainbogi.setText("Kha");
        trainseat.setText("12");
//
//        System.out.println(name);
//        System.out.println(date);
        return view;
    }

}