package com.example.myapplication2121;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.myapplication2121.databinding.ItemCarBinding;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CarAdaptor extends RecyclerView.Adapter<CarViwHolder> {

    private ArrayList<Car> carList;

    public CarAdaptor(ArrayList<Car> carList) {
        this.carList = carList;
    }

    @NonNull
    @Override
    public CarViwHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CarViwHolder(ItemCarBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull CarViwHolder holder, int position) {
        holder.onBind(carList.get(position));
    }

    @Override
    public int getItemCount() {
        return carList.size();
    }
}

class CarViwHolder extends RecyclerView.ViewHolder {
    ItemCarBinding binding;


    public CarViwHolder(ItemCarBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }
    public void onBind(Car car){
        binding.tvName.setText(car.getName());
        Glide.with(binding.imgCar).load(car.getImage()).into(binding.imgCar);
    }
}

