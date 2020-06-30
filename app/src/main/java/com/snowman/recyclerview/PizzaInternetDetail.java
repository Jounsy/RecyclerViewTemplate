package com.snowman.recyclerview;

import android.os.Bundle;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class PizzaInternetDetail extends AppCompatActivity {
    public static final String EXTRA_PIZZA_LINK = "pizzaLINK";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pizza_internet_detail);
        String pizzaLINK = (String) getIntent().getExtras().get(EXTRA_PIZZA_LINK);
        WebView webView = findViewById(R.id.webView);
        webView.loadUrl(pizzaLINK);
    }
}
