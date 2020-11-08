package com.example.contactsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.provider.ContactsContract;

import java.util.ArrayList;
import java.util.List;


public class FriendsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends);

        final List<ContactsModel> Friends = new ArrayList<>();

        Friends.add(new ContactsModel("Avinash", "Avinash@gmail.com", "875668777", R.drawable.male_image));
        Friends.add((new ContactsModel("Arvind", "Arvind@gmail.com", "6997675609", R.drawable.male_image)));
        Friends.add((new ContactsModel("Sita", "Sita@gamil.com", "9888989343",R.drawable.female_image)));
        Friends.add(new ContactsModel("Rossi", "Rossi@gmail.com", "3433468777", R.drawable.female_image));
        Friends.add((new ContactsModel("Ram", "Ram@gmail.com", "6434575609", R.drawable.male_image)));
        Friends.add((new ContactsModel("Lakki", "Lakki@gamil.com", "7387389343",R.drawable.female_image)));
        Friends.add(new ContactsModel("Niranth", "Niranth@gmail.com", "8263868777", R.drawable.male_image));
        Friends.add((new ContactsModel("Kholi", "Kholi@gmail.com", "76638675609", R.drawable.male_image)));
        Friends.add((new ContactsModel("Mandanna", "Mandanna@gamil.com", "98787989343",R.drawable.female_image)));
        Friends.add((new ContactsModel("Roy", "Roy@gmail.com", "89875789077", R.drawable.male_image)));

        RecyclerView Friends_RecyclerView = findViewById(R.id.recyclerView2);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        Friends_RecyclerView.setLayoutManager(layoutManager);

        ContactsAdopter contactsAdopter = new ContactsAdopter(this, Friends, R.color.color_Family);
        Friends_RecyclerView.setAdapter(contactsAdopter);

    }
}