package com.covidaid.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.covidaid.Model.RequestData;
import com.covidaid.R;

import java.util.List;

public class RequestAdapter extends RecyclerView.Adapter<RequestAdapter.ViewHolder> {
    List itemlist;
    Context context;

    public RequestAdapter(List itemlist, Context context) {
        this.itemlist = itemlist;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.request_raw,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        RequestData data = (RequestData) itemlist.get(position);
        holder.need.setText(data.getNeed());
        holder.age.setText(data.getAge());
        holder.descirption.setText(data.getDescription());
        holder.blood_group.setText(data.getBlood_group());
        holder.gender.setText(data.getGender());
        holder.quantity.setText(data.getQuantity());
    }

    @Override
    public int getItemCount() {
        return itemlist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView need,age,descirption,blood_group,gender,quantity;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
                need = itemView.findViewById(R.id.needdescription);
                age = itemView.findViewById(R.id.agedescr);
                descirption = itemView.findViewById(R.id.descriptiondescr);
                blood_group = itemView.findViewById(R.id.bgdescr);
                gender = itemView.findViewById(R.id.genderdescr);
                quantity = itemView.findViewById(R.id.quantitydescr);

        }
    }
}
