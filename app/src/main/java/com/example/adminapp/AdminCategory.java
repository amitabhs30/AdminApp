package com.example.adminapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class AdminCategory extends AppCompatActivity {

    private LinearLayout linearLayout1, linearLayout2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

        linearLayout1 = findViewById(R.id.add_product_selfie);



        linearLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategory.this, AddProducts.class);
                intent.putExtra("Category", "AR Selfie ");
                startActivity(intent);
            }
        });

//        linearLayout2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(AdminCategory.this, AddProducts.class);
//                intent.putExtra("Category", "AR Card ");
//                startActivity(intent);
//            }
//        });
    }

}
