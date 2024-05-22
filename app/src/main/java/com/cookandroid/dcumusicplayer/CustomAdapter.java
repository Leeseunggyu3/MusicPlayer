package com.cookandroid.dcumusicplayer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    private Context context;
    private String[] titles;
    private String[] artists;
    private String[] durations;
    private LayoutInflater inflater;

    public CustomAdapter(Context context, String[] titles, String[] artists, String[] durations) {
        this.context = context;
        this.titles = titles;
        this.artists = artists;
        this.durations = durations;
        this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return titles.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.list_item, parent, false);
        }

        ImageView imageView = convertView.findViewById(R.id.imageView);
        TextView textViewTitle = convertView.findViewById(R.id.textViewTitle);
        TextView textViewArtist = convertView.findViewById(R.id.textViewArtist);
        TextView textViewDuration = convertView.findViewById(R.id.textViewDuration);

        textViewTitle.setText(titles[position]);
        textViewArtist.setText(artists[position]);
        textViewDuration.setText(durations[position]);

        return convertView;
    }
}
