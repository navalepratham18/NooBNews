package com.example.noobnews;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.squareup.picasso.Picasso;

public class NewsDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_detail);

        // Get the news item passed from MainActivity
        NewsItem newsItem = (NewsItem) getIntent().getSerializableExtra("newsItem");

        // Display the news details in the activity
        TextView titleTextView = findViewById(R.id.titleTextView);
        TextView descriptionTextView = findViewById(R.id.descriptionTextView);
        ImageView newsImageView = findViewById(R.id.newsImageView);

        titleTextView.setText(newsItem.getTitle());
        descriptionTextView.setText(newsItem.getDescription());

        // Load the news image using Picasso
        Picasso.get().load(newsItem.getImageUrl()).into(newsImageView);
    }
}
