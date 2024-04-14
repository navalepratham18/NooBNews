package com.example.noobnews;

// NewsListAdapter.java
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;

public class NewsListAdapter extends ArrayAdapter<NewsItem> {

    private Context mContext;
    private ArrayList<NewsItem> mNewsItems;

    public NewsListAdapter(Context context, ArrayList<NewsItem> newsItems) {
        super(context, 0, newsItems);
        mContext = context;
        mNewsItems = newsItems;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(mContext).inflate(R.layout.news_list_item, parent, false);
        }

        NewsItem currentNewsItem = mNewsItems.get(position);

        TextView titleTextView = listItemView.findViewById(R.id.titleTextView);
        titleTextView.setText(currentNewsItem.getTitle());

        ImageView newsImageView = listItemView.findViewById(R.id.newsImageView);
        Picasso.get().load(currentNewsItem.getImageUrl()).into(newsImageView);

        return listItemView;
    }
}

