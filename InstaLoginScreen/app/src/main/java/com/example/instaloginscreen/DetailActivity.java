package com.example.instaloginscreen;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        String name = intent.getStringExtra("productName");
        String description = intent.getStringExtra("productDescription");
        double price = intent.getDoubleExtra("productPrice", 0.0);
        int imageResourceId = intent.getIntExtra("productImageResourceId", 0);
        String productPhoneNumber = intent.getStringExtra("productPhoneNumber");

        // Thiết lập dữ liệu cho các TextView/ImageView khác



        ImageView productImage = findViewById(R.id.product_detail_image);
        TextView productName = findViewById(R.id.product_detail_name);
        TextView productDescription = findViewById(R.id.product_detail_description);
        TextView productPrice = findViewById(R.id.product_detail_price);
        TextView phoneNumberTextView = findViewById(R.id.product_phone_number);
        phoneNumberTextView.setText("Phone: " + productPhoneNumber);

        phoneNumberTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:" + productPhoneNumber));
                startActivity(callIntent);
            }
        });

        productImage.setImageResource(imageResourceId);
        productName.setText(name);
        productDescription.setText(description);
        productPrice.setText("$" + price);





    }


}