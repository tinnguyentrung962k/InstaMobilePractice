package com.example.instaloginscreen;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.search.SearchView;

import java.util.List;
import java.util.ArrayList;

public class Home extends AppCompatActivity {
    private TextView textViewWelcome;
    private Button buttonClose;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);

        textViewWelcome = findViewById(R.id.textViewWelcome);
        buttonClose = findViewById(R.id.buttonClose);

        // Get the name from the Intent
        Intent intent = getIntent();
        String name = intent.getStringExtra("USER_NAME");
        textViewWelcome.setText("Welcome, " + name);

        buttonClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Close the application
            }
        });









//
        List<Product> productList = new ArrayList<>();
        // Add sample products to the list
        productList.add(new Product("Samsung M34", "Samsung M34", 20.0, R.drawable.one, "078-2560-250"));
        productList.add(new Product("Samsung GalaxyS23", "Samsung GalaxyS23 Ultra", 20.0, R.drawable.two,"078-2560-250"));
        productList.add(new Product("IPhone 15", "IPhone 15", 20.0, R.drawable.three,"078-2560-250"));
        productList.add(new Product("Samsung M34", "Samsung M34", 20.0, R.drawable.one,"078-2560-250"));
        productList.add(new Product("Samsung GalaxyS23", "Samsung GalaxyS23 Ultra", 20.0, R.drawable.two,"078-2560-250"));
        productList.add(new Product("IPhone 15", "IPhone 15", 20.0, R.drawable.three,"078-2560-250"));
        productList.add(new Product("IPhone 15", "IPhone 15", 20.0, R.drawable.three,"078-2560-250"));
        productList.add(new Product("IPhone 15", "IPhone 15", 20.0, R.drawable.three,"078-2560-250"));
        productList.add(new Product("IPhone 15", "IPhone 15", 20.0, R.drawable.three,"078-2560-250"));
        productList.add(new Product("IPhone 15", "IPhone 15", 20.0, R.drawable.three,"078-2560-250"));
        productList.add(new Product("IPhone 15", "IPhone 15", 20.0, R.drawable.three,"078-2560-250"));
        productList.add(new Product("IPhone 15", "IPhone 15", 20.0, R.drawable.three,"078-2560-250"));
        productList.add(new Product("IPhone 15", "IPhone 15", 20.0, R.drawable.three,"078-2560-250"));
        productList.add(new Product("IPhone 15", "IPhone 15", 20.0, R.drawable.three,"078-2560-250"));
        productList.add(new Product("IPhone 15", "IPhone 15", 20.0, R.drawable.three,"078-2560-250"));
// Binding
        recyclerView = findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(this);
        adapter = new ProductAdapter(productList, this);
//Important code

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Thiết lập tiêu đề cho Toolbar
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Home Page"); // Đặt tiêu đề
        }
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);






    }

//    Menu


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);

        // Thiết lập SearchView
//        MenuItem searchItem = menu.findItem(R.id.action_search);
//        SearchView searchView = (SearchView) searchItem.getActionView();
//        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
//            @Override
//            public boolean onQueryTextSubmit(String query) {
//                // Xử lý khi người dùng nhấn nút tìm kiếm
//                Toast.makeText(HomeActivity.this, "Search: " + query, Toast.LENGTH_SHORT).show();
//                return false;
//            }
//
//            @Override
//            public boolean onQueryTextChange(String newText) {
//                // Xử lý khi văn bản tìm kiếm thay đổi
//                return false;
//            }
//        });

        return true;
    }

//
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Xử lý các sự kiện click vào mục menu
        int id = item.getItemId();
        if (id == R.id.action_cart) {
            Toast.makeText(this, "Cart selected", Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }






}