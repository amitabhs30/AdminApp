package com.example.adminapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class AddProducts extends AppCompatActivity {

    private String CategoryName;
    private Button AddNewProductButton;
    private ImageView InputProductImage;
    private EditText InputProductName, InputProductDescription, InputproductPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_products);

        CategoryName = getIntent().getExtras().get("Category").toString();

        AddNewProductButton = findViewById(R.id.add_product_button);
        InputProductImage = findViewById(R.id.add_product_image);
        InputProductName = findViewById(R.id.add_product_name);
        InputProductDescription = findViewById(R.id.add_product_description);
        InputproductPrice = findViewById(R.id.add_product_price);

    }
}
