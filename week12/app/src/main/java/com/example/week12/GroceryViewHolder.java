package com.example.week12;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.week12.R;

public class GroceryViewHolder extends RecyclerView.ViewHolder {
    TextView groceryName;
    TextView groceryNote;
    public GroceryViewHolder(@NonNull View itemView) {
        super(itemView);
        groceryName = itemView.findViewById(R.id.textGroceryName);
        groceryNote = itemView.findViewById(R.id.textGroceryNote);
    }

    public TextView getGroceryName() {
        return groceryName;
    }

    public TextView getGroceryNote() {
        return groceryNote;
    }
}