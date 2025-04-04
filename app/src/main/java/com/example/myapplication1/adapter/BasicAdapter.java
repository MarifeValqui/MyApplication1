package com.example.myapplication1.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication1.R;

import java.util.List;

public class BasicAdapter extends RecyclerView.Adapter<BasicAdapter.BasicViewHolder>{
    private List<String> data;
    public BasicAdapter(List<String> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public BasicViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_basic, parent, false);
        return new BasicViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BasicViewHolder holder, int position) {
        TextView tvText = holder.itemView.findViewById(R.id.tvText);
        String text = data.get(position);
        tvText.setText(text);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }//<> Conocido como tipo genérico = List<String>//<Integer>

    public class BasicViewHolder extends RecyclerView.ViewHolder{
        public BasicViewHolder(@NonNull View itemView){
            super(itemView);
 }
}
}

