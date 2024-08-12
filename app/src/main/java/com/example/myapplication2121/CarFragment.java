package com.example.myapplication2121;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication2121.databinding.FragmentCarBinding;

import java.util.ArrayList;


public class CarFragment extends Fragment {
    FragmentCarBinding binding;
    private ArrayList<Car> carList = new ArrayList<>();



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=FragmentCarBinding.inflate(getLayoutInflater());
        return binding.getRoot();
        }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initAdapter();
        CarAdaptor carAdapter = new CarAdaptor(carList);
        binding.rvCar.setAdapter(carAdapter);

    }

    private void initAdapter() {
        carList.add(new Car("https://news.store.rambler.ru/img/e43de71baa09aec20b7eb19ad23d2ee3?img-format=auto&img-1-resize=height:400,fit:max&img-2-filter=sharpen","машинка"));
        carList.add(new Car("https://i.ytimg.com/vi/WAPcGqXjneY/hq720.jpg?sqp=-oaymwEhCK4FEIIDSFryq4qpAxMIARUAAAAAGAElAADIQj0AgKJD&rs=AOn4CLBkg_r38mffbK67VDLmVXKaIGJ2qA","машина"));
        carList.add(new Car("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQmeVA7RIQ6PTYj4zpawHLNH-GX7TmoiEb-LA&s","грузовик"));
        carList.add(new Car("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR4C5e_0WZHhX4ESPFgpybAaKkH9QUdI5SPFw&s","машинка"));
        carList.add(new Car("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT9k3-lfdXSz9GL6FjmgFHQY4O9p0XV5ol5zw&s","машинка"));
        carList.add(new Car("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSEx3e3OmvnlkeMQKDMHCqvOHYiys2oVh5VgREfrps0VJ1BTYteizQTJry3OlFcUfS8-L8&usqp=CAU","МАСЕДЕС"));
        carList.add(new Car("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQM0bZZjkhOpGmW3A-SGKOu2H3g9jt-imVBSQ&s","грузовик"));
        carList.add(new Car("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSZa7dvqDyBpia6xK-qwQaPo5cvO9L7BXO-qw&s","грузовик"));
        carList.add(new Car("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT9KNxnIQ6_o4Y6lVj7S2t0BBERivjabJBITw&s","грузовик"));
        carList.add(new Car("https://avatars.dzeninfra.ru/get-zen_doc/9703229/pub_64787ba1a8deff0f31c35126_6478805396633a4a7210e42e/scale_1200","МАСЕДЕС"));
        carList.add(new Car("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS40-vMFpPB0gJ7ISyDviuxPuj-5pqkUsnBaQ&s","грузовик"));
        carList.add(new Car("https://news.store.rambler.ru/img/e43de71baa09aec20b7eb19ad23d2ee3?img-format=auto&img-1-resize=height:400,fit:max&img-2-filter=sharpen","МАСЕДЕС"));
        carList.add(new Car("https://i.ytimg.com/vi/WAPcGqXjneY/hq720.jpg?sqp=-oaymwEhCK4FEIIDSFryq4qpAxMIARUAAAAAGAElAADIQj0AgKJD&rs=AOn4CLBkg_r38mffbK67VDLmVXKaIGJ2qA","МАСЕДЕС"));
        carList.add(new Car("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQmeVA7RIQ6PTYj4zpawHLNH-GX7TmoiEb-LA&s","машинка"));
        carList.add(new Car("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR4C5e_0WZHhX4ESPFgpybAaKkH9QUdI5SPFw&s","машинка"));
        carList.add(new Car("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT9k3-lfdXSz9GL6FjmgFHQY4O9p0XV5ol5zw&s","машинка"));
        carList.add(new Car("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSEx3e3OmvnlkeMQKDMHCqvOHYiys2oVh5VgREfrps0VJ1BTYteizQTJry3OlFcUfS8-L8&usqp=CAU","МАСЕДЕС"));
        carList.add(new Car("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQM0bZZjkhOpGmW3A-SGKOu2H3g9jt-imVBSQ&s","машинка"));
        carList.add(new Car("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSZa7dvqDyBpia6xK-qwQaPo5cvO9L7BXO-qw&s","машинка"));
        carList.add(new Car("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT9KNxnIQ6_o4Y6lVj7S2t0BBERivjabJBITw&s","МАСЕДЕС"));
        carList.add(new Car("https://avatars.dzeninfra.ru/get-zen_doc/9703229/pub_64787ba1a8deff0f31c35126_6478805396633a4a7210e42e/scale_1200","МАСЕДЕС"));
        carList.add(new Car("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS40-vMFpPB0gJ7ISyDviuxPuj-5pqkUsnBaQ&s","МАСЕДЕС"));
    }
}