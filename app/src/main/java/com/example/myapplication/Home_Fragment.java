package com.example.myapplication;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;


public class Home_Fragment extends Fragment {


    ArrayList<FoodDetailModel> arrayFoodDetail;
    DatabaseReference databaseReference;
    TextView price;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home_, container, false);

        RecyclerView recycler = view.findViewById(R.id.recyclerFoodList);
        recycler.setLayoutManager(new LinearLayoutManager(getContext()));

        databaseReference = FirebaseDatabase.getInstance().getReference("Food Info");
        arrayFoodDetail = new ArrayList<>();

        RecyclerFoodItemAdapter myAdapter = new RecyclerFoodItemAdapter(this, arrayFoodDetail);
        recycler.setAdapter(myAdapter);

        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for(DataSnapshot dataSnapshot : snapshot.getChildren()){
                    FoodDetailModel info = dataSnapshot.getValue(FoodDetailModel.class);
                    arrayFoodDetail.add(info);
                }
                myAdapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        arrayFoodDetail.add(new FoodDetailModel(R.drawable.a,50,"Burger", "Fast Food"));
        arrayFoodDetail.add(new FoodDetailModel(R.drawable.dosa,80,"Dosa", "Regular"));
        arrayFoodDetail.add(new FoodDetailModel(R.drawable.frenchfry,20,"French Fry", "Fast Food"));
        arrayFoodDetail.add(new FoodDetailModel(R.drawable.friedchicken,120,"Fried Chicken", "Regular"));
        arrayFoodDetail.add(new FoodDetailModel(R.drawable.pudding,40,"Pudding", "Sweet"));
        arrayFoodDetail.add(new FoodDetailModel(R.drawable.rutimangso,150,"Ruti Mangso", "Regular"));
        arrayFoodDetail.add(new FoodDetailModel(R.drawable.singara,10,"Singara", "Fast Food"));
        arrayFoodDetail.add(new FoodDetailModel(R.drawable.somosa,10,"Somosa", "Fast Food"));
        arrayFoodDetail.add(new FoodDetailModel(R.drawable.tang,15,"Tang", "Drink"));
        arrayFoodDetail.add(new FoodDetailModel(R.drawable.noodles,35,"Noodles", "Regular"));
        arrayFoodDetail.add(new FoodDetailModel(R.drawable.waterbootle,12,"Water MUM 1 Ltr", "Drink"));


        return view;
    }
}