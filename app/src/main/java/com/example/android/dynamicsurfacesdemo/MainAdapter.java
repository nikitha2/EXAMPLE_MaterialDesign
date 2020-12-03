package com.example.android.dynamicsurfacesdemo;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MainAdapter extends RecyclerView.Adapter {
    ListItemClickListener mClickListener;
    List<String> data;
    Context context;

    public MainAdapter(Context context, List<String> data, ListItemClickListener mClickListener) {
        this.data=data;
        this.context=context;
        this.mClickListener=mClickListener;
    }

    interface ListItemClickListener{
        void onListItemClick(int position);
    }

    class CustomViewHolder extends RecyclerView.ViewHolder implements  View.OnClickListener {
        View v;
        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            this.v=itemView;
            v.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int pos=getAdapterPosition();
            mClickListener.onListItemClick(pos);
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.listitems_main, parent, false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        View currentView = holder.itemView;
        String currentItemAtPos = data.get(position);
        TextView text_view= currentView.findViewById(R.id.text_view);
        text_view.setText(currentItemAtPos);

        Typeface fontType = Typeface.createFromAsset(context.getAssets(), "Roboto-Regular.ttf");
        text_view.setTypeface(fontType);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public void setData(List<String> data) {
        data.clear();
        data.addAll(data);
        notifyDataSetChanged();
    }
}
