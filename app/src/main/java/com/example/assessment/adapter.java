package com.example.assessment;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.StringRes;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class adapter extends RecyclerView.Adapter<adapter.ViewHolder> {

    private List<museum> mData;
    private LayoutInflater mInflater;

    adapter(Context context, List<museum> data){
        this.mInflater = LayoutInflater.from(context);
        this.mData = data;
    }



    @NonNull
    @Override
    public adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.row_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        String name = mData.get(position).name;
        String desc = mData.get(position).description;
        holder.myTextView.setText(name);
        holder.myDescView.setText(desc);

        holder.myTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Details.class);
                intent.putExtra("selectedMuseum", mData.get(position).name);
                v.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView myTextView;
        TextView myDescView;
        ViewHolder(View v){
            super(v);
            myTextView = itemView.findViewById(R.id.itemText);
            myDescView = itemView.findViewById(R.id.descTxt);
        }


    }
}
