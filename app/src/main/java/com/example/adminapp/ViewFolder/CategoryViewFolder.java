package com.example.adminapp.ViewFolder;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.adminapp.Interface.ItemClickListener;
import com.example.adminapp.R;

public class CategoryViewFolder extends RecyclerView.ViewHolder implements View.OnClickListener
{
    private TextView category_name, add_prod_text;

    private ImageView imageView1, imageView2;

    private ItemClickListener listener;

    private Button button;

    public CategoryViewFolder(@NonNull View itemView) {
        super(itemView);

        imageView1= itemView.findViewById(R.id.category_img);

        imageView2 = itemView.findViewById(R.id.add_prod_img);

        category_name = itemView.findViewById(R.id.category_name);

        add_prod_text = itemView.findViewById(R.id.add_prod_text);

    }

    public void setItemClickListener(ItemClickListener listener)

    {
        this.listener= listener;
    }


    @Override
    public void onClick(View v) {

        listener.onClick(v, getAdapterPosition(), false);

    }
}

