package com.example.amr.demoretrofit;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.MyViewHolder> {

    private List<Story> itemsEntities;
    private Context context;


    public DataAdapter(Context context, List<Story> itemsEntities) {
        this.itemsEntities = itemsEntities;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.each_row_item, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(DataAdapter.MyViewHolder holder, int position) {

        final DataAdapter.MyViewHolder holder1 = holder;

        holder1.title.setText(itemsEntities.get(position).getTitle());
        holder1.year.setText(itemsEntities.get(position).getPublished_date());
        Picasso.with(context).load(itemsEntities.get(position).getImageurl()).into(holder1.img);

    }

    @Override
    public int getItemCount() {
        return itemsEntities.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, year;
        public ImageView img;

        public MyViewHolder(View view) {
            super(view);
            img = (ImageView) view.findViewById(R.id.imagevi);
            title = (TextView) view.findViewById(R.id.title);
            year = (TextView) view.findViewById(R.id.published);
        }
    }

}
