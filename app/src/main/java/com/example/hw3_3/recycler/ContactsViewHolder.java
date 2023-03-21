package com.example.hw3_3.recycler;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hw3_3.R;

public class ContactsViewHolder extends RecyclerView.ViewHolder {
    ImageView imageView;
    TextView textView;
    ImageView imageViewtwo;
    TextView textVietwo;
    public ContactsViewHolder(@NonNull View itemView) {
        super(itemView);
    }
    public void OnBind(String contactname){
        imageView=itemView.findViewById(R.id.image_view);
        textView=itemView.findViewById(R.id.id_text);
        imageViewtwo=itemView.findViewById(R.id.image_view2);
        textView.setText(contactname);

    }
}
