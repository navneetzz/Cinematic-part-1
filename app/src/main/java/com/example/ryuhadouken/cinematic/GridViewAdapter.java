package com.example.ryuhadouken.cinematic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

/**
 * Created by ryuhadouken on 30/4/16.
 */
public class GridViewAdapter extends android.widget.ArrayAdapter<MovieObj> {
    private Context context;
    private ArrayList<MovieObj> movies= new ArrayList<>();

    public GridViewAdapter(Context context, ArrayList<MovieObj> mArrayList) {
        super(context, R.layout.grid_item);
        this.context=context;
        this.movies=mArrayList;
    }

    @Override
    public MovieObj getItem(int position) {
        return movies.get(position);
    }

    @Override
    public int getCount() {
        if (movies == null) {
            return 0;
        } else return movies.size();
    }

    @Override
    public int getPosition(MovieObj item) {
        return movies.indexOf(item);
    }

    private static class ViewHolder {
        ImageView posterView;
        TextView title;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        LayoutInflater inflater = LayoutInflater.from(context);
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.grid_item, null);
            holder = new ViewHolder();
            holder.posterView = (ImageView) convertView.findViewById(R.id.grid_image);
            holder.posterView.setMinimumHeight(holder.posterView.getWidth()*3/2);
            convertView.setTag(holder);
        } else holder = (ViewHolder) convertView.getTag();

        MovieObj movie = movies.get(position);
        Glide.with(context).load(movie.getPosterUrl())
                .placeholder(R.drawable.ic_photo_white_24px)
                .error(R.drawable.ic_photo_white_24px)
                .crossFade(500)
                .into(holder.posterView);
        return convertView;
    }
}
