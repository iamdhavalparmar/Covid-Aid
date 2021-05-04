package com.covidaid.Adapters;

import android.content.Context;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.covidaid.Model.RequestData;
import com.covidaid.R;
import com.google.android.material.card.MaterialCardView;

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
        if(holder.need.getText().equals("Donor")){
            holder.blood_group.setVisibility(View.VISIBLE);
            holder.blood_group_text.setVisibility(View.VISIBLE);
        }
        holder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(holder.expand.getVisibility()== View.GONE){
                    TransitionManager.beginDelayedTransition(holder.cardView, new AutoTransition());
                    holder.expand.setVisibility(View.VISIBLE);
                    holder.button.setBackgroundResource(R.drawable.ic_baseline_keyboard_arrow_up_24);
                }else{
                    TransitionManager.beginDelayedTransition(holder.cardView, new AutoTransition());
                    holder.expand.setVisibility(View.GONE);
                    holder.button.setBackgroundResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return itemlist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView need,age,descirption,blood_group,gender,quantity,blood_group_text;
        ConstraintLayout expand;
        Button button;
        MaterialCardView cardView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
                blood_group_text = itemView.findViewById(R.id.bg);
                cardView = itemView.findViewById(R.id.cardview);
                button = itemView.findViewById(R.id.collapse);
                expand = itemView.findViewById(R.id.expand_details);
                need = itemView.findViewById(R.id.needdescription);
                age = itemView.findViewById(R.id.agedescr);
                descirption = itemView.findViewById(R.id.descriptiondescr);
                blood_group = itemView.findViewById(R.id.bgdescr);
                gender = itemView.findViewById(R.id.genderdescr);
                quantity = itemView.findViewById(R.id.quantitydescr);

        }
    }
}
