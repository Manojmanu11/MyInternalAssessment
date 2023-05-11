package com.example.myhw;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.shape.Shapeable;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    Context context;
    ArrayList<items_list> items_listArrayList;
    private OnClickListener onClickListener;

    public MyAdapter(Context context,ArrayList<items_list> items_listArrayList) {
        this.context=context;
        this.items_listArrayList=items_listArrayList;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.items_list,parent,false);


        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        items_list itemsList=items_listArrayList.get(position);
        holder.flowername.setText(itemsList.getFlower());
        holder.description.setText(itemsList.getDescription());
        holder.imageView.setImageResource(itemsList.getImage());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(context,Details.class);
                intent1.putExtra("imagename",itemsList.getImage());
                intent1.putExtra("name",itemsList.getFlower());
                intent1.putExtra("decription",itemsList.getDescription());
                intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent1);

            }
        });

    }


    @Override
    public int getItemCount() {
        return items_listArrayList.size();
    }
    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public interface OnClickListener {
        void onClick(int position, items_list model);
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

       ImageView imageView;
        TextView flowername,description;

        public MyViewHolder(@NonNull View itemView) {

            super(itemView);
            imageView=itemView.findViewById(R.id.imageview);
            flowername= itemView.findViewById(R.id.flowername);
            description=itemView.findViewById(R.id.description);

        }
    }
}
