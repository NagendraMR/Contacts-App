package com.example.contactsapp;

import androidx.recyclerview.widget.RecyclerView;

public class ContactsModel {
    String name , email , phoneNo;
    int imageResId = 0;

    public ContactsModel(String cName , String cEmail, String cPhoneNo, int cImageResId){
        this.name = cName;
        this.email = cEmail;
        this.phoneNo = cPhoneNo;
        this.imageResId = cImageResId;

    }

    public int getImageResId() {
        return imageResId;
    }

    public void setImageResId(int imageResId) {
        this.imageResId = imageResId;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}