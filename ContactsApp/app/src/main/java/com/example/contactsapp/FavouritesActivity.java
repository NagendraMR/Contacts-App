package com.example.contactsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.media.Ringtone;
import android.os.Bundle;
import android.provider.ContactsContract;

import java.util.ArrayList;
import java.util.List;


public class FavouritesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourites);

        final  List<ContactsModel> Fav = new ArrayList<>();

        Fav.add(new ContactsModel("Kholi", "Kholi@gmail.com", "873837393739", R.drawable.male_image));
        Fav.add(new ContactsModel("ABD", "ABD@gmail.com", "8787292829", R.drawable.male_image));
        Fav.add(new ContactsModel("Mandhana", "Mandhana@gmail.com", "8787882982", R.drawable.female_image));

        Fav.add(new ContactsModel("Perry", "Perry@gmail.com", "788937393739", R.drawable.female_image));
        Fav.add(new ContactsModel("Joe", "Joe@gmail.com", "98978992829", R.drawable.male_image));
        Fav.add(new ContactsModel("Smithi", "Smithi@gmail.com", "87239882982", R.drawable.female_image));

        Fav.add(new ContactsModel("Dhoni", "Dhonii@gmail.com", "867837393739", R.drawable.male_image));
        Fav.add(new ContactsModel("DDP", "DDP@gmail.com", "9778992829", R.drawable.male_image));
        Fav.add(new ContactsModel("Midili", "Midili@gmail.com", "78657882982", R.drawable.female_image));
        Fav.add((new ContactsModel("Finch", "Finch@gmail.com", "87896970709", R.drawable.male_image)));

        RecyclerView Fav_RecyclerView = findViewById(R.id.recyclerView3);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        Fav_RecyclerView.setLayoutManager(layoutManager);

        ContactsAdopter contactsAdopter = new ContactsAdopter(this, Fav, R.color.color_Family);
        Fav_RecyclerView.setAdapter(contactsAdopter);


    }
}