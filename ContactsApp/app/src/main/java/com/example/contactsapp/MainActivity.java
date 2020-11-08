package com.example.contactsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//intent for Family_contacts
        TextView family = findViewById(R.id.Family_contacts);
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( MainActivity.this, FamilyActivity.class );
                startActivity(intent);
            }
        });
//intent for Friends_contact
        TextView friends = findViewById(R.id.Friends_Contact);
        friends.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,FriendsActivity.class);
                startActivity(intent);
            }
        });
//intent for Favourites_Contacts
        TextView favourites = findViewById(R.id.Favourites_Contacts);
        favourites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , FavouritesActivity.class);
                startActivity(intent);
            }
        });

    }
}
