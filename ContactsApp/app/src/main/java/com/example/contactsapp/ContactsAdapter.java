package com.example.contactsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

class ContactsAdopter extends RecyclerView.Adapter<ContactsAdopter.ContactViewHolder>{
    private Context context;
    private final List<ContactsModel> contactsModelList;
    private int colorResId;


    public ContactsAdopter(Context context, List<ContactsModel> list, int colorResId){
        this.context = context;
        this.contactsModelList= list;
        this.colorResId = colorResId;

    }
    @NonNull @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_item, parent, false);
        ContactViewHolder ContactViewHolder= new ContactViewHolder(view);


        return ContactViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder holder, int position) {
        ContactViewHolder.Name.setText(contactsModelList.get(position).getName());
        ContactViewHolder.PhoneNo.setText(contactsModelList.get(position).getPhoneNo());
        ContactViewHolder.Email.setText(contactsModelList.get(position).getGmail());
        ContactViewHolder.image.setImageResource(contactsModelList.get(position).getImageResId());


        int color= ContextCompat.getColor(context, colorResId);
        holder.textContainer.setBackgroundColor(color);
    }

    @Override
    public int getItemCount() { return contactsModelList.size(); }

    static class ContactViewHolder extends RecyclerView.ViewHolder{

        static TextView Name;
        static TextView PhoneNo;
        static TextView Email;
        static ImageView image;
        View textContainer;

        public ContactViewHolder(@NonNull View itemView) {
            super(itemView);
            Name = itemView.findViewById(R.id.tv1);
            PhoneNo=itemView.findViewById(R.id.tv2);
            Email =itemView.findViewById(R.id.tv2);
            image=itemView.findViewById(R.id.image);
            textContainer=itemView.findViewById(R.id.text_container);
        }
    }
}
