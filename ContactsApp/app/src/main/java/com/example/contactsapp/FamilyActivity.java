package com.example.contactsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.provider.ContactsContract;

import java.util.ArrayList;
import java.util.List;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        final List<ContactsModel> Family = new ArrayList<>();
        Family.add(new ContactsModel("Mother", "Mother@gmail.com", "9988282928", R.drawable.female_image));
        Family.add(new ContactsModel("Father", "Father@gmail.com", "7293879338", R.drawable.male_image));
        Family.add(new ContactsModel("Elder Sister", "ElderSister@gamil.com", "6272936299", R.drawable.female_image));
        Family.add(new ContactsModel("Younger Sister", "YoungerSister@gamil.com", "7879383889", R.drawable.female_image));
        Family.add(new ContactsModel("Elder Brother", "ElderBrother@gamil.com", "9872936299", R.drawable.male_image));
        Family.add(new ContactsModel("Younger Brother", "YoungerBrother@gamil.com", "97779383889", R.drawable.male_image));
        Family.add(new ContactsModel("Ant", "Ant@gmail.com", "8988282928", R.drawable.female_image));
        Family.add(new ContactsModel("Uncle", "Uncle@gmail.com", "98793879338", R.drawable.male_image));
        Family.add(new ContactsModel("GrandMother", "GrandMother@gmail.com", "9988282928", R.drawable.female_image));
        Family.add(new ContactsModel("GrandFather", "GrandFather@gmail.com", "7293879338", R.drawable.male_image));

        RecyclerView Family_RecyclerView = findViewById(R.id.recyclerView1);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        Family_RecyclerView.setLayoutManager(layoutManager);

        ContactsAdopter contactsAdopter = new ContactsAdopter(this, Family, R.color.color_Family);
        Family_RecyclerView.setAdapter(contactsAdopter);





    }
}