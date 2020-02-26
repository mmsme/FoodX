package com.example.mohamedmustafa.foodapp.ViewHolder;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mohamedmustafa.foodapp.R;
import com.example.mohamedmustafa.foodapp.model.order;

import java.util.List;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.menuViewHolder> {
    List<order> orders;

    public RecycleViewAdapter(List<order> orders) {
        this.orders = orders;
    }


    @NonNull
    @Override
    public menuViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.home_card_view, viewGroup, false);
        menuViewHolder mvh = new menuViewHolder(view);
        return mvh;
    }

    @Override
    public void onBindViewHolder(@NonNull menuViewHolder holder, int i) {
        holder.orderTitle.setText(orders.get(i).getOrderTitle());
        holder.orderImg.setImageResource(orders.get(i).getImg());
        holder.orderDesc.setText(orders.get(i).getOrderDesc());
        holder.orderRate.setText(orders.get(i).getOrderRate());
        holder.orderPrice.setText(orders.get(i).getOrderPrice());
    }

    @Override
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public int getItemCount() {
        return orders.size();
    }

    public static class menuViewHolder extends RecyclerView.ViewHolder {
        CardView cardView;
        TextView orderTitle;
        TextView orderDesc;
        TextView orderRate;
        TextView orderPrice;
        ImageView orderImg;

        public menuViewHolder(@NonNull View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.home_card);
            orderTitle = itemView.findViewById(R.id.cardview_order_title);
            orderDesc = itemView.findViewById(R.id.cardview_order_desc);
            orderRate = itemView.findViewById(R.id.cardview_order_rate);
            orderPrice = itemView.findViewById(R.id.cardview_price);
            orderImg = itemView.findViewById(R.id.cardview_img);
        }
    }
}
