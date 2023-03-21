package com.example.hw3_3.recycler;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hw3_3.R;

import java.util.ArrayList;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsViewHolder> {
    ArrayList <String> arraListForAdapter;
    public ContactsAdapter(ArrayList<String> arrayList) {
        arraListForAdapter = arrayList;
    }

    @NonNull
    @Override
    public ContactsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContactsViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_contact, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContactsViewHolder holder, int position) {
        holder.OnBind(arraListForAdapter.get(position));
    }

    @Override
    public int getItemCount() {
        return arraListForAdapter.size();
    }
}
